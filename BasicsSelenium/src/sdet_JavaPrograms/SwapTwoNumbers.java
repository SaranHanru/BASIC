package sdet_JavaPrograms;

public class SwapTwoNumbers {

	public static void main(String[] args) {

		int a=5;
		int b=6;
		
		//Swap using Third Variable
		/*int t;
		System.out.println("a value before swapping : "+a);
		System.out.println("b value before swapping : "+b);
		t=a;
		a=b;
		b=t;
		System.out.println("a value after swapping : "+a);
		System.out.println("b value after swapping : "+b);*/
		
		//Swap without using third variable
		System.out.println("a value before swapping without third variable : "+a);
		System.out.println("b value before swapping without third variable : "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a value after swapping without third variable : "+a);
		System.out.println("b value after swapping without third variable : "+b);		
	}

}
