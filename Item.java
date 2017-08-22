
/**
 * Write a description of class Item here.
 * 
 * @author Jason Chan A00698160
 * @version Assignment 1
 */
public abstract class Item
{
    private double weightKg;
    private double manufacturingPriceDollars;
    private double suggestedRetailPriceDollars;
    public String uniqueID;
    
    public static final double MIN_WEIGHT_KG = 0.0;
    public static final double MAX_WEIGHT_KG = 50.0;
    
    public static final double MIN_COST_PRICE = 0.0;
    
    public static final double MIN_RETAIL_PRICE = 0.0;
    
    /**
     * Constructor to initialize Item
     * @param weightKg to set variable for weightKg
     * @param manufacturingPriceDollars to set manufacturingPriceDollars
     * @param suggestedRetailPriceDollars to set suggestedRetailPriceDollars
     * @param uniqueID to set uniqueID
     */
    public Item(double weightKg, double manufacturingPriceDollars, 
                double suggestedRetailPriceDollars, String uniqueID)
    {
        this.weightKg                    = weightKg;
        this.manufacturingPriceDollars   = manufacturingPriceDollars;
        this.suggestedRetailPriceDollars = suggestedRetailPriceDollars;
        this.uniqueID                    = uniqueID;
    } //end constructor
                
    /**
     * Accessor.
     * @return weightKg attribute
     */
    public double getWeightKg()
    {
        return weightKg;
    } //end accessor
    
    /**
     * Accessor.
     * @return manufacturingPriceDollars attribute
     */
    public double getManufacturingPriceDollars()
    {
        return manufacturingPriceDollars;
    } //end accessor
    
    /**
     * Accessor.
     * @return suggestedRetailPriceDollars attribute
     */
    public double getSuggestedRetailPriceDollars()
    {
        return suggestedRetailPriceDollars;
    } //end accessor
    
    /**
     * Accessor.
     * @return uniqueID attribute
     */
    public String getUniqueID()
    {
        return uniqueID;
    } //end accessor
    
    /**
     * Mutator.
     * @param to set weightKg variable of class Item
     * weight of item is greater than 0.0 kg and does not exceed 50.0 kg.
     */
    public void setWeightKg(double weightKg)
    {
        if( weightKg > MIN_WEIGHT_KG || weightKg < MAX_WEIGHT_KG ){
            this.weightKg = weightKg;
        }
    } // end mutator
    
    /**
     * Mutator.
     * @param to set manufacturingPriceDollars variable of class Item
     * variable of manufacturingPriceDollars is greater than 0.0
     */
    public void setManufacturingPriceDollars(double manufacturingPriceDollars)
    {
        if( manufacturingPriceDollars > MIN_COST_PRICE ){
            this.manufacturingPriceDollars = manufacturingPriceDollars;
        }
    } // end mutator
    
    /**
     * Mutator.
     * @param to set suggestedRetailPriceDollars variable of class Item
     * variable of suggestedRetailPriceDollars is greater than 0.0
     */
    public void setSuggestedRetailPriceDollars(double suggestedRetailPriceDollars)
    {
        if( suggestedRetailPriceDollars > MIN_RETAIL_PRICE ){
            this.suggestedRetailPriceDollars = suggestedRetailPriceDollars;
        }
    } // end mutator
    
    /**
     * Mutator.
     * @param to set uniqueID variable of class Item
     * variable of uniqueID must be a valid String
     */
    public void setUniqueID(String uniqueID)
    {
        if( uniqueID != null && uniqueID != " " ){
            this.uniqueID = uniqueID;
        }
    } // end mutator
} //end class
