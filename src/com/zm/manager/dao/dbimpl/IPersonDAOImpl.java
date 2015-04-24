package com.zm.manager.dao.dbimpl;

import java.sql.Connection;
import java.util.List;

import com.zm.manager.dao.IPersonDAO;
import com.zm.manager.vo.Person;

public class IPersonDAOImpl implements IPersonDAO {
	public Connection conn =null;
	
	public IPersonDAOImpl(Connection conn) {
		this.conn = conn;
	}

	@Override
	public boolean doCreate(Person person) throws Exception {
		String sql = null;
		if(person.getType()==1){
//			sql = "INSE"
		}
		if(person.getType()==2){
			
		}
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
