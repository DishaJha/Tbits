package com.tutorialspoint;

import java.io.Serializable;
import java.util.Date;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "student")

public class Student implements Serializable {
	private static final long serialVersionUID = 1L;

	private long sid;

	private String username;

	private String lastname;

	private String gender;

	private String studentId;

	private String city;

	private String state;

	private String description;

	private Integer pincode;

	private Date dob;

	// private UploadedFile file;

	public long getSid() {
		return sid;
	}

	@XmlElement
	public void setSid(long sid) {
		this.sid = sid;
	}

	public Student() {
		// super();
	}

	public Student(int id, String username, String lastname) {
		this.sid = id;
		this.username = username;
		this.lastname = lastname;
	}

	public Student(String username, String lastname, Date dob, String gender, String studentId, String city,
			String state, Integer pincode, String description) {
		this.username = username;
		this.lastname = lastname;
		this.dob = dob;
		this.gender = gender;
		this.studentId = studentId;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.description = description;
	}

	public Student(long sid, String username, String lastname, Date dob, String gender, String studentId, String city,
			String state, Integer pincode, String description) {
		this.sid = sid;
		this.username = username;
		this.lastname = lastname;
		this.dob = dob;
		this.gender = gender;
		this.studentId = studentId;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.description = description;
	}

	public String getUsername() {
		return username;
	}

	@XmlElement
	public void setUsername(String username) {
		this.username = username;
	}

	public String getLastname() {
		return lastname;
	}

	@XmlElement
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getGender() {
		return gender;
	}

	@XmlElement
	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getStudentId() {
		return studentId;
	}

	@XmlElement
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getCity() {
		return city;
	}

	@XmlElement
	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	@XmlElement
	public void setState(String state) {
		this.state = state;
	}

	public String getDescription() {
		return description;
	}

	@XmlElement
	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getPincode() {
		return pincode;
	}

	@XmlElement
	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}

	public Date getDob() {
		return dob;
	}

	@XmlElement
	public void setDob(Date dob) {
		this.dob = dob;
	}

	/*
	 * public UploadedFile getFile() { return file; }
	 * 
	 * public void setFile(UploadedFile file) { this.file = file; }
	 */
	@Override
	public String toString() {
		return "Student [sid=" + this.sid + " ,username=" + this.username + " ,lastname=" + this.lastname + " ,dob="
				+ this.dob + " ,gender=" + this.gender + " ,studentId=" + this.studentId + " ,city=" + this.city
				+ " ,state=" + this.state + " ,pincode=" + this.pincode + " ,description=" + this.description + "]";
	}
}