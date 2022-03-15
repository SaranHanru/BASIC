package stringPrograms;

public class SearchingMethods {

	public static void main(String[] args) {
		String s1="Saravanan";
		
		System.out.println(s1.lastIndexOf("an"));//last position of char 'n' = 8
		//System.out.println(s1.indent(0));//gap
		System.out.println(s1.indexOf('s'));//position of a (First matching) = 1
		System.out.println(s1.indexOf('r', 1));// position of r from start index position 1 by int 
		System.out.println(s1.indexOf("v", 0));// position of v by string value
		System.out.println(s1.lastIndexOf("a"));
		System.out.println(s1.lastIndexOf('v', 2));
	}
}
