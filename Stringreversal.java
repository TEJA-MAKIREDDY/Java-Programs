import java.lang.*;
import java.util.*;
public class Stringreversal {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);


        String str;
        System.out.println("enter the String:");
        str=sc.nextLine();


        StringBuffer s=new StringBuffer(str).reverse();
        System.out.println(s);
    }
}
