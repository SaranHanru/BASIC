package sdet_JavaPrograms;

import java.util.Scanner;

public class NumberOfDigitsInANumber {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a Num: ");
		int num=scan.nextInt();
		
		int count=0; //123
		
		while(num!=0) { //123!=0(T) //12!=0(T) // 1!=0(T) //0!=0(F)
			num=num/10; //num=123/10 = 12 //num=12/10 = 1 //num=1/0=0
			count++;    //1=2=3
		}
		System.out.println(count);
	}

}
