package sdet_JavaPrograms;

public class NumOfOddNdEvenDigitsInANumber {

	public static void main(String[] args) {

		int num=246815;
		int i;
		int odd=0;
		int even=0;
		while(num!=0) {
			i=num%10;
			if(i%2==0) {
				even++;
			}
			else {
				odd++;
			}
			num=num/10;
		}
		System.out.println(odd);
		System.out.println(even);
	}

}
