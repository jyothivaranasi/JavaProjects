package com.labbook2;

public class Personclass {
	enum Gender{
		M,F;
	}
private String firstName;
private String lastname;
private Gender gender;
private long phoneNumber;
public Personclass(String firstName, String lastname, Gender gender, long phoneNumber) {
	super();
	this.firstName = firstName;
	this.lastname = lastname;
	this.gender = gender;
	this.setPhoneNumber(phoneNumber);
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public Gender getGender() {
	return gender;
}
public void setGender(Gender gender) {
this.gender=gender;
}
public Personclass(String firstName, String lastname, Gender gender) {
	super();
	this.firstName = firstName;
	this.lastname = lastname;
	this.gender = gender;
}
public Personclass() {
	
}
public long getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(long phoneNumber) {
	this.phoneNumber = phoneNumber;
}
}
