package sdet_JavaPrograms;

import java.util.Scanner;

public class PrimeNumOrNot {

	public static void main(String[] args) {
    
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scan.nextInt();
		
		int count=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
		}
			if(count == 2) {
				System.out.println("Entered number "+num +" is a Prime Number");
			}else System.out.println("Entered number "+num +" is not a Prime Number");
		}
	
		
	}
 