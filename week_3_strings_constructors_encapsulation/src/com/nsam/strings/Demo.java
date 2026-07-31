package com.nsam.strings;

public class Demo {
    public static void main(String[] args) {
        Bank b=new Bank();
        System.out.println(b.acc_number);
        System.out.println(b.balance);
//        System.out.println(b.pin);
        b.setData(1111);
        System.out.println(b.getData());
        b.deposite(1110, 5000.00);
        b.deposite(1111, 5000.00);
        b.checkBalance(1111);
        b.withdrawal(1111,2000.00);
        b.checkBalance(1111);

    }

}
