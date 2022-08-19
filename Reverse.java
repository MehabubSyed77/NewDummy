public class Reverse {
     public static void main(String[]args){
         String s="Mehaboob";
         String finalString="";
         for(int i=s.length()-1;i>=0;i--){
               char ch= s.charAt(i);
             finalString=finalString+ch;
                 
         }
         System.out.println(finalString);
         
     }
    
}
