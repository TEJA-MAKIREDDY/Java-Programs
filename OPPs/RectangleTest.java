class Rectangle{

    public long length;
    public long breadth;


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



public class RectangleTest {
    public static void main(String args[]){
        Rectangle R1=new Rectangle();

        R1.length=3;
        R1.breadth=5;

        System.out.println("Area "+R1.area());
        System.out.println("perimeter "+R1.perimeter());
        System.out.println("is it square "+R1.isSquare());
    }
}
