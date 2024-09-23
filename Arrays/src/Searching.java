import java.util.Scanner;

public class Searching {
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        int key;
        System.out.println("enter the key:");
        key=sc.nextInt();

        int A[]={1,2,3,4,443,2,56,7,5};

        for(int i=0;i<A.length;i++)
        {
            if(key==A[i])
            {
                System.out.println("element found at index "+i);
                System.exit(0);
            }
        }System.out.println("not found");


    }
}
