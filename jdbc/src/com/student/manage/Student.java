package com.student.manage;

public class Student {
	private int stud_id;
	private String stud_name;
	private String stud_div;
	private String stud_cgpa;
	
	public Student(int stud_id, String stud_name, String stud_div, String stud_cgpa) {
		super();
		this.stud_id = stud_id;
		this.stud_name = stud_name;
		this.stud_div = stud_div;
		this.stud_cgpa = stud_cgpa;
	}

	public Student(String stud_name, String stud_div, String stud_cgpa) {
		super();
		this.stud_name = stud_name;
		this.stud_div = stud_div;
		this.stud_cgpa = stud_cgpa;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getStud_id() {
		return stud_id;
	}

	public void setStud_id(int stud_id) {
		this.stud_id = stud_id;
	}

	public String getStud_name() {
		return stud_name;
	}

	public void setStud_name(String stud_name) {
		this.stud_name = stud_name;
	}

	public String getStud_div() {
		return stud_div;
	}

	public void setStud_div(String stud_div) {
		this.stud_div = stud_div;
	}

	public String getStud_cgpa() {
		return stud_cgpa;
	}

	public void setStud_cgpa(String stud_cgpa) {
		this.stud_cgpa = stud_cgpa;
	}

	@Override
	public String toString() {
		return "Student [stud_id=" + stud_id + ", stud_name=" + stud_name + ", stud_div=" + stud_div + ", stud_cgpa="
				+ stud_cgpa + "]";
	}
	

}
