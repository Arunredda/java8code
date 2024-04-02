package com.samples;

import java.util.Comparator;

public class Employe  /*Comparable<Employe>*/ implements Comparator<Employe>{
	
	
	
	
	
	
	private int id;
	private String name;
	private String emailId;

	private int age;
	/*
	 * @Override public int compareTo(Employe o) { // TODO Auto-generated method
	 * stub
	 * 
	 * if(this.age>o.getAge()) { return 1; } else if(this.age==o.getAge()) { return
	 * 0; } else { return -1; }
	 * 
	 * }
	 */
	
	


Employe(int id, String name, String emailId, int age){
	this.id=id;
	this.name=name;
	this.emailId=emailId;
	this.age=age;
	
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmailId() {
	return emailId;
}
public void setEmailId(String emailId) {
	this.emailId = emailId;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}



@Override
public int compare(Employe o1, Employe o2) {
	// TODO Auto-generated method stub
	return o2.getName().compareTo(o1.getName());
}





}
