package com.nsam.strings;

//Encapsulation -- providing controlled access to the private datamemebers of the
// class using setters and getter methods

class Bank {
   private int pin;
    String acc_number="SBI0001";
    double balance;

    //setter() is to initialize the private variable
    public void setData(int pin)
    {
        this.pin=pin;
    }
    //getter method -- is used to return/get the private variable
    public int getData()
    {
        return pin;
    }

    //deposite, withdrawal, checkbalance
    void deposite(int pin, double amount){
        if(this.pin==pin)
        {
            balance+=amount;
            System.out.println("amount deposited successfuly");
        }
        else{
            System.out.println("Invalid pin");
        }
    }
    void withdrawal(int pin, double amount){
        if(this.pin==pin)
        {
            if(amount>balance)
            {
                System.out.println("Insufficient balance");
            }
            else {
                balance -= amount;
                System.out.println("amount withdrawn successfuly");
            }
        }
        else{
            System.out.println("Invalid pin");
        }
    }
    void checkBalance(int pin){
         if(this.pin==pin)
         {
             System.out.println("current balance: "+balance);
         }
         else{
             System.out.println("invalid PIN");
         }
    }
}
