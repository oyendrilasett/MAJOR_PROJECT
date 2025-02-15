package com.example.ecom.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id; 
    private String name;
    private String phno;
    private String email;
    private String msg;
    private String ans="no";
    public Contact() {
    }
    public Contact(int id, String name, String email, String phno, String msg, String ans) {
    	super();
        this.id = id;
        this.name = name;
        this.phno = phno;
        this.email = email;
        this.msg = msg;
        this.ans=ans;
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
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPhno() {
	return phno;
}
public void setPhno(String phno) {
	this.phno = phno;
}
public String getMsg() {
	return msg;
}
public void setMsg(String msg) {
	this.msg = msg;
}

public String getAns() {
	return ans;
}
public void setAns(String ans) {
	this.ans = ans;
}
@Override
public String toString() {
	return "Contact [id=" + id + ", name=" + name + ", email=" + email + ", phno=" + phno + ", msg=" + msg + ", ans=" + ans + "]";
}}