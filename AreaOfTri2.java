import java.util.Scanner;
public class AreaOfTri2 {
    public static void main(String args[]){
        int a,b,c;
        float area,s;
        System.out.println("enter the 3 sides of triangle: ");

        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b= sc.nextInt();
        c=sc.nextInt();

        s=(a+b+c)/2f;
        area=(float)(Math.sqrt(s*(s-a)*(s-b)*(s-c)));

        System.out.println("Area of Triangle is: "+area);
    }
}
