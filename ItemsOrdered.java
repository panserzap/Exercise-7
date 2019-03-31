
public class ItemsOrdered {
    private String item_Name;
    private int item_Quantity;
    private float price;
    
    ItemsOrdered(String item_Name,int item_Quantity,float price){
        this.item_Name=item_Name;
        this.item_Quantity=item_Quantity;
        this.price=price;
    }

    public String getItem_Name() {
        return item_Name;
    }
    public void setItem_Name(String item_Name) {
        this.item_Name = item_Name;
    }
    public int getItem_Quantity() {
        return item_Quantity;
    }
    public void setItem_Quantity(int item_Quantity) {
        this.item_Quantity = item_Quantity;
    }
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    
    
    
}
