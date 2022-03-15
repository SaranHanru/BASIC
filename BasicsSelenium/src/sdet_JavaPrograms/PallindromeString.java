package sdet_JavaPrograms;

public class PallindromeString {

	public static void main(String[] args) {

		String str="Saravanan";
		
		String org_str=str;
		System.out.println("Original String is: "+org_str);
		
		String rev="";
		
		for(int i=str.length()-1;i>=0;i--) {
		
			rev=rev+str.charAt(i);
		}
		System.out.println("Reversed String is: "+rev);
		
		if(org_str.equalsIgnoreCase(rev)) {
			System.out.println("It is a Pallindrome");
		}else System.out.println("It is not a pallindrome");
	}

}
