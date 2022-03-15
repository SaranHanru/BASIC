package sdet_JavaPrograms;

public class DiffCasesOfCharinAString {

	public static void main(String[] args) {

		String str="WeLComE to AuTOmaTiOn";
		String upper="";
		String lower="";
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch>=65 && ch<=90) {
				upper=upper+ch;
			}
			else
				lower=lower+ch;
		}
		System.out.println("Upper cases Characters are: "+upper);
		System.out.println("Lower cases Characters are: "+lower);
	}

}
