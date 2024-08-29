import java.util.*;
public class Count_digits {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        int n,count=0;
        System.out.println("enter the digit:");
        n=sc.nextInt();

        while (n>0){

            n=n/10;
            count++;
        }System.out.println(count);
    }
}
