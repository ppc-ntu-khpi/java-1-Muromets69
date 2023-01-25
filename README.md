[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-f4981d0f882b2a3f0472912d15f9806d57e124e0fc890972558857b51b24a6f9.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=9863955)


![README](Solution/advanced.png)

Код до класу Customer
``` java
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
    public void setIsNew(boolean isNew){
        this.isNew=isNew;
    }
    public void setTotal(float total){
        this.total=total;
    }

    public void displayCustomerInfo(){
        System.out.println("ID: "+ID+"\nIs new: "+isNew+"\nTotal purchases are: "+total);
    }
}
```
