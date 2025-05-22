class Producer {
    private String itemNo;
    private String name;
    private double price;
    private int quantity;

    public String getItemNo() {
        return itemNo;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setprice(double price){
        this.price=price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Producer(String itemno,String pname){
        itemNo = itemno;
        this.name=pname;

    }
}

class Customer
{
    private String custId;
    private String name;
    private String address;
    private String phno;

    public Customer(String custId,String name)
    {
        this.custId=custId;
        this.address=name;
    }
    public Customer(String custId,String name,String address,String phno)
    {
        this.custId=custId;
        this.name=name;
        setAddress(address);
        setPhno(phno);
    }

    public String getCustId(){return custId;}
    public String getName(){return name;}
    public String getAddress(){return address;}
    public String getPhno(){return phno;}

    public void setAddress(String address)
    {
        this.address=address;
    }
    public void setPhno(String phno)
    {
        this.phno=phno;
    }
}



public class Product {

    public static void main(String args[]){

        Producer p=new Producer("byd1","seden");
        Customer c=new Customer("cust1","teja","samalkota","7367834");

        p.setprice(234);
        p.setQuantity(4);


        System.out.println("itemno: "+p.getItemNo());
        System.out.println("name: "+p.getName());
        System.out.println("price: "+p.getPrice());
        System.out.println("Quantity: "+p.getQuantity());

        System.out.println();

        System.out.println("Customer ID: "+c.getCustId());
        System.out.println("Name: "+c.getName());
        System.out.println("Address: "+c.getAddress());
        System.out.println("Mobile: "+c.getPhno());


    }
}