package sdet_JavaPrograms;

import java.util.HashSet;

public class DuplicateElemmentsInArray {

	public static void main(String[] args) {

		String arr[]= {"Java","C","C++","Python","C"};
		
		HashSet<String> langs = new HashSet<>();
		
		boolean flag = false;
		for(String l:arr) {
			if(langs.add(l)==false) {
				System.out.println("Duplicate element is: "+l);
				flag=true;
			}
		}
		if(flag==false) {
			System.out.println("Not Found Duplicates");
		}
	}
}
