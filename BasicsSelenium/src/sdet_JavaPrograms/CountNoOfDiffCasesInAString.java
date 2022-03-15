package sdet_JavaPrograms;

public class CountNoOfDiffCasesInAString {

	public static void main(String[] args) {

		String str="WeLcOmE To AuToMaTiOn";
		int upper=0;
		int lower=0;
		
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch>=65 && ch<=90) {
				upper++;
			}
			else
				lower++;
		}
		System.out.println("No.Of.Upper Case Chars: "+upper);
		System.out.println("No.Of.Lower Case Chars: "+lower);
	}

}
