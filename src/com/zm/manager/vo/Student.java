package com.zm.manager.vo;

public class Student extends Person {
	private float score;

	public Student(){
		
	}
	
	public Student(String name,int age , float score){
		super(name,age);
		this.setScore(score);
	}
	public float getScore() {
		return score;
	}
	public void setScore(float score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "������"+super.getName()+"\t���䣺"+super.getAge()+"\t������"+this.getScore();
	}

	@Override
	public int getType() {
		return 1;
	}
	

}
