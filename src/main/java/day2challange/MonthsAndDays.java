package day2challange;

import java.util.Scanner;

public class MonthsAndDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int number1 = scan.nextInt();
		switch (number1)
		{
		case 1:
		{	
			System.out.println("The 1st month of the year is January");
			System.out.println("Number of days in the month of January is 31");
			break;
		}		
		case 2:
		{	
			System.out.println("The 2nd month of the year is February");
			System.out.println("Number of days in the month of February is 28 or 29");
			break;
		}
		case 3:
		{	
			System.out.println("The 3rd month of the year is March");
			System.out.println("Number of days in the month of March is 31");
			break;
		}
		case 4:
		{	
			System.out.println("The 4th month of the year is April");
			System.out.println("Number of days in the month of April is 30");
			break;
		}
		case 5:
		{	
			System.out.println("The 5th month of the year is May");
			System.out.println("Number of days in the month of May is 31");
			break;
		}
		case 6:
		{	
			System.out.println("The 6th month of the year is June");
			System.out.println("Number of days in the month of June is 30");
			break;
		}
		case 7:
		{	
			System.out.println("The 7th month of the year is July");
			System.out.println("Number of days in the month of July is 31");
			break;
		}
		case 8:
		{	
			System.out.println("The 8th month of the year is August");
			System.out.println("Number of days in the month of August is 31");
			break;
		}
		case 9:
		{	
			System.out.println("The 9th month of the year is September");
			System.out.println("Number of days in the month of September is 30");
			break;
		}
		case 10:
		{	
			System.out.println("The 10th month of the year is October");
			System.out.println("Number of days in the month of October is 31");
			break;
		}
		case 11:
		{	
			System.out.println("The 11th month of the year is November");
			System.out.println("Number of days in the month of Novemver is 30");
			break;
		}
		case 12:
		{	
			System.out.println("The 12th month of the year is December");
			System.out.println("Number of days in the month of December is 31");
			break;
		}
		default:
		{	
			System.out.println("Please enter any one number from 1 to 12");
			break;

		}
		}
	}
}