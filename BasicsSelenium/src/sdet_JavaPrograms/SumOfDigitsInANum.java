package sdet_JavaPrograms;

public class SumOfDigitsInANum {

	public static void main(String[] args) {

		int num=1234;
		int i=0;
		while(num!=0) {
			i=i+num%10;
			num=num/10;
		}
		System.out.println(i);
	}

}
