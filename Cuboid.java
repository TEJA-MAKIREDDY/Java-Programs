import java.util.Scanner;
public class Cuboid {
    public static void main(String args[]){
        int length,breadth,height;
        double TotalArea,Volume,FrontArea,SideArea,TopArea,perimeter;

        System.out.println("Enter length,breadth and height: ");


        Scanner sc=new Scanner(System.in);
        length=sc.nextInt();
        breadth=sc.nextInt();
        height=sc.nextInt();



        TotalArea=2*(length*height+length*breadth+breadth*height);
        Volume=length*breadth*height;
        FrontArea=length*height;//front/back
        SideArea=breadth*height;//right/left
        TopArea=length*breadth;//top/bottom
        perimeter=2*(length+breadth);

        System.out.println("Total area of cuboid is: "+TotalArea);
        System.out.println("Volume of cuboid is: "+Volume);
        System.out.println("Front area of cuboid is: "+FrontArea);
        System.out.println("Side area of cuboid is: "+SideArea);
        System.out.println("TopArea of cuboid id:"+TopArea);
        System.out.println("perimeter of cuboid is: "+perimeter);
    }
}
