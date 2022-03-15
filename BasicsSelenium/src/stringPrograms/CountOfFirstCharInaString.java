package stringPrograms;

public class CountOfFirstCharInaString {

	public static void main(String[] args) {

		String s="siva Sakthi";
		        //0123 456789
		char ch = s.charAt(1);
		System.out.println(ch);
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(ch == s.charAt(i)) {
				count++;
			}
		}
		/*
		 * if(count > ) {
		 * 
		 * }
		 */
		System.out.println(count);
	}

}
