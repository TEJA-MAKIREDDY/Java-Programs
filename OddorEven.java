import java.util.*;
public class OddorEven {
    public static void main(String args[]){
        int n;
        System.out.println("enter the number: ");

        Scanner sc=new Scanner(System.in);
        n= sc.nextInt();

        if(n%2==0){
            System.out.println("number is even");
        }
        else{
            System.out.println("number is odd");
        }
    }
}
