class Rectangle2 {

    private long length;
    private long breadth;

    public long getLength(){
        return length;
    }
    public long getBreadth(){
        return breadth;
    }

    public void setLength(long l){
        length=l;
    }
    public void setBreadth(long b){
        breadth=b;
    }
    public long area(){
        return length*breadth;
    }

    public long perimeter(){
        return 2*(length+breadth);
    }

    public boolean isSquare(){
        //if(length==breadth) return true;
        //else return false;
        return length==breadth;
    }
}

public class getset {
    public static void main(String args[]){

        Rectangle2 R1=new Rectangle2();

        R1.setLength(3);
        R1.setBreadth(4);

        System.out.println("Area "+R1.area());
        System.out.println("perimeter "+R1.perimeter());
        System.out.println("is it square "+R1.isSquare());
        System.out.println("is it square "+R1.getLength());

    }
}
