import java.lang.*;

public class Binary{
    public static void main(String args[]) {


        int x = 5;
        int y = -5;//negative number will be srored in 2's complement form
        System.out.println(Integer.toBinaryString(x));
        System.out.println(Integer.toBinaryString(y));
    }
}

//for any other types of data like byte ect.. there is no method to convert tha byte no. into binary you need to
//convert it into integer type.only integers have this method to cinvert into binary form in java.