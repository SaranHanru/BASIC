package javaQus;

public class InputVowelsPrgm {
	
	public static void main(String[] args) {
		
		String s="zoom";
		int vCount=0;
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			
			switch (ch) {
			case 'a' :
			case 'e' :
			case 'i' :
			case 'o' :
			case 'u' :
				vCount++;
				break;
			}
		}
		System.out.println(vCount);
	}

}
