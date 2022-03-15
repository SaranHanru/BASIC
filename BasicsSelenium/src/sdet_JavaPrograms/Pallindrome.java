package sdet_JavaPrograms;

import java.util.Scanner;

public class Pallindrome {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num = scan.nextInt();
		int value=num;
		int rev=0;
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		if(value==rev) {
			System.out.println("It is a Pallindrome");
		}
		else System.out.println("Not a Pallindrome");
		
	}

}
