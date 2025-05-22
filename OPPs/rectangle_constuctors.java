class rect {
    private double length;
    private double breadth;


    public rect(){
        length=10;
        breadth=5;
    }

    public rect(int l, int b){
        length=l;
        breadth=b;

    }

    public double area(){
        return length*breadth;
    }

    public double perimeter(){
        return 2*(length+breadth);
    }

    public double getLength(){
        return length;
    }
    public double getBreadth(){
        return breadth;
    }
    public void setLength(double l){
        this.length=l;
    }
    public void setBreadth(double b){
        if(b<0) breadth=0;
        else breadth=b;
    }

}




public class rectangle_constuctors {
    public static void main(String args[]){
        rect r=new rect(23,34);

        r.setLength(40);
        r.setBreadth(32);


        System.out.println("Area: " + r.area());
        System.out.println("Perimeter: " + r.perimeter());
        System.out.println("Length: " + r.getLength());
        System.out.println("Breadth: " + r.getBreadth());




    }
}
