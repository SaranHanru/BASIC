package javaQus;

public class CountNumOfUinAString {
	
	public static void main(String[] args) {
		String s="Immunities";
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='u') {
				count++;
			}
		}
		System.out.println(count);
	}

}
