package com.StudentConsumer.Entity;

public class Student {

	private Integer sid;
	private String sname;
	private String sbranch;
	private Integer sage;


	public Student() {
		super();
	}

	public Student(Integer sid, String sname, String sbranch, Integer sage) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sbranch = sbranch;
		this.sage = sage;
	}
	

	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSbranch() {
		return sbranch;
	}

	public void setSbranch(String sbranch) {
		this.sbranch = sbranch;
	}

	public Integer getSage() {
		return sage;
	}

	public void setSage(Integer sage) {
		this.sage = sage;
	}

	

		
	}


