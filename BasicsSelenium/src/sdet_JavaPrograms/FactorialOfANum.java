package sdet_JavaPrograms;

import java.util.Scanner;

public class FactorialOfANum {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num = scan.nextInt();
		
		int sum=1;
		for(int i=1;i<=num;i++) {
			sum=sum*i;
		}
		System.out.println(sum);
	}

}
