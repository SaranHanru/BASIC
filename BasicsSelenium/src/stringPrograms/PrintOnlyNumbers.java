package stringPrograms;

public class PrintOnlyNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Chennai 600028";
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)>='0') {
				if(name.charAt(i)<='9') {
					System.out.print(name.charAt(i));
				}
			}
		
		//System.out.println(name.replaceAll("[a-zA-Z]", ""));
		}

	}
}

