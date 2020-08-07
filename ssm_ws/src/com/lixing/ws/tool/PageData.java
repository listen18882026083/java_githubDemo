package com.lixing.ws.tool;

import java.io.Serializable;

//封装分页JSON数据的封装类
public class PageData implements Serializable {
	private static final long serialVersionUID = 1L;
	private  String code="0";// 返回数据的状态码。默认为：0
	private  String msg="msg"; //状态信息的字段名称，默认为：msg
	private String count; //数据的总条数
	private Object data;//存放数据集合
	public PageData(){}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCode() {
		return code;
	}
	public String getMsg() {
		return msg;
	}
	public String getCount() {
		return count;
	}
	public void setCount(String count) {
		this.count = count;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}

}
