package stringPrograms;

public class NumberOfCasesStringPrgm {
	public static void main(String[] args) {
		String s="WeLcOmE To Automation";
		int lower=0;
		int upper=0;
		
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch>=65 && ch<=90) {
				upper++;
			}else
			{
			lower++;	
			}	
		}
		System.out.println("Lower Case Characters is: " +lower);
		System.out.println("Upper Case Characters is: " +upper);
	}

}