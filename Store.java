
import java.util.ArrayList;


public class Store {
    private String name;
    private ArrayList<Customer> total_receipts = new ArrayList<>();
    
    Store(){}
    Store(String name){
        this.name=name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public ArrayList<Customer> getTotal_receipts() {
        return total_receipts;
    }
    public void setTotal_receipts(ArrayList<Customer> total_receipts) {
        this.total_receipts = total_receipts;
    }
    
    
    
}
