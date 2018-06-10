package day3challange;

import java.util.Scanner;

public class PalindromeNumber {

	 
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner scan = new Scanner(System.in);
			System.out.print("Enter a Number : ");
			int number1 = scan.nextInt();
			int number2=number1;
			int reminder=0;
			while (number1>0)
			{
				reminder+=(number1%10);

				number1/=10;
				if(number1>0)
				{
					reminder*=10;
				}
			}
			if(number2==reminder)
			{
			System.out.println("The given number is a palindrome");
			}
			else
			{
			System.out.println("The given number is not a palindrome");	
			}
		}

	

}
