package day1challange;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number for table");
		int number1 = scan.nextInt();
		System.out.println("Enter a number for nth number of table");
		int number2 = scan.nextInt();
		int i, Mult; 
		if(number1<0)
		{
			number1=number1*-1;
		}
		if(number2<0)
		{
			number2=number2*-1;
		}
		for(i=1;i<=number2;i++)
		{
			Mult=i*number1;
			System.out.println(i+"*"+number1+"="+Mult);
		}
	}

}
