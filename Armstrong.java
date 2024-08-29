import java.util.*;
public class Armstrong {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        int n,r,sum=0;

        System.out.println("Enter the number:");
        n=sc.nextInt();
        int m=n;

        while(n>0){

            r=n%10;
            n=n/10;
            sum=sum+r*r*r;

        }
        System.out.println(sum);
        if(sum==m){
            System.out.println(+sum +" "+"is a armstrong number");
        }
        else{
            System.out.println(+sum +" "+"is not a armstrong number");
        }
    }
}
