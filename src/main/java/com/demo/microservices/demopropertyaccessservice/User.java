package com.demo.microservices.demopropertyaccessservice;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class User {

	@Value("${user.fb.name:defaultUser}")
	private String fbUSer;
	@Value("${user.fb.password}")
	private String fbPassword;
	@Value("${user.gmail.name}")
	private String gmailUser;
	@Value("${user.gmail.password}")
	private String gmailPassword;

	@Value("#{'${list}'.split(',')}")
	private List<String> listOfItem;
	
	@Value("${list}")
	private List<String> arrayVal;
	
	@Value("#{${values.map}}")
	private Map<String, Integer> mapValue;
	
	@Value("#{systemProperties}")
	private Map<String, String> systemProps;

	public String getFbUSer() {
		return fbUSer;
	}

	public void setFbUSer(String fbUSer) {
		this.fbUSer = fbUSer;
	}

	public String getFbPassword() {
		return fbPassword;
	}

	public void setFbPassword(String fbPassword) {
		this.fbPassword = fbPassword;
	}

	public String getGmailUser() {
		return gmailUser;
	}

	public void setGmailUser(String gmailUser) {
		this.gmailUser = gmailUser;
	}

	public String getGmailPassword() {
		return gmailPassword;
	}

	public void setGmailPassword(String gmailPassword) {
		this.gmailPassword = gmailPassword;
	}

	public List<String> getListOfItem() {
		return listOfItem;
	}

	public void setListOfItem(List<String> listOfItem) {
		this.listOfItem = listOfItem;
	}

	public List<String> getArrayVal() {
		return arrayVal;
	}

	public void setArrayVal(List<String> arrayVal) {
		this.arrayVal = arrayVal;
	}

	public Map<String, Integer> getMapValue() {
		return mapValue;
	}

	public void setMapValue(Map<String, Integer> mapValue) {
		this.mapValue = mapValue;
	}

	public Map<String, String> getSystemProps() {
		return systemProps;
	}

	public void setSystemProps(Map<String, String> systemProps) {
		this.systemProps = systemProps;
	}

	@Override
	public String toString() {
		return "User [fbUSer=" + fbUSer + ", fbPassword=" + fbPassword + ", gmailUser=" + gmailUser + ", gmailPassword="
				+ gmailPassword + ", listOfItem=" + listOfItem + ", arrayVal=" + arrayVal + ", mapValue=" + mapValue
				+ "]";
	}
	
	
	
}
