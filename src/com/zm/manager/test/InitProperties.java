package com.zm.manager.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class InitProperties {
	//生成properties屬性文件
	public static void main(String[] args) {
		Properties pro =  new Properties();
		pro.setProperty("operate", "jdbc");
		pro.setProperty("dbuser", "root");
		pro.setProperty("dbpass", "123456");
		pro.setProperty("dbdriver","com.mysql.jdbc.Driver");
		pro.setProperty("dburl","jdbc:mysql://192.168.2.93:3306/mldn");
		
		pro.setProperty("workerinfo", "d:\\work.info");
		pro.setProperty("studentinfo", "d:\\student.info");
		
		try {// new File(".").getCanonicalPath() 当前工程目录下
			pro.storeToXML(new FileOutputStream(new File(new File(".").getCanonicalPath()+File.separator+"manager.xml")), "school Manager");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
