package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	  int basValue=0, number,result=0,TempNumber=0;
        Scanner input=new Scanner(System.in);

        System.out.print("Lütfen Bir Sayı Giriniz:");
        number=input.nextInt();
        //TempNumber=number;
      while (number != 0){
          basValue=number%10;
          result+=basValue;
          number/=10;
      }
        System.out.println("Sayıların Toplamı"+" "+result);
    }
}
