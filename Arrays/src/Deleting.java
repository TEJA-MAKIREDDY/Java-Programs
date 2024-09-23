public class Deleting {
    public static void main(String[] args){

        int A[]=new int[10];
        A[0]=1;A[1]=2;A[2]=3;A[3]=4;A[4]=5;A[5]=6;

        for(int x:A)
            System.out.print(x+",");
        System.out.println("");

        int index=2;

        for(int i=index+1;i<A.length;i++)
            A[i-1]=A[i];
        for(int x:A)
            System.out.print(x+",");

    }
}
