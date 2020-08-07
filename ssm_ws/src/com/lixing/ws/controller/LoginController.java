package com.lixing.ws.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lixing.ws.pojo.TbUserinfo;
import com.lixing.ws.service.UserInfoService;
import com.lixing.ws.tool.GeetestConfig;
import com.lixing.ws.tool.GeetestLib;


@Controller
@RequestMapping("login")
public class LoginController {
	@Autowired
	private UserInfoService userService;
	
	@RequestMapping("/onLogin")
	public String sendLogin(){
		return "login";
	}
	
		//用户登陆页面,此用户登陆，主要是验证码输入
	@RequestMapping("/login3.action")
		public @ResponseBody String login3(String username,String password,String code,HttpSession session){
			TbUserinfo userInfo=userService.queryLogin(username, password);
			//把所有的字母转换为大写
			code=code.toUpperCase();
			//获取session中的验证码的值
			String sessionCode=(String)session.getAttribute("code").toString();
			if(!code.equals(sessionCode)){
				return "3";//您输入的验证码不正确
			}
			if(userInfo!=null){
				session.setAttribute("USER", userInfo);
				session.setAttribute("USER_NAME", userInfo.getUsername());
				System.out.println("登陆成功");
				return "1"; //登陆用户成功
			}
			System.out.println("登陆失败");
			return "2"; //用户不存在
		}
		
	
	//用户登陆页面,此用户登陆，没有验证码
	@RequestMapping("/login4.action")
		public @ResponseBody String login4(String username,String password,HttpSession session){
			TbUserinfo userInfo=userService.queryLogin(username, password);
			if(userInfo!=null){
				session.setAttribute("USER", userInfo);
				session.setAttribute("USER_NAME", userInfo.getUsername());
				System.out.println("登陆成功");
				return "1"; //登陆用户成功
			}
			System.out.println("登陆失败");
			return "2"; //用户不存在
		}
	//此登陆方法，是不需要去验证是否拖动验证了、
	@RequestMapping("/login2.action")
	public @ResponseBody String login(String username,String password,String code,HttpSession session){
		TbUserinfo userInfo=userService.queryLogin(username, password);
		if(userInfo!=null){
			session.setAttribute("USER", userInfo);
			session.setAttribute("USER_NAME", userInfo.getUsername());
			System.out.println("登陆成功");
			return "1"; //登陆用户成功
		}
		System.out.println("登陆失败");
		return "2"; //用户不存在
	}
		//用户登陆方法，此登陆主要是用户拖动验证
		@RequestMapping("/login.action")
		public @ResponseBody String  login(HttpServletRequest request,String username,String password,
				String geetest_challenge,String geetest_validate ,String geetest_seccode){
			
			GeetestLib gtSdk = new GeetestLib(GeetestConfig.getGeetest_id(), GeetestConfig.getGeetest_key(), 
					GeetestConfig.isnewfailback());
			//从session中获取gt-server状态
			int gt_server_status_code = (Integer) request.getSession().getAttribute(gtSdk.gtServerStatusSessionKey);
			//从session中获取userid
			String userid = (String)request.getSession().getAttribute("userid");
			//自定义参数,可选择添加
			HashMap<String, String> param = new HashMap<String, String>(); 
			param.put("user_id", userid); //网站用户id
			param.put("client_type", "web"); //web:电脑上的浏览器；h5:手机上的浏览器，包括移动应用内完全内置的web_view；native：通过原生SDK植入APP应用的方式
			param.put("ip_address", "127.0.0.1"); //传输用户请求验证时所携带的IP
			int gtResult = 0;
			if (gt_server_status_code == 1) {
				gtResult = gtSdk.enhencedValidateRequest(geetest_challenge, geetest_validate, geetest_seccode, param);
			} else {
				gtResult = gtSdk.failbackValidateRequest(geetest_challenge, geetest_validate, geetest_seccode);
				
			}
			if (gtResult == 1) {
				// 验证成功
				TbUserinfo userInfo=userService.queryLogin(username, password);
				if(userInfo!=null){
					request.getSession().setAttribute("USER", userInfo);
					request.getSession().setAttribute("USER_NAME", userInfo.getUsername());	
					return "1"; //登陆用户成功
				}else{
					return "2"; //用户不存在
				}
			}
			else {
				// 验证失败
				return "3";
			}
			
		}
		//开始拖动验证方法：
		@RequestMapping("/startCaptcha.action")
		public void startCaptcha(HttpServletRequest request,HttpServletResponse response) throws IOException{
			GeetestLib gtSdk = new GeetestLib(GeetestConfig.getGeetest_id(), GeetestConfig.getGeetest_key(), 
					GeetestConfig.isnewfailback());
			String resStr = "{}";
			//自定义userid
			String userid = "xingzi";
			
			//自定义参数,可选择添加
			HashMap<String, String> param = new HashMap<String, String>(); 
			param.put("user_id", userid); //网站用户id
			param.put("client_type", "web"); //web:电脑上的浏览器；h5:手机上的浏览器，包括移动应用内完全内置的web_view；native：通过原生SDK植入APP应用的方式
			param.put("ip_address", "127.0.0.1"); //传输用户请求验证时所携带的IP

			//进行验证预处理
			int gtServerStatus = gtSdk.preProcess(param);
			
			//将服务器状态设置到session中
			request.getSession().setAttribute(gtSdk.gtServerStatusSessionKey, gtServerStatus);
			//将userid设置到session中
			request.getSession().setAttribute("userid", userid);
			
			resStr = gtSdk.getResponseStr();

			PrintWriter out = response.getWriter();
			out.println(resStr);
		}
}
