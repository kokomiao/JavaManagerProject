package com.zm.manager.daodbproxy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InvalidPropertiesFormatException;
import java.util.List;
import java.util.Properties;

import com.zm.manager.dao.IPersonDAO;
import com.zm.manager.dao.dbimpl.IPersonDAOImpl;
import com.zm.manager.dbc.DatabaseConnection;
import com.zm.manager.vo.Person;

public class IPersonDAOProxy implements IPersonDAO {
	private IPersonDAO dao = null;
	private DatabaseConnection dbc = null ;
	private Properties pro; //所有属性资源
	
	public IPersonDAOProxy(){
		this.init();
		this.dbc = new DatabaseConnection(this.pro);
		this.dao = new IPersonDAOImpl(this.dbc.getConnection());
	}
	
	public void init(){
		this.pro = new Properties();
	
			try {
				this.pro.loadFromXML(new FileInputStream(new File(new File(".").getCanonicalPath()
						+File.separator+"manager.xml")));
			} catch (InvalidPropertiesFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
	}
	
	
	
	@Override
	public boolean doCreate(Person person) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean doUpdate(Person person) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean doDelete(int pid, int type) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List findAll(String KeyWord) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
