/**
 * Write a description of class Name here.
 * 
 * @author Jason Chan A00698160 
 * @version Assignment 1
 */
public class Name
{
    private String firstName;
    private String middleName;
    private String lastName;
       
    /**
     * Constructor for object of class Name for both first and last name.
     * @param firstName to set variables of Name
     * @param lastName to set variables of Name
     */
    public Name(String firstName, String lastName)
    {
        setFirstName    (firstName);
        setLastName     (lastName);
    } //end constructor
    
    /**
     * Constructor for object of class Name for both first, middle and last name.
     * @param firstName to set variables of Name
     * @param lastName to set variables of Name
     * @param middleName to set variables of Name
     */
    public Name(String firstName, String middleName, String lastName)
    {
        setFirstName    (firstName);
        setMiddleName   (middleName);
        setLastName     (lastName);
    } //end constructor

    /**
     * Constructor for objects of class Name for only first name
     * @param firstName to set variables of Name
     */
    public Name(String firstName)
    {
        setFirstName    (firstName);
    } //end constructor
    
    /**
     * Accessor
     * @return firstName attribute
     */
    public String getFirstName()
    {
        return firstName;
    } //end accessor
    
    /**
     * Accessor
     * @return middleName attribute
     */
    public String getMiddleName()
    {
        return middleName;
    } //end accessor
    
    /**
     * Accessor
     * @return middleName attribute
     */
    public String getLastName()
    {
        return lastName;
    } //end accessor
    
    /**
     * Mutator.
     * @param firstName to set variables to Name
     */
    public void setFirstName(String firstName)
    {
        if(firstName != ""){
            this.firstName = firstName;
        }
        else{
            this.firstName = "";
        }
    } //end mutator
    
    /**
     * Mutator.
     * @param middleName to set variables to Name
     */
    public void setMiddleName(String middleName)
    {
        if(middleName != ""){
            this.middleName = middleName;
        }
        else{
            this.middleName = "";
        }
    } //end mutator
    
    /**
     * Mutator.
     * @param lastName to set variables to Name
     */
    public void setLastName(String lastName)
    {
        if(lastName != ""){
            this.lastName = lastName;
        }
        else{
            this.lastName = "";
        }
    } //end mutator
    
        /**
     * @return first name as full name if no middle or last name
     * @return first and last name as full name if no middle name
     * @return full name
     */
    public String getFullName()
    {
        String fullName = "";
        if ( firstName != null ) {
            fullName+=firstName;
            if ( middleName != null ) {
                fullName+= " " + middleName;
            }
            if ( lastName != null ) {
                fullName+= " " + lastName;
            }
        }
        return fullName;
        /**if( firstName != null && lastName != null && middleName == null){
           return firstName + " " + lastName;
        }
        else if( middleName == null && lastName == null){
            return firstName;
        }
        else{
            return firstName + " " + middleName + " " + lastName;
        }
        */
    } //end method
}
