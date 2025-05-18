public class Maximumnumber {
    static int max(int x,int y){
        return x>y?x:y;
    }
    static int max(int x, int y, int z){
        return x>y&&x>z?x:(y>z?y:z);
    }

    public static void main(String args[]){

        System.out.println(max(12,13,24));
    }
}
