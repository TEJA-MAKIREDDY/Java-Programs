public class Maximum_using_varargs {
    static int max(int ...A) {
        if (A.length == 0) return Integer.MIN_VALUE;
        int max = A[0];
        for (int i = 0; i < A.length; i++)
            if (A[i] > max) max = A[i];
        return max;
    }


    static int sum(int ...A){
        int sum=0;
        for(int i=0;i<A.length;i++) sum=sum+A[i];
        return sum;

        }

    static double discount(int ...prices){
        int sum=0;
        for(int i=0;i<prices.length;i++) sum+=prices[i];

        if(sum<500) return sum-sum*0.10;
        if(sum>500 && sum<1000) return sum-sum*0.15;
        else return sum-sum*0.20;

    }
    public static void main(String[] args){
        System.out.println(max());
        System.out.println(max(12,23,345,5676,3434,556546,3442));
        System.out.println(sum(125,45,78));
        System.out.println(discount(100,544));
    }
}
