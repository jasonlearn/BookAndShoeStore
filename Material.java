import java.util.Map;
import java.util.HashMap;

/**
 * Enumeration class Material - write a description of the enum class here
 * 
 * @author Jason Chan A00698160
 * @version Assignment 1
 */
public enum Material
{
    PLASTIC("plastic"), 
    LEATHER("leather"), 
    RUBBER("rubber"), 
    CLOTH("cloth");
    
    private String theMaterial;
    private static Map<String, Material> lookup = new HashMap<String, Material>();
   
    /**
     * To lookup values of the enum
     */
    static{
        for(Material s : Material.values()){
            lookup.put(s.getTheMaterial(), s);
        }
    } //end method
    
    /**
     * Mutator
     * @param to set the variable for theBookType
     */
    private Material(String theMaterial){
        this.theMaterial = theMaterial;
    } //end mutator
    
    /**
     * Accessor.
     * @return theBookType attribute
     */
    public String getTheMaterial(){
        return theMaterial;
    } //end accessor
    
    /**
     * the following method allows me to create a ShoeType enum from a String!
     */
    public static Material get(String theMaterial){
        return lookup.get(theMaterial);
    } //end method
} //end class
