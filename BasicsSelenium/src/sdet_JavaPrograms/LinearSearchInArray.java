package sdet_JavaPrograms;

public class LinearSearchInArray {

	public static void main(String[] args) {
        int a[]= {10,20,50,30,40};
        
        int search_element=60;
        boolean flag = false;
        for(int i=1;i<a.length;i++) {
        	if(search_element==a[i]) {
        		System.out.println("Element is found at index: "+i +" and founded element is: "+a[i]) ;
        		flag=true;
        		break;
        	}
        }
        if(flag==false)
        {
        System.out.println("Element is not found");
	}
	}
}
