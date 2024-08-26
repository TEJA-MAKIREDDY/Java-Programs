import java.util.Scanner;
public class Grades {
    public static void main(String args[]){

        int m1,m2,m3;
        float total,avg;

        System.out.println("enter the marks of three subjects : ");

        Scanner sc=new Scanner(System.in);
        m1=sc.nextInt();
        m2=sc.nextInt();
        m3=sc.nextInt();

        total=m1+m2+m3;
        avg=(m1+m2+m3)/3;

        if(avg>=70){
            System.out.println("Grade=A");
        }
        else if(60>=avg&&avg<70){
            System.out.println("Grade=B");

        }
        else if(50>=avg&&avg<60){
            System.out.println("Grade=C");
        }
        else if(40>=avg&&avg<50){
            System.out.println("Grade=D");
        }
        else{
            System.out.println("fail");
        }

    }
}
