import java.util.Locale;

public class StringPractice1 {
    public static void main(String[] args){
        String str=new String("    makireddy siva sai teja    ");

        String str1=str.toUpperCase();
        System.out.println(str1);

        int len=str.length();
        System.out.println(len);

        System.out.println(str.trim());

        String str2=str.substring(14,19);
        System.out.println(str2);

        String str3=str.replace('m','M');
        System.out.println(str+" "+str3);

    }
}
