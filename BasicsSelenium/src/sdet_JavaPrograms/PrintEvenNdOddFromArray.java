package sdet_JavaPrograms;

public class PrintEvenNdOddFromArray {

	public static void main(String[] args) {

		int a[]= {1,2,3,4,5,6};
		
		//Enhanced For Each Loop
		
		System.out.println("Even numbers in a array");
		for(int Even:a) {
			if(Even%2==0) {
				System.out.println("Even Numbers are: "+Even);
			}
		}
		System.out.println("Odd numbers in a array");
			for(int Odd:a) {
				if(Odd%2!=0)
				System.out.println("Odd Numbers are: "+Odd);
			}
	}
		
		// Extracting even numbers using for loops
		
		//System.out.println("Even numbers in a array");
		
		/*for(int i=0;i<=a.length-1;i++) {
			if(a[i]%2==0) {
				System.out.println(a[i]);
			}	
		}
		
		System.out.println("Odd numbers in a array");
		
		for(int i=0;i<=a.length-1;i++) {
			if(a[i]%2!=0) {
				System.out.println(a[i]);
			}
		}*/
			
	}

