public class Modification_of_actualparameters {

    static int update(int x){
        x++;
        return x;

    }
    static int[] update2(int A[],int index,int value){
        A[index]=value;
        for(int x:A)
            System.out.print(x+", ");
        return A;

    }

    public static void main(String args[]){

        int a = 10;
        System.out.println(update(a));
        System.out.println(a);//here the value of a does not change as we increment as the copy of actual parameters is passed to formal parameters for primitive datatypes(int,float,double,char) in case of objects(arrays,strings(immutable))the reference of objects are copied to formal parameters


        int A[]={1,2,3,4,5};
        update2(A,2,30);
        System.out.println();
        for(int x:A)
            System.out.print(x+", ");
    }

}

