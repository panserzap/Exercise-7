
import java.util.ArrayList;


public class Customer {
    private String name;
    private ArrayList<Receipt> customer_Receipt = new ArrayList<>();
    
    Customer(){}
    Customer(String name){
        this.name=name;
    }
  
    public ArrayList<Receipt> getCustomer_Receipt() {
        return customer_Receipt;
    }
    public void setCustomer_Receipt(ArrayList<Receipt> customer_Receipt) {
        this.customer_Receipt = customer_Receipt;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
