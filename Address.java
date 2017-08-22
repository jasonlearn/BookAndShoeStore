
/**
 * Write a description of class Address here.
 * 
 * @author Jason Chan
 * @version Assignment 1
 */
public class Address
{
    private String streetNumber;
    private String streetName;
    private String city;
    private String postalCode;
    
    /**
     * Non-default constructor.  
     * Initializes the object Address with String streetNumber, streetName, city, and postalCode
     * @param streetNumber to set variables of class object
     * @param streetName to set variables of class object
     * @param city to set variables of class object
     * @param postalCode to set variables of class object
     */ 
    public Address(String streetNumber, String streetName, String city, String postalCode)
    {
        this.streetNumber = streetNumber;
        this.streetName   = streetName;
        this.city         = city;
        this.postalCode   = postalCode;
    } //end constructor
    
    /**
     * Accessor.
     * @return streetNumber attribute
     */
    public String getStreetNumber()
    {
        return streetNumber;
    } //end accessor
    
    /**
     * Accessor.
     * @return streetName attribute
     */
    public String getStreetName()
    {
        return streetName;
    } //end accessor
    
    /**
     * Accessor.
     * @return city attribute
     */
    public String getCity()
    {
        return city;
    } //end accessor
    
    /**
     * Accessor.
     * @return postalCode attribute
     */
    public String getPostalCode()
    {
        return postalCode;
    } //end accessor
    
    /**
     * Mutator
     * @param streetNumber to set variables to Addess
     */
    public void setStreetNumber(String streetNumber)
    {
        if( streetNumber != null && streetNumber != ""){
            this.streetNumber = streetNumber;
        }
    } //end mutator
    
    /**
     * Mutator
     * @param streetName to set variables to Addess
     */
    public void setStreetName(String streetName)
    {
        if( streetName != null && streetName != ""){
            this.streetName = streetName;
        }
    } //end mutator
    
    /**
     * Mutator
     * @param city to set variables to Addess
     */
    public void setCity(String city)
    {
        if( city != null && city != ""){
            this.city = city;
        }
    } //end mutator
    
    /**
     * Mutator
     * @param postalCode to set variables to Addess
     */
    public void setPostalCode(String postalCode)
    {
        if( postalCode != null && postalCode != ""){
            this.postalCode = postalCode;
        }
    } //end mutator
} //end class
