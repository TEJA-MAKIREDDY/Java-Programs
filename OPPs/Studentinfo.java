class Student{

    public int RollNo;
    public String Course;

    public String Name;
    public int m1,m2,m3;



    public String details(){
        return "Name: "+Name+"\n"+"RollNo: "+RollNo+"\n"+"Course: "+Course;
    }

    public float Total(){
        return m1+m2+m3;
    }

    public float Average(){
        return Total()/3;
    }

    public char grade(){
        if (Average()>70) return 'A';
        else return 'B';
    }
}




public class Studentinfo {
    public static void main(String args[]){

        Student s=new Student();

        s.RollNo=1247;
        s.Course="Informationn Technology";
        s.Name="Teja";
        s.m1=70;
        s.m2=73;
        s.m3=76;


        System.out.println(s.details());
        System.out.println(s.Total());
        System.out.println(s.Average());
        System.out.println(s.grade());





    }
}
