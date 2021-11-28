package basket;

/**
* The class Item models an item in a shopping basket.
*/
public class Item
{
    double price;
   
    /** constructor to set the item price */
    public Item(double aPrice)
    {
        price = aPrice;
    }
   
    /** return the current price of this item */
    public double getPrice()
    {
        return price;
    }
   
    /** apply a 10% discount to an item's price */
    public void discount()
    {
        price = price - price * 0.1;
    }
}