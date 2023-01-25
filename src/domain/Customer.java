package domain;

public class Customer {
    public Customer(){
        ID = 1;
        isNew = true;
        total = 1200.50F;
    }
    private int ID;
    private boolean isNew;
    private float total;

    public void setID(int ID){
        this.ID=ID;
    }
    public void isNew(boolean isNew){
        this.isNew=isNew;
    }
    public void setTotal(float total){
        this.total=total;
    }

    public void displayCustomerInfo(){
        System.out.println("ID: "+ID+"\nIs new: "+isNew+"\nTotal purchases are: "+total);
    }
}
