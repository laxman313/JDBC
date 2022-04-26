package com.createiq.account.model;

public class Account {
private int acno;

private String acname;
private double balance;
public Account() {
	super();
	// TODO Auto-generated constructor stub
}
public Account(int acno, String acname, double balance) {
	super();
	this.acno = acno;
	this.acname = acname;
	this.balance = balance;
}
public int getAcno() {
	return acno;
}
public void setAcno(int acno) {
	this.acno = acno;
}
public String getAcname() {
	return acname;
}
public void setAcName(String name) {
	this.acname = name;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}

}
