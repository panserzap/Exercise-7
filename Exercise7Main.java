
import java.util.ArrayList;
//import java.util.Scanner;



public class Exercise7Main {
    public static void main(String args[]){
        //Scanner in = new Scanner(System.in);
        ArrayList<ItemsOrdered> my_Order = new ArrayList<>();
        ItemsOrdered tempOrder1= new ItemsOrdered("TypeCto3.5mm",25,3);
        ItemsOrdered tempOrder2= new ItemsOrdered("NVIDIA TITAN V",50,3000);
        
        Customer custom1 = new Customer("Panos");
        Store tempStore = new Store("eShop");
        my_Order.add(tempOrder1);
        my_Order.add(tempOrder2);
        
        Receipt receipt1 = new Receipt("Papasiopoulou 2-4","MyHouse",my_Order,100000,custom1,tempStore);
        
        
        System.out.println("Billing Adress: "+receipt1.getBilling_Adress()+
                "\nShipping Adress: "+receipt1.getShipping_Adress()+
                "\nTotal Price: "+receipt1.getTotal_Price()+
                "\nPaid: "+receipt1.getPaid()+
                "\nAmount Left to Pay: "+receipt1.getAmount_still_due()+
                "\nCustomer Name: "+receipt1.tempCustom.getName()+
                "\nStore Name: "+receipt1.tempStore.getName()+
                "\nItems Ordered:"+
                "\nItems Name: \n"+receipt1.getOrder().get(0).getItem_Name()+'\n'+receipt1.getOrder().get(1).getItem_Name());
    }
}

/*
We just filled an example so it is easy to understand the code and how the classes are connected.
With a few changes all these values could be entered through input,but because we believe that in this exercise you want to 
see whether we can "work" with classes we made it this way
*/