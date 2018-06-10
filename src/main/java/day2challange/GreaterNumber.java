package day2challange;

import java.util.Scanner;

public class GreaterNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a Number1 : ");
		int number1 = scan.nextInt();
		System.out.print("Enter a Number2 : ");
		int number2 = scan.nextInt();
		System.out.print("Enter a Number3 : ");
		int number3 = scan.nextInt();

		if((number1==number2) && (number2==number3))
		{
			System.out.println(" All numbers are equal");
		}
		else if ((number1>number2) && (number1>number3))
		{
			System.out.println(number1+" is the largest Number");
		}
		else if(number2>number3)
		{
			System.out.println(number2+" is the largest Number");
		}
		else
		{
			System.out.println(number3+" is the largest Number");
		}	

	}

}
