package com.internous.ecsite.model.form;

import java.io.Serializable;

public class HistoryForm implements Serializable {
	public static final long serialVersionUID = 1L;
	
	private String userId;
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
}
