package stringPrograms;

public class Float {

	public static void main(String[] args) {
		float x= 10.234567f;
		String b=  x +"";
		System.out.println("b is: "+b);
		
		int temp=0;
		
		for (int i=0;i<b.length()-1;i++) {
			if(b.charAt(i)== '.') {
				temp++;
			}
			if(temp==1) {
				System.out.print(b.charAt(i+1));
			}
		}
	}
}
