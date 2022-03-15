package basicPrograms;

public class GreatestOfThreeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=110;
		int n2=220;
		int n3=330;
		
		if(n1>n2 && n1>n3) {
		System.out.println(n1 +" is the greatest number");
		}
		else if(n2>n3) {
			System.out.println(n2 +" is the greatest number");
		}
		else
			System.out.println(n3 +" is the greatest number");

	}

}
