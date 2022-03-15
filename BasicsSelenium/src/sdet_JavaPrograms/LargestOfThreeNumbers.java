package sdet_JavaPrograms;

public class LargestOfThreeNumbers {

	public static void main(String[] args) {

		int a=500;
		int b=300;
		int c=600;
/***************************************************************************************/
		//Type 1 (using If-Else Conditional Statements)
		
		/*if(a>b && a>c) {
			System.out.println("a is Largest Number");
		}
		else if(b>c) {
			System.out.println("b is largest Number");
		}
		else System.out.println("C is largest NUmber");*/

/***************************************************************************************/
		//Type 2 (Using Ternary Operator)
		
		//Method 1
		
		/*int largest=a>b?a:b;
        
		largest=c>largest?c:largest;
		
		System.out.println(largest);*/
		
		//Method 2
		
		int largest=c>(a>b?a:b)?c:a>b?a:b;
		
		System.out.println(largest);
	}

}
