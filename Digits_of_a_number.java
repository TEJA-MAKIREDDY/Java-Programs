import java.util.*;
public class Digits_of_a_number {
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        int n,r;
        System.out.println("enter the number:");
        n=sc.nextInt();

        while(n>0){

            r=n%10;
            n=n/10;
            System.out.println("digits of a number are:"+r);

        }


    }
}
