package com.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configuration {
	
	public static Properties p;
	
	public Configuration() throws IOException {
	File f = new File("C:\\Users\\god\\eclipse-workspace\\newWorkspaces\\MMT\\src\\main\\java\\com\\properties\\mmt.properties");
	FileInputStream fis = new FileInputStream(f);
	p = new Properties();
	p.load(fis);
}
	public String getUrl() {
		String url = p.getProperty("url");
		return url;
	}
	public String getUsername() {
		String username = p.getProperty("username");
		return username;
}
	public String getfname() {
		String fname = p.getProperty("fname");
		return fname;
	}
	public String getlname() {
		String lname = p.getProperty("lname");
		return lname;
	}
	public String getemail() {
		String email = p.getProperty("email");
		return email;
	}
	public String getmobile() {
		String mobile = p.getProperty("mobile");
		return mobile;
	}
}