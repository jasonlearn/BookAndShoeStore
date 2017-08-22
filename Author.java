/**
 * Write a description of class Author here.
 * 
 * @author Jason Chan A00698160
 * @version Assignment 1
 */
public class Author
{
    private Date birthDate;
    private Name name;
    private BookType genre;
    private String pseudonym;
    
    /**
     * Constructor to initilize the object
     * @param birthDate to set the variables for birthDate
     * @param name to set the variables for name
     * @param genre to set the variables for genre
     */
    public Author(Date birthDate, Name name, String genre)
    {
        setBirthDate(birthDate);
        setName     (name);
        setGenre    (BookType.get(genre));
    } //end constructor
    
    /**
     * Overloaded constructor to initilize the object
     * @param birthDate to set the variables for birthDate
     * @param name to set the variables for name
     * @param genre to set the variables for genre
     * @param pseudonym to set the variables for pseudonym
     */
    public Author(Date birthDate, Name name, BookType genre, String pseudonym)
    {
        setBirthDate(birthDate);
        setName     (name);
        setGenre    (genre);
        setPseudonym(pseudonym);
    } //end constructor
    
    /**
     * Overloaded constructor to initilize the object
     * @param birthDate to set the variables for birthDate
     * @param name to set the variables for name
     * @param genre to set the variables for genre and accepts a String
     * @param pseudonym to set the variables for pseudonym
     */
    public Author(Date birthDate, Name name, String genre, String pseudonym)
    {
        setBirthDate(birthDate);
        setName     (name);
        setGenre    (BookType.get(genre));
        setPseudonym(pseudonym);
    } //end constructor    
    
    /**
     * Accessor.
     * @return birthDate attribute
     */
    public Date getBirthDate()
    {
        return birthDate;
    } //end accessor
    
    /**
     * Accessor.
     * @return name attribute
     */
    public Name getName()
    {
        return name;
    } //end accessor
    
    /**
     * Accessor.
     * @return genre attribute
     */
    public BookType getGenre()
    {
        return genre;
    } //end accessor
    
    /**
     * Accessor.
     * @return pseudonym attribute
     */
    public String getPseudonym()
    {
        return pseudonym;
    } //end accessor
    
    /**
     * Mutator.
     * @param to change variables birthDate for object Author
     */
    public void setBirthDate(Date birthDate)
    {
        if(birthDate != null){
            this.birthDate = birthDate;
        }
        //else do nothing
    } //end mutator
    
    /**
     * Mutator.
     * @param to change variables name for object Author
     */
    public void setName(Name name)
    {
        if(name != null){
            this.name = name;
        }
        //else do nothing
    } //end mutator
    
    /**
     * Mutator.
     * @param to change variables genre for object Author
     */
    public void setGenre(BookType genre)
    {
        if(genre != null){
            this.genre = genre;
        }
        //else do nothing
    } //end mutator
    
    /**
     * Mutator.
     * @param to change variables pseudonym for object Author
     */
    public void setPseudonym(String pseudonym)
    {
        if(pseudonym != " "){
            this.pseudonym = pseudonym;
        }
        //else do nothing
    } //end mutator
}
