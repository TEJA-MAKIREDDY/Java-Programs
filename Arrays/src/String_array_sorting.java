public class String_array_sorting {
    public static void main(String[] args){

        String A[]={"honey","that","like","just","java","abc"};

        java.util.Arrays.sort(A);

        for (String x:A)
        {
         System.out.print(x+", ");
        }System.out.println("");
    }
}
