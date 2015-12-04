package com.freeplay.tta.action;

import com.freeplay.tta.func.FDate;
import com.opensymphony.xwork2.ActionSupport;

public class SearchAction extends ActionSupport{

	private String tdate;
	private String bdate;
	
	public String execute() throws Exception {
		bdate = FDate.getBDate(tdate);
		return SUCCESS;
	} 
	
	public String getTdate() {
		return tdate;
	}

	public void setTdate(String tdate) {
		this.tdate = tdate;
	}

	public String getBdate() {
		return bdate;
	}

	public void setBdate(String bdate) {
		this.bdate = bdate;
	}
	
	
	
}
