package sdet_JavaPrograms;

public class RemovingFloatValues {

	public static void main(String[] args) {

		float f=10.2453f;
		String str= f+"";
		System.out.println(str);
		
		int temp=0;
		
		for(int i=0;i<str.length()-1;i++) {
			if(str.charAt(i) == '.') {
				temp++;
			}
			if(temp == 1) {
				System.out.print(str.charAt(i+1));
			}
		}
	}

}
