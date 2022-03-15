package javaQus;

public class VowelPrgm {

	public static void main(String[] args) {
		String s="education";
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			
			switch (ch) {
			case  'a' :
			case  'e' :
			case  'i' :
			case  'o' :
			case  'u' :
				      System.out.println(ch);
				    break;
			}
		}		
	}
}
