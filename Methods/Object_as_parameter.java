public class Object_as_parameter {

    static void change(int A[]){
        A[0]=12;
        for (int x:A)
            System.out.print(x+", ");
    }

    public static void main(String args[]){

        int A[]={1,2,3,4,5};

        change(A);
        System.out.println();
        System.out.println(A[0]);//here the actual array is also updated as the reference is copied i.e address of array to the formal parameters so formal parameters also points to the same array


    }
}
