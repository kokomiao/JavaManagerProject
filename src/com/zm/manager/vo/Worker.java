package com.zm.manager.vo;

public class Worker extends Person {
	private float salary;
	
	public Worker(){
		
	}
	public Worker(String name,int age ,float salary){
		super(name,age);
		this.salary = salary;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "������"+super.getName()+"\t���䣺"+super.getAge()+"\t���ʣ�"+this.getSalary();
	}
	@Override
	public int getType() {
		// TODO Auto-generated method stub
		return 2;
	}
}
