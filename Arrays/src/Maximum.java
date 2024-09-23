public class Maximum {
    public  static void main(String[] args){

        int A[]={1,2,4,55,6,7,8453,24,546,35};
        int max=A[0];


        for(int i=1;i<A.length;i++){

            if(A[i]>max){
                max=A[i];
            }
        }System.out.println(max+"at index");
    }
}
