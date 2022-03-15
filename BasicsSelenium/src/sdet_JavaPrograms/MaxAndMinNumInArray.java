package sdet_JavaPrograms;

public class MaxAndMinNumInArray {

	public static void main(String[] args) {

		
		int a[]= {100,200,30,60,50};
		
		//Maximum number in a Array
		int max=a[0];
		
		for(int i=1;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println(max);
		
		//Minimum number in a Array
		
		int min=a[0];
		
		for(int i=1;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println(min);
	}

}
