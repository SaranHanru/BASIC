package sdet_JavaPrograms;

public class SumOfElementsInArray {

	public static void main(String[] args) {

		
		int a[] ={5,2,7,9,6};
		int sum=0;
		
		//Normal For Loop
		/*for(int i=0;i<=a.length-1;i++) {
			sum=sum+a[i];
		}*/
		
		//Enhanced loop (For-Each)
		
		for(int value:a) {
			sum=sum+value;
		}
		System.out.println(sum);
	}

}
