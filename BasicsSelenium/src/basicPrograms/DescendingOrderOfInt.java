package basicPrograms;

public class DescendingOrderOfInt {

	public static void main(String[] args) {
		int n=13568;
		int r,num;
		for(int i=9;i>=0;i--) {
			num=n;
			while(num!=0) {
				r=num%10;
				if(r==i) {
					System.out.print(r);
				}
				num=num/10;
			}
			
		}
		

	}

}
