public class Max_element_array {
    static  int findmax(int a[]){

        int max=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>max) max=a[i];
        }return max;

    }public static void main(String args[]){
       int a[]={22,33,5,133,567,4334,674};
       System.out.println(findmax(a));
    }
}
