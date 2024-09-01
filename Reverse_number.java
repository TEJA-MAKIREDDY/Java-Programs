import java.util.*;
public class Reverse_number {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int n,r,rev=0;
        System.out.println("enter the number: ");
        n= sc.nextInt();

        while(n>0){

            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        System.out.println(rev);
    }
}
