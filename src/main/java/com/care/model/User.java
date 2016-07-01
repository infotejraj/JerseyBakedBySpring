package com.tejinfo.model;

import java.io.Serializable;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	private long userId;
	private String firstName;
	private String lastName;
	private String middleName;
	private Long birthDate;
	private String mobileNo;
	private String phoneNo;
	private String gender;
	private String email;
	private String bloodGroup;
	private String photoUrl;
	private String userType;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(long userId, String firstName, String lastName,
			String middleName, Long birthDate, String mobileNo, String phoneNo,
			String gender, String email, String bloodGroup, String photoUrl,
			String userType) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
		this.birthDate = birthDate;
		this.mobileNo = mobileNo;
		this.phoneNo = phoneNo;
		this.gender = gender;
		this.email = email;
		this.bloodGroup = bloodGroup;
		this.photoUrl = photoUrl;
		this.userType = userType;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public Long getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Long birthDate) {
		this.birthDate = birthDate;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getPhotoUrl() {
		return photoUrl;
	}

	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}
	
	
}
