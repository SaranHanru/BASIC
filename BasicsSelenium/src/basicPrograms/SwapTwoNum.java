package basicPrograms;

public class SwapTwoNum {

	public static void main(String[] args) {
        //Type : 1 Without third variable 
		int a=5;
		int b=6;
		
		System.out.println("Value of a before swapping " + a);
		System.out.println("Value of b before swapping " + b);
		
		/*
		 * a=a+b;//a=11 b=a-b;//b=11-6-->b=5 a=a-b; //a=11-5-->6
		 */	
		//Type : 2 using third variable
		int t;
		t=a;
		a=b;
		b=t;
		System.out.println("Value of a after swapping " + a);
		System.out.println("Value of b after swapping " + b);

	}

}
