package com.java;

import java.util.HashMap;
import java.util.List;

import com.java.dao.BoardDao;
import com.opensymphony.xwork2.Action;

public class TestAction implements Action {

	private String text;
	public String getText() {
		return text;
	}
	
	private List<HashMap<String, Object>> list;
	private BoardDao Bdao;
	public List<HashMap<String, Object>> getList() {
		return list;
	}

	@Override
	public String execute() throws Exception {
		System.out.println("execute()");
		text = "execute";
		Bdao = new BoardDao();
		list = Bdao.selectBoard();
		return SUCCESS;
	}
	
	public String execute2() throws Exception {
		System.out.println("execute2()");
		text = "execute2";
		return SUCCESS;
	}
	
	public String execute3() throws Exception {
		System.out.println("execute3()");
		text = "execute3";
		return SUCCESS;
	}
	
	public String execute4() throws Exception {
		System.out.println("execute4()");
		text = "execute4";
		return SUCCESS;
	}

}
