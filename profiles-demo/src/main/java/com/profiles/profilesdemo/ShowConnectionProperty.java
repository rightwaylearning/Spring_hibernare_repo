package com.profiles.profilesdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("application.properties")
public class ShowConnectionProperty {
    
	@Value("${url}")
	private String url;
	
	@Value("${username}")
	private String userName;
	
	@Value("${password}")
	private String password;
	
	@Value("${dbname}")
	private String dbName;
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDbName() {
		return dbName;
	}
	public void setDbName(String dbName) {
		this.dbName = dbName;
	}
	@Override
	public String toString() {
		return "ShowConnectionProperty [url=" + url + ", userName=" + userName + ", password=" + password + ", dbName="
				+ dbName + "]";
	}
	
}
