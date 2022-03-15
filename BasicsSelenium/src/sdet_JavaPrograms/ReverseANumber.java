package sdet_JavaPrograms;

import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = scan.nextInt();
        
        //Type:1 Using Algorithm
        int rev=0;
        while(num!=0) {
        	rev=rev*10+num%10;
        	num=num/10;
        }
        System.out.println("Rev value is: "+rev);
        
        //Type:2 Using StringBuffer
        
        /*StringBuffer rev;
        StringBuffer sb=new StringBuffer(String.valueOf(num));
        rev=sb.reverse();
        System.out.println("Rev value is: "+rev);*/
        
        //Type:3 Using StringBuilder
        
        /*StringBuilder sb=new StringBuilder();
        sb.append(num);
        StringBuilder rev = sb.reverse();
        System.out.println("Rev value is: "+rev);*/   
	}

}
