package com.zm.manager.dao;

import java.util.List;

import com.zm.manager.vo.Person;

public interface IPersonDAO {
	public boolean doCreate(Person person)throws Exception ;
	
	public boolean doUpdate(Person person)throws Exception ;
	
	public boolean doDelete(int pid,int type)throws Exception ;
	
	public List findAll(String KeyWord) throws Exception;
}
