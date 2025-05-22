class Sub {
    private String SubId;
    private String name;
    private int MaxMarks;
    private int MarksObtain;

    public String getSubId(){
        return SubId;
    }

    public String getname(){
        return name;
    }
    public int getMaxMarks(){
        return MaxMarks;
    }
    public int getMarksObtain(){
        return MarksObtain;
    }

    public Sub(String SubId, String name, int MaxMarks, int MarksObtain ){
        this.SubId=SubId;
        this.name=name;
        this.MaxMarks=MaxMarks;
        this.MarksObtain=MarksObtain;
    }
    public Sub(String SubId, String name) {
        this.SubId = SubId;
        this.name = name;
    }

    public void setMaxMarks(int MaxMarks){
        this.MaxMarks=MaxMarks;
    }
    public void setMarksObtain(int MarksObtain){
        this.MarksObtain=MarksObtain;
    }

    public String toString(){
        return "Subject ID: "+SubId+"\n"+"Name: "+name+"\n"+"MaxMarks: "+MaxMarks+"\n"+"MarksObtain: "+MarksObtain+"\n";

    }



}


public class StudentData {
    public static void main(String args[]){

        Sub subs[]=new Sub[3];
        subs[0]=new Sub("S101","DS",100,80);
        subs[1]=new Sub("S102","Alogorithms",100,78);
        subs[2]=new Sub("S102","C++",100,80);

        for (Sub x:subs) {
            System.out.println(x);

        }





    }
}
