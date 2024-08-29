import java.util.*;
public class Switch3 {
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        System.out.println("MENU");
        System.out.println("=====");
        System.out.println("ADD");
        System.out.println("SUB");
        System.out.println("MUL");
        System.out.println("DIV");


        System.out.println("Enter two Numbers:");
        int x=sc.nextInt();
        int y=sc.nextInt();

        sc.nextLine();

        System.out.println("enter operation in words:");
        String option=sc.nextLine();
        option=option.toUpperCase();

        switch (option){

            case "ADD":System.out.println("Sum is:" +(x+y));
            break;
            case "SUB":System.out.println("Difference is:" +(x-y));
                break;
            case "MUL":System.out.println("Product is:" +(x*y));
                break;
            case "DIV":System.out.println("Ratio is:" +(x/y));
                break;
            default:System.out.println("invalid");
        }


    }
}
