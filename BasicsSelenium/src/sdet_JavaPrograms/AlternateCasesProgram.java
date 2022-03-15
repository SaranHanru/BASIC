package sdet_JavaPrograms;

public class AlternateCasesProgram {

	public static void main(String[] args) {

		String s="Saravanan";
		char[] ch = s.toCharArray();
		for(int i=0;i<s.length();i++) {
			if(i%2==0) {
				System.out.print(Character.toLowerCase(ch[i]));
			}
			else
				System.out.print(Character.toUpperCase(ch[i]));
		}
	}
}
