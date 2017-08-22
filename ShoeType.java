import java.util.Map;
import java.util.HashMap;

/**
 * Enumeration class ShoeType - write a description of the enum class here
 * 
 * @author Jason Chan
 * @version Assignment 1
 */
public enum ShoeType
{
    WOMEN("women"),
    MEN("men"),
    CHILDREN("children"),
    SPORTS("sports"),
    DRESS("dress");
    
    private String theShoeType;
    private static Map<String, ShoeType> lookup = new HashMap<String, ShoeType>();
    
    /**
     * To lookup values of the enum
     */
    static{
        for(ShoeType s : ShoeType.values()){
            lookup.put(s.getTheShoeType(), s);
        }
    } //end method
    
    /**
     * Mutator
     * @param to set the variable for theShoeType
     */
    private ShoeType(String theShoeType){
        this.theShoeType = theShoeType;
    } //end mutator
    
    /**
     * Accessor.
     * @return theShoeType attribute
     */
    public String getTheShoeType(){
        return theShoeType;
    } //end accessor
    
    /**
     * the following method allows me to create a ShoeType enum from a String!
     */
    public static ShoeType get(String theShoeType){
        return lookup.get(theShoeType);
    } //end method
}
