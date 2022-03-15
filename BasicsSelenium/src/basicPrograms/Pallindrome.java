package basicPrograms;

public class Pallindrome {

	public static void main(String[] args) {

		int num=1221;
		int num1=num;
		int rev=0;
		
		while(num>0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println(rev);
		if(rev == num1) {
			System.out.println("it is a pallindrome");
		}else
			System.out.println("not a pallindrome");
	}
}
