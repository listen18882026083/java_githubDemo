package com.lixing.ws.tool;

public class PageSearch {

	private Integer page;
	private Integer limit;
	/*
	 * 客户检索中：需要客户姓名
	 * */
	private String name;
	//客户检索里面需要的微信号和微信名称字段查询
	private String wechat;
	private String wechatNetname;
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public Integer getLimit() {
		return limit;
	}
	public void setLimit(Integer limit) {
		this.limit = limit;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWechat() {
		return wechat;
	}
	public void setWechat(String wechat) {
		this.wechat = wechat;
	}
	public String getWechatNetname() {
		return wechatNetname;
	}
	public void setWechatNetname(String wechatNetname) {
		this.wechatNetname = wechatNetname;
	}
	
	
}
