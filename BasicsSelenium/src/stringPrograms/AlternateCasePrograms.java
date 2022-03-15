package stringPrograms;

public class AlternateCasePrograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="Saravanan";
		char[] ch = s.toCharArray();
		for(int i=0;i<s.length();i++) {
			if(i%2!=0) {
				System.out.print(Character.toLowerCase(ch[i]));
			}
			else
				System.out.print(Character.toUpperCase(ch[i]));
		}
				
	}

}
