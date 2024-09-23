public class Array1 {
    public static void main(String[] args0){

        int A[]=new int[10];

        int B[]={1,2,3,4,5};

        int []C=new int[5];

        int[] D;
        D=new int[10];

        B[2]=10;


        for(int i=0;i<A.length;i++)
        {
            System.out.println(A[i]);
        }
        for(int x:B){
            System.out.print(x+" ");

        }
        System.out.println("");
        System.out.println(B);

    }
}
