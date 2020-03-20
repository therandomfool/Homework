package Homework;

import java.util.Scanner;

//Make Change Cash Register

public class CashRegister {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Price: ");
		double price = sc.nextDouble();
		
		System.out.print("Enter how much you pay with: ");
		double paid = sc.nextDouble();
		
		double change = (paid-price);
		
			if (paid < price) {
				System.out.println("HEY!!! YOU SHORTED ME!!");
			} 
			else if (paid == price) {
				System.out.println("Thank You for the exact change!!");
			}
			else if (paid > 20) {
				System.out.println("Sorry we dont take larger bills than twenties!");
			}
			else {
		double twenty  = (int)(change / 20);
		change = change % 20;
		
		double ten = (int)(change /10);
		change = change % 10;
		
		double five = (int)(change /5);
		change = change % 5;

		double one = (int)(change /1);
		change = change % 1;
		
		double quarter = (int)(change /.25);
		change = change % .25;
		
		double dime = (int)(change /.10);
		change = change % .10;
		
		double nickle = (int)(change /.05);
		change = change % .05;
		
		double penny = Math.round(change / .01);
//		change = change % .01;
		
		
		
		
		System.out.println("Your item is: " + price + "\n You paid with: " + paid + " is: \n" + twenty + " Twenty: \n" + ten + " Ten: \n" 
							+ five + " Five: \n" + one + " One: \n" + quarter + " Quarter: \n" + dime + " Dime: \n" 
							+ nickle + " Nickle: \n" + penny + " Penny:");
		sc.close();
			}
	}


}