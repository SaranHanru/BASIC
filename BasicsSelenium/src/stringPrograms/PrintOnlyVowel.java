package stringPrograms;

public class PrintOnlyVowel {

	public static void main(String[] args) {

		String name="saravanan";
		for(int i=0;i<name.length();i++) {
			char ch = name.charAt(i);
			
			switch(ch) {
			case  'a':
			case  'e':
			case  'i':
			case  'o':
			case  'u':
				System.out.print(ch);
			
			}
		}
	}

}
