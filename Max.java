public class Max{
    public static void main(String[] args){
        int A[]={12,23,43,23};
        int num=Integer.MIN_VALUE;
        for(int i=0; i<A.length; i++){
            if(A[i]>num){
                num=A[i];
            }
        }
System.out.println(num);
// comment added

    }
}