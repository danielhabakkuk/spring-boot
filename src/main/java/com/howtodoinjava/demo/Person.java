/**
 * 
 */
package com.howtodoinjava.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


/**
 * @author daniel habakkuk
 *
 */
@Entity
public class Person {

	public Integer rollno;
	public String name;
	public String dept;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Integer getRollno() {
		return rollno;
	}
	public void setRollno(Integer rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	
}
