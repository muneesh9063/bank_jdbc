package com.bank;

import java.math.BigInteger;

public class Customer {
    private long accno;
    private String fname;
    private String lname;
    private String email;
    private String city;
    private long contact;
    private String accountType;
    private double balance;

    public Customer() {

    }
    public Customer( String fname, String lname, String email, String city, long contact, String accountType, double balance) {
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.city = city;
        this.contact = contact;
        this.accountType = accountType;
        this.balance = balance;
    }

    public Customer(long accno, String fname, String lname, String email, String city, long contact, String accountType, double balance) {
        this.accno = accno;
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.city = city;
        this.contact = contact;
        this.accountType = accountType;
        this.balance = balance;
    }

    public long getAccno() {
        return accno;
    }

    public void setAccno(long accno) {
        this.accno = accno;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public long getContact() {
        return contact;
    }

    public void setContact(long contact) {
        this.contact = contact;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return String.format(
                "--------------------------------------------------\n" +
                        "| CUSTOMER DETAILS                               |\n" +
                        "--------------------------------------------------\n" +
                        "| Account Number | %-30s |\n" +
                        "| First Name     | %-30s |\n" +
                        "| Last Name      | %-30s |\n" +
                        "| Email          | %-30s |\n" +
                        "| City           | %-30s |\n" +
                        "| Contact        | %-30s |\n" +
                        "| Account Type   | %-30s |\n" +
                        "| Balance        | %-30s |\n" +
                        "--------------------------------------------------",
                accno, fname, lname, email, city, contact, accountType, balance
        );
    }
}
