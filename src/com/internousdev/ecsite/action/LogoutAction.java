package com.internousdev.ecsite.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class LogoutAction extends ActionSupport implements SessionAware {

	private Map<String, Object>session;

	public String execute() {
		session.clear();                                                                                                            //  セッションに入ってるデータログインや購入のデータ）を削除する。＊データベースの中のデータを削除するわけではないのでまたログインできるし、ログインすれば購入データもみれる。
		return SUCCESS;
	}

	public Map<String, Object> getSession() {
		return this.session;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}



}
