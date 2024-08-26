import java.util.Scanner;
public class Age {
    public static void main(String args[]){

        int age;

        System.out.println("enter the age: ");

        Scanner sc=new Scanner(System.in);
        age=sc.nextInt();

        if(age>=14 && age<=55){
            System.out.println("young");
        }
        else{
            System.out.println("not young");
        }

    }

}
