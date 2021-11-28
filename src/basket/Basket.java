package basket;

import java.util.ArrayList;

/**
* The class Basket models a total price in a shopping basket.
*/

public class Basket
{
    private ArrayList<Item> items;
    private double total;
    
    /** constructor to set the total price */
    public Basket()
    {
        items = new ArrayList<>();
        total = 0;
    }
    
    /** applying a discount if the item price is more than 10 */
    public void applyDiscount(){
        for(Item it: items){
            if(it.getPrice() >= 10){
                it.discount();
            }
        }
    }
    
    public void addItem(double price)
    {
        items.add(new Item(price));
    }
    
    public void setTotal()
    {
        total = 0;
        for(Item it: items)
        {
            total += it.getPrice();
        }
    }
    
    public void printTotalCost()
    {
        setTotal();
        System.out.printf("%.2f", total);
    }
}