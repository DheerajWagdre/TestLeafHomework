package day1challange;

import java.util.Scanner;

public class EvenOddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int number1 = scan.nextInt();
		if(number1%2==0)
		{
			System.out.println(number1+" is an even number");
		}
		else
		{
			System.out.println(number1+" is an odd number");
		}
			
       scan.close();
	}

}
