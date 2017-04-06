package com.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.java.dao.AdminDao;
import com.opensymphony.xwork2.Action;

public class AdminAction implements Action {

	List<HashMap<String, Object>> userList, authList, mappingList;
	public List<HashMap<String, Object>> getUserList() {
		return userList;
	}
	public List<HashMap<String, Object>> getAuthList() {
		return authList;
	}
	public List<HashMap<String, Object>> getMappingList() {
		return mappingList;
	}
	String userId;
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	@Override
	public String execute() throws Exception {
		AdminDao aDao = new AdminDao();
		userList = new ArrayList<HashMap<String, Object>>();
		authList = new ArrayList<HashMap<String, Object>>();
		userList = aDao.selectUsers();
		authList = aDao.selectAuths();
		return SUCCESS;
	}
	public String mapping() throws Exception {
		AdminDao aDao = new AdminDao();
		mappingList = new ArrayList<HashMap<String, Object>>();
		mappingList = aDao.selectMappings(userId);
		return SUCCESS;
	}

}
