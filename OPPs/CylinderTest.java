class Cylinder{

    public double radius;
    public double height;


    public double SideSurfaceArea(){
        return 2*Math.PI*radius*height;
    }

    public double TotalSurfaceArea(){
        return 2*Math.PI*radius*(radius+height);
    }

    public double Volume(){
        return Math.PI*(radius*radius)*height;
    }

}


public class CylinderTest {
    public static void main(String args[]){

        Cylinder c1=new Cylinder();

        c1.radius=5;
        c1.height=7;

        System.out.printf("SideSurfaceArea: %.2f\n", c1.SideSurfaceArea());
        System.out.println("TotalSurfaceArea "+c1.TotalSurfaceArea());
        System.out.println("Volume "+c1.Volume());
        



    }
}
