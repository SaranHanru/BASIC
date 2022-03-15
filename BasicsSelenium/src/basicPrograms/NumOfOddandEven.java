package basicPrograms;

public class NumOfOddandEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1234568;
		int num;
		int odd=0 ,even=0;
		while(i!=0) {
		 num=i%10;                //1234568%10=8
		 if(num%2==0) {          //8%2 =0
			 even++;             //even = 1
		 }
		 else {
			 odd++;
		 }
		 i=i/10;                //1234568/10 = 123456
		}
		System.out.println("Odd Count is " +odd );
		System.out.println("Even Count is " +even);
		

	}

}
