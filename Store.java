import java.util.Collection;
import java.util.HashMap;

/**
 * Abstract class Store - write a description of the class here
 * 
 * @author Jason Chan
 * @version Assignment 1
 */
public abstract class Store
{
    private Address address;
    private String name;
    
    private HashMap <String,Item> itemsForSale = new HashMap<String,Item>();
    
    public Store(Address address, String name)
    {
        this.address = address;
        this.name    = name;
    } //end constructor
    
    public void addItem(Item item){
        itemsForSale.put(item.getUniqueID(), item);
    }

    public Item getItemByKey(String key){
        return itemsForSale.get(key);
    }

    public Collection getCollectionOfItems(){
        return itemsForSale.values();
    }
}
