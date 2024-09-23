public class second_max {
    public static void main(String[] args){

        int A[]={1,22,3,44,5,67,3,131,435,75,2};

        int max1,max2;
        max1=max2=A[0];


        for(int i=0;i<A.length;i++)
        {
            if(A[i]>max1)
            {
                max2=max1;
                max1=A[i];
            }
            else if(A[i]>max2)
            {
                max2=A[i];
            }
        }System.out.println("second largest number is "+max2);
    }
}
