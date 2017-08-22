import java.awt.Color;

/**
 * Write a description of class Shoe here.
 * 
 * @author Jason Chan A00698160
 * @version Assignment 1
 */
public class Shoe extends Item
{
    private Material material;
    private int size;
    private Name designer;
    private ShoeType shoeType;
    private Color shoeColor;
    //private String description;
    
    public static final int MIN_SHOE_SIZE = 0;
    public static final int MAX_SHOE_SIZE = 20;
    
    /**
     * Constructor to initialize Shoe.
     * @param super to call constructor of Item class
     * @param material to set variables for material of shoe
     * @param size to set variables for shoe size
     * @param designer to set the variables for designer name
     * @param shoeType to set the variables for shoe type.
     */
    public Shoe(double weightKg, double manufacturingPriceDollars,
                double suggestedRetailPriceDollars, String uniqueID, 
                Material material, int size, Name designer, ShoeType shoeType,
                Color shoeColor)
    {
        super(weightKg, manufacturingPriceDollars, suggestedRetailPriceDollars,
              uniqueID);
        setMaterial (material);
        setSize     (size);
        setDesigner (designer);
        setShoeType (shoeType);
        setShoeColor(shoeColor);
    } //end constructor
    
    /**
     * Overloading constructor to initialize Shoe.
     * @param super to call constructor of Item class
     * @param material to set variables for material of shoe, accepts as String.
     * @param size to set variables for shoe size
     * @param designer to set the variables for designer name
     * @param shoeType to set the variables for shoe type
     */
    public Shoe(double weightKg, double manufacturingPriceDollars,
                double suggestedRetailPriceDollars, String uniqueID, 
                String material, int size, Name designer, ShoeType shoeType,
                Color shoeColor)
    {
        super(weightKg, manufacturingPriceDollars, suggestedRetailPriceDollars,
              uniqueID);
        setMaterial (Material.get(material));
        setSize     (size);
        setDesigner (designer);
        setShoeType (shoeType);
        setShoeColor(shoeColor);
    } //end constructor
    
    /**
     * Accessor.
     * @return color attribute
     */
    public Color getShoeColor()
    {
        return shoeColor;
    } //end accessor
    
    /**
     * Mutator
     * @param uniqueID to set variable for ISBN
     */
    public void setShoeColor(Color shoeColor)
    {
        if(shoeColor != null ){
            this.shoeColor = shoeColor;
        }
        // else do nothing
    } //end mutator
    
    /**
     * Accessor.
     * @return uniqueID attribute
     */
    public String getDescription()
    {
        return uniqueID;
    } //end accessor
    
    /**
     * Mutator
     * @param uniqueID to set variable for ISBN
     */
    public void setDescription(String uniqueID)
    {
        if(uniqueID != " " ){
            this.uniqueID = uniqueID;
        }
        // else do nothing
    } //end mutator
    
    /**
     * Accessor.
     * @return designer's full name
     */
    public String getDesignerFullName()
    {
        return designer.getFullName();
    } //end accessor
        
    
    /**
     * Accessor.
     * @return the department as a string
     */
    public String getDepartmentString()
    {
        return shoeType.getTheShoeType();
    } //end accessor

    /**
     * Accessor.
     * @return the material as a string
     */
    public String getMaterialString()
    {
        return material.getTheMaterial();
    } //end accessor
    
    /**
     * Accessor.
     * @return the material of class Shoe
     */
    public Material getMaterial()
    {
        return material;
    } //end accessor
    
    /**
     * Accessor.
     * @return the size of class Shoe
     */
    public int getSize()
    {
        return size;
    } //end accessor
    
    /**
     * Accessor.
     * @return the designer of class Shoe
     */
    public Name getDesigner()
    {
        return designer;
    } //end accessor
    
    /**
     * Accessor.
     * @return the shoeType of class Shoe
     */
    public ShoeType getShoeType()
    {
        return shoeType;
    } //end accessor
    
    /**
     * Mutator.
     * validates that material is not null
     * @param to set the material variable of class Shoe
     */
    public void setMaterial(Material material)
    {
        if(material != null){
            this.material = material;
        }
    } //end Mutator
    
    /**
     * Mutator.
     * validates that shoe size is greater than 0 and less than maximum size.
     * @param to set the size variable of class Shoe
     */
    public void setSize(int size)
    {
        if(size > MIN_SHOE_SIZE || size < MAX_SHOE_SIZE){
            this.size = size;
        }
    } //end Mutator
    
    /**
     * Mutator
     * validates that the designer is not null
     * @param to set the designer variable of class Shoe
     */
    public void setDesigner(Name designer)
    {
        if(designer != null){
            this.designer = designer;
        }
    } //end Mutator
    
    /**
     * Mutator
     * validates that the shoe type is not null
     * @param to set the shoeType variable of class Shoe
     */
    public void setShoeType(ShoeType shoeType)
    {
        if(shoeType != null){
            this.shoeType = shoeType;
        }
    } //end mutator
} //end class
