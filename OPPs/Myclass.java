 class circle {

    public double radius;

    public double area(){
        return Math.PI*radius*radius;
    }

    public double perimeter(){
        return 2*Math.PI*radius;
    }

    public double circumference(){
        return perimeter();
    }

}
public class Myclass{
    public static void main(String args[]){


        circle c1=new circle();

        c1.radius=7;

        System.out.println("area "+c1.area());
        System.out.println("perimeter "+c1.perimeter());
        System.out.println("circumference "+c1.circumference());

        System.out.println();


        circle c2=new circle();

        c2.radius=12;

        System.out.println("area "+c2.area());
        System.out.println("perimeter "+c2.perimeter());
        System.out.println("circumference "+c2.circumference());



    }


}