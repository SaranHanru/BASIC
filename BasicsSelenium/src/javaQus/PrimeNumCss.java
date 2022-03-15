package javaQus;

public class PrimeNumCss {
	 
      public static void main(String[] args) {
        
    	  int a[] = {1,2,3,4,5};
    	  for(int i=0;i<a.length;i++) {
    	  
    	  int num=a[i];
    	  int j=2;
    	  while(j<=num) {
    		  if(num%j==0) {
    			  break;
    		  }
    		  else
    		  {
    			  j++;
    		  }
    	  }
    	  if(num==j) {
    		  System.out.println(num);
    	  }
      }
}
}
