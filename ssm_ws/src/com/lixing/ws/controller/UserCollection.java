package com.lixing.ws.controller;

import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import com.lixing.ws.pojo.TbUserinfo;
import com.lixing.ws.service.UserInfoService;
import com.lixing.ws.tool.FileTool;
import com.lixing.ws.tool.PageData;
import com.lixing.ws.tool.Upload;

@Controller
@RequestMapping("/user")
public class UserCollection {

	@Autowired
	private UserInfoService userService;
	
	
	//验证用户名是否注册
	@RequestMapping("/checkUserName.action")
	public  @ResponseBody String checkUserName(String username){
		return userService.queryCheckUserName(username);
	}
	
	/**
	 *   管理员用户信息列表
	 * */
	@RequestMapping("/list.action")
	public @ResponseBody PageData  userList(Integer page,Integer limit,String username){
		TbUserinfo userInfo=new TbUserinfo();
		if(username!=null){
			userInfo.setUsername(username);
		}
		return userService.queryList(page, limit,userInfo);
	}
	//添加用户  0代表用户名被占用  1 代表保存过成功 2 保存失败
	@RequestMapping("/save.action")
	public @ResponseBody int  saveUserInfo(@RequestBody TbUserinfo userInfo) {
		int num=0;
		String user=userService.queryCheckUserName(userInfo.getUsername());
		if(!user.equals("1") && user!="1"){
			userService.insertTbUserinfo(userInfo);
			num=1;
		}
		return num;
		
	}
	
	@RequestMapping("/uploadPic.action")
	public @ResponseBody Upload  uploadPic(@RequestParam("file") MultipartFile image) {
		Upload up=new Upload();
		up.setCode("0");
		try {
			String name=FileTool.uplodeImg(image);
			if(name!=null && name!="" ){
				up.setCode("1");
				up.setName(name);;
			}
		} catch (Exception e) {
			up.setCode("2");
			e.printStackTrace();	
		}
		return up;
	}
	
	
	//跳转到编辑页面  根据ID查询出需要编辑的信息
	@RequestMapping("/editUserInfo.action")
	public ModelAndView editUserInfo(Integer id){
		ModelAndView mv=new ModelAndView();
		TbUserinfo userInfo=userService.queryById(id);
		mv.setViewName("/user/edit");
		mv.addObject("userInfo", userInfo);
		return mv;
	}
	
	//修改页面，点击【保存】按钮执行方法
	@RequestMapping("/edit.action")
	@ResponseBody
	public String edit(@RequestBody TbUserinfo userInfo){
		String code="0"; //失败
		int num=userService.update(userInfo);
		if(num>0){
			code="1"; //成功
		}
		return code;
	}
	
	//删除方法，根据ID删除，单个ID和多个ID删除都是此方法
	//注意ajax传的是数组，必须要定义@RequestParam值是数组才能回去到参数
	@RequestMapping("/deleteByIds.action")
	@ResponseBody
	public int deleteByIds(@RequestParam(value = "ids[]") Integer[] ids){
		System.out.println("删除方法....");
		System.out.println(ids.length);
		int i=userService.deleteById(ids);
		return i;
	}
	
	//用户退出方法
	@RequestMapping("/loginOut.action")
	public String loginOut(HttpSession session){
		session.removeAttribute("USER");
		session.removeAttribute("USER_NAME");
		return "redirect:/login.jsp";
	}
	
	//删除图片方法
	@RequestMapping("/deleteImg")
	@ResponseBody
	public String deleteImg(String imgName){
		boolean bool=false;
		String str="0";
		if(imgName!=null && !imgName.equals("")){
			bool=FileTool.deleteFile(imgName);
		}
		if(bool){
			str="1";
		}
		return str;
	}
	
	/**
	 * 重置密码方法
	 * */
	@RequestMapping("/resetPwdByIds")
	@ResponseBody
	public String resetPwdByIds(@RequestParam(value = "ids[]") Integer[] ids){
		return userService.updateResetPwd(ids)+"";
	}
	
	/**
	 * 
	 * index.jsp页面跳转后，里面再跳转用户列表页面跳转
	 * */
	
	@RequestMapping("/returnUserList.action")
	public  String returnUserList(String username){
		return "user/list";
		
	}
	
	//登陆成功后，跳转到后台的index.jsp页面
	@RequestMapping("/returnIndex.action")
	public String returnIndex(){
		return "index";
	}
	
	//跳转用户添加页面
	@RequestMapping("/returnAddUser.action")
	public String returnAddUser(){
		return "user/add";
	}
}
