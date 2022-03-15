package stringPrograms;

public class PrintOnlyCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Chennai 600028";
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)>='a') {
				if(name.charAt(i)<='z') {
					System.out.print(name.charAt(i));
				}
			}
			if(name.charAt(i)>='A') {
				if(name.charAt(i)<='Z') {
					System.out.print(name.charAt(i));
				}
			}
		}
	}

}
