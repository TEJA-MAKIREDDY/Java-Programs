public class Inserting {
    public static void main(String[] args){
        int ele=7;

        int A[]=new int[10];
        A[0]=1;
        A[1]=2;
        A[2]=3;
        A[3]=4;
        A[4]=5;
        A[5]=6;

        for(int x:A)
            System.out.print(x+",");
        System.out.println("");

        for(int i=A.length-1;i>1;i--){
            A[i]=A[i-1];
        }
        A[2]=ele;

        for(int x:A)
            System.out.print(x+",");

    }


}
