public class Matrix_Addition {
    public static void main(String[] args){
        int A[][]={{1,2,3},{4,5,6},{7,8,9}};
        int B[][]={{9,8,7},{6,5,4},{3,2,1}};
        int c[][]=new int[3][3];

        for(int i=0;i<A.length;i++)
            for (int j=0;j<B.length;j++)
                c[i][j]=A[i][j]+B[i][j];
        for (int x[]:c) {
            for(int y:x){
                System.out.print(y+" ");
            }System.out.println("");

        }

    }
}
