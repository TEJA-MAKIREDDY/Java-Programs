public class Gcd {

    static int check(int m,int n){
        while(m!=n){
            if(m>n)m=m-n;
            else n=n-m;
        }return m;
    }
    public static void main(String args[]){

        int m=25,n=15,c;
        c=check(m,n);
        System.out.println("gcd is "+c);

    }
}
