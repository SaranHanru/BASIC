package sdet_JavaPrograms;

public class BigNumInAIntValue {

	public static void main(String[] args) {

		int num=15651;
		int a=0;
		
		while(num!=0) {
			int n=num%10;
			if(n>a) {
				a=n;
			}
			num=num/10;
		}
		System.out.println("Bigger num in a Int value is: "+a);
		
	}

}
