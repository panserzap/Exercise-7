
import java.util.ArrayList;


public class Receipt {
    private String billing_Adress;
    private String shipping_Adress;
    private ArrayList<ItemsOrdered> order = new ArrayList<>();
    private float paid;
    private float total_Price;
    private float amount_still_due;
    Customer tempCustom = new Customer();
    Store tempStore =new Store();
    
    Receipt(String billing_Adress,String shipping_Adress/*,float amount_still_due*/,ArrayList<ItemsOrdered> order,float paid,Customer tempCustom,Store tempStore ){
        this.billing_Adress=billing_Adress;
        this.shipping_Adress=shipping_Adress;
        this.order= new ArrayList<ItemsOrdered> (order);
        this.paid=paid;
        /*this.amount_still_due=amount_still_due;*/
        this.tempCustom=tempCustom;
        this.tempStore=tempStore;
        
        
        for(ItemsOrdered current : order){
            total_Price=total_Price+current.getPrice()*current.getItem_Quantity();
        }
        
        this.amount_still_due=total_Price-paid;
        
    };
    public String getBilling_Adress() {
        return billing_Adress;
    }
    public void setBilling_Adress(String billing_Adress) {
        this.billing_Adress = billing_Adress;
    }
    public String getShipping_Adress() {
        return shipping_Adress;
    }
    public void setShipping_Adress(String shipping_Adress) {
        this.shipping_Adress = shipping_Adress;
    }
    public ArrayList<ItemsOrdered> getOrder() {
        return order;
    }
    public void setOrder(ArrayList<ItemsOrdered> order) {
        this.order = order;
    }
    public float getTotal_Price() {
        return total_Price;
    }
    public void setTotal_Price(float total_Price) {
        this.total_Price = total_Price;
    }
    public float getAmount_still_due() {
        return amount_still_due;
    }
    public void setAmount_still_due(float amount_still_due) {
        this.amount_still_due = amount_still_due;
    }
    public float getPaid() {
        return paid;
    }
    public void setPaid(float paid) {
        this.paid = paid;
    }
}
