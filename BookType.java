import java.util.Map;
import java.util.HashMap;

/**
 * Write a description of class BookStore here.
 * 
 * @author Jason Chan
 * @version Assignment 1
 */
public enum BookType 
{
    FICTION("fiction"),
    NONFICTION("nonfiction"),
    SCIENCEFICTION("sciencefiction"),
    REFERENCE("reference");
    
    private String theBookType;
    private static Map<String, BookType> lookup = new HashMap<String, BookType>();
    
    /**
     * To lookup to values of the enum
     */
    static{ 
        for (BookType b : BookType.values()){
            lookup.put(b.getTheBookType(), b);
        }
    } //end method
    
    /**
     * Mutator
     * @param to set the variable for theBookType
     */
    private BookType(String theBookType) {
        this.theBookType = theBookType;
    } //end mutator

    /**
     * Accessor.
     * @return theBookType attribute as a String
     */
    public String getTheBookType() {
        return theBookType;
    } //end accessor
    
    /**
     * the following method allows me to create a BookType enum from a String!
     * e.g. in the Book class, I could set the BookType instance variable to:
     * bookType = BookType.get(“fiction”);
     */
    public static BookType get(String theBookType) {
        return lookup.get(theBookType);
    } //end method
} //end class
