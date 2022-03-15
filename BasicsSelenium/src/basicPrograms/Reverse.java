package basicPrograms;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Saravanan";
		/*int n=1234;
		StringBuffer s1=new StringBuffer(s);
		
		System.out.println(s1.reverse());
		StringBuffer s2=new StringBuffer(String.valueOf(n));
		System.out.println(s2.reverse());*/
		
		/*String rev ="";
		int len=s.length();            // + concatenation method
		for(int i=len-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
        System.out.println(rev);*/
		
		//Using Char Array
		String rev="";
		char[] ch = s.toCharArray();
	    int len = ch.length;
		for(int i=len-1;i>=0;i--) {
			rev= rev+ch[i];
		}
		System.out.println(rev);
		

	}

}
