package basicPrograms;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=s.nextInt();//19
		int count=0;
		for(int i=1;i<=num;i++) { //1<=19(T)
			if(num%i==0) { //(19%1==0) T //1 //
				count++;
				}
		}
		if(count==2) {
			System.out.println("Given number is prime NUmber");
		}else {
			System.out.println("Given number is not a prime number");
		}

	}

}
