package com.example;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Person_table {
	@Id
private int personid;
private int age;
private String email;
private String username;
private String password;
@Override
public String toString() {
	return "Person_table [personid=" + personid + ", age=" + age + ", email=" + email + ", username=" + username
			+ ", password=" + password + "]";
}
public int getPersonid() {
	return personid;
}
public void setPersonid(int personid) {
	this.personid = personid;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public Person_table() {
	super();
	// TODO Auto-generated constructor stub
}
public Person_table(int personid, int age, String email, String username, String password) {
	super();
	this.personid = personid;
	this.age = age;
	this.email = email;
	this.username = username;
	this.password = password;
}

//public String getPassword() {
//	// TODO Auto-generated method stub
//	return null;
//}
//public String getUsername() {
//	// TODO Auto-generated method stub
//	return null;
//}

}
