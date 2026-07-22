package com.module1;
import java.util.Scanner;
public class Variable {
   public static void main(String[] args) {
      System.out.println("Hello world");  //print

      //Input
      int original_pin=2000;
      Scanner s=new Scanner(System.in);
      System.out.println("Enter the pin: ");
      int pin=s.nextInt();
      if(original_pin==pin)
      {
         System.out.println("Pin correct, proceed with other operation");
      }
      else{
         System.out.println("Invalid PIN");
      }
   }
}
