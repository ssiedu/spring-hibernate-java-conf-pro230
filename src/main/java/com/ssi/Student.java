package com.ssi;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Future;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.CreditCardNumber;
import org.hibernate.validator.constraints.Email;

@Entity
public class Student {
	
	@Id
	@Min(value = 101, message="Roll No Cant Be Less Than 101")
	@Max(value = 500, message="Roll No Cant Exceed 500")
	private int rno;
	
	@Pattern(regexp="[a-zA-Z]*", message="Only Alphabates Allowed")
	@Size(min = 2, max=10, message = "Invalid Name - Please Use 2-10 Chars For Name")
	private String name;
	
	@Email(message="Invalid Email Address")
	private String email;
		
	
	private String mobile;
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "Student [rno=" + rno + ", name=" + name + ", email=" + email
				+ ", mobile=" + mobile + "]";
	}
	
}
