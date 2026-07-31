package com.nsam.strings;

public class Amazon {
    private int password;
    String username;
    private double amazon_pay_balance;
    String cart_items;
    int order;

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public double getAmazon_pay_balance() {
        return amazon_pay_balance;
    }

    public void setAmazon_pay_balance(double amazon_pay_balance) {
        this.amazon_pay_balance = amazon_pay_balance;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    private String address;

}
