package sdet_JavaPrograms;

public class CountCharOccurencesInAString {

	public static void main(String[] args) {

		String str="Trillionaire";
		char ch = str.charAt(1);
		System.out.println(ch);
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(ch == str.charAt(i)) {
				count++;
			}
		}
		System.out.println(count);
		
	}

}
