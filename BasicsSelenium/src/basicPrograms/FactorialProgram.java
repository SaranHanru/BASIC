package basicPrograms;

import java.util.Scanner;

public class FactorialProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a Number: "); // 5
		int num=s.nextInt();//5
		int sum=1;
		for(int i=1;i<=num;i++)//i=1;i<=6(1<=6);i++ --> //2//3//4//5//
		{
			sum=sum*i;          // sum=1*1 = 1 //1*2=2//2*3=6//6*4=24//24*5=120
		}
		System.out.println(sum);

	}

}
