package sdet_JavaPrograms;

public class ReverseAString {

	public static void main(String[] args) {
         String s="Saravanan";
                 //012345678 // length=9-1=8 charAt[8]=n
/*************************************************************************************************************************/         
         // Type:1 Using CharArray
         
         /*String rev="";
         char[] ch = s.toCharArray();
         for(int i=ch.length-1;i>=0;i--) { //i=9-1=8;8>=0(T);//i=7;7>=0(T)//i=6;6>=0(T)
        	 rev=rev+ch[i];               //rev=""+ch[i]->i=8->ch[8]=n//i--(7) =>rev=n+ch[i=7]="n"+"a"=>na//i--(6)
         }
         
         System.out.println("Reversed using CharArray: " +rev);*/
 /************************************************************************************************************************/        
	    //Type:2 Using StringBuffer 
         
        /*StringBuffer rev;
	    StringBuffer sb=new StringBuffer(s);
	    rev=sb.reverse();
	    System.out.println("Reversed using StringBuffer :"+rev);*/
	    
/*************************************************************************************************************************/
         
         //Type:3 Using StringBuilder
         
         /*StringBuilder sb=new StringBuilder();
         sb.append(s);
         System.out.println("Reversed Using String Builder: "+sb.reverse());*/
         
 /*************************************************************************************************************************/         
		
         //Type:4 Using Concatenation Method
         
         String rev="";
         for(int i=s.length()-1;i>=0;i--) {
        	 rev=rev+s.charAt(i);
         }
         System.out.println("Reversed using Concatenation: "+rev);
         
/*************************************************************************************************************************/
	}

}
