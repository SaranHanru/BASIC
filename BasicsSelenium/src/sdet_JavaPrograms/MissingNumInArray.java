package sdet_JavaPrograms;

public class MissingNumInArray {

	public static void main(String[] args) {

		//Array Should not have duplicates
		//no need to be in a sorted order
		//values should be in range
		
		int a[]= {1,2,4,5};
		        //1+2+4+5=12
		        //1+2+3+4+5=15
		int sum=0;
		System.out.println("Array Values");
		
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		System.out.println(sum);
		
		System.out.println("Array real values");
		int sum1=0;
		for(int i=1;i<=5;i++) {
			sum1=sum1+i;
		}
		System.out.println(sum1);
		
		System.out.println("Missing value in array is: "+(sum1-sum));
	}

}
