package basicPrograms;

public class BiggestNumInAInteger {

	public static void main(String[] args) {
           int num=15975;
           int a= 0;           
			
			 while (num!=0) { 
				 int n=num%10; 
				       if(n > a) { 
					          a=n;
					        }
				             num=num/10; 
				  }
			 System.out.println(a);
			 }
}
