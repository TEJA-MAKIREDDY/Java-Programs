import java.util.*;
public class Sum_of_n_natural_numbers {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int n;
        System.out.println("enter the value of n:");
        n=sc.nextInt();

        int sum=0;

        for (int i=1;i<=n;i++){

            sum=sum+i;


        }System.out.println("sum of n natural nummbers is:"+sum);
    }
}
