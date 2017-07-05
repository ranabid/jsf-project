package com.example.jsf.bean;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean(name="homeBean")
public class HomeBean {
	private String fileName;
	
	public String setModelView() {
		System.out.println("Inside setModelView method");
		FacesContext fc = FacesContext.getCurrentInstance();
		Map<String, String> params = fc.getExternalContext().getRequestParameterMap();
		this.fileName = params.get("fileName");
		System.out.println("File name: "+fileName);
		return "success";
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	

}
