package com.lixing.ws.tool;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import org.springframework.web.multipart.MultipartFile;

public class FileTool {

		//提取上传保存的方法
		public static String uplodeImg(MultipartFile file) throws IllegalStateException, IOException{
			//第一步：设置图片上传的名字不能重复
			String name=UUID.randomUUID().toString();
			//获取文件名
			String ysName=file.getOriginalFilename();
			//回去后缀名
			String extName=ysName.substring(ysName.indexOf("."));
			//组成新的图片名
			String reName=name+extName;
			//上传
			file.transferTo(new File("e:\\images\\"+reName));
			return reName;
		}
		
		//图片删除方法
		public static boolean  deleteFile(String name){
			boolean bool=false;
			File file=new File("e:\\images\\"+name);
			if(file.exists() && file.isFile()){ //如果文件路径所对应的文件存在，并且是一个文件，则直接删除
				bool=file.delete();
			}
			return bool;
		}
}
