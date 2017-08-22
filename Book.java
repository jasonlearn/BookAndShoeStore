/**
 * Write a description of class Book here.
 * 
 * @author Jason Chan 
 * @version Assignment 1
 */
public class Book extends Item
{
    private Author author;
    private Date datePublished;
    private String title;
    private BookType genre;
    //private String ISBN;
    
    /**
     * Constructor to initialize object Book.
     * @param super to call constructor of Item class
     * @param author to set variables for author of book
     * @param datePublished to set variables for datePublished
     * @param title to set the variables for title of the book
     * @param genre to set the variables for genre of the book.
     */
    public Book(double weightKg, double manufacturingPriceDollars,
                double suggestedRetailPriceDollars, String uniqueID,
                Author author, Date datePublished, String title, 
                BookType genre)
    {
        super(weightKg, manufacturingPriceDollars, suggestedRetailPriceDollars,
              uniqueID);
        setAuthor       (author);
        setDatePublished(datePublished);
        setTitle        (title);
        setGenre        (genre);
    } //end constructor
    
    /**
     * Accessor.
     * @return uniqueID attribute
     */
    public String getISBN()
    {
        return uniqueID;
    } //end accessor
    
    /**
     * Mutator
     * @param uniqueID to set variable for ISBN
     */
    public void setISBN(String uniqueID)
    {
        if(uniqueID != null && uniqueID != " " ){
            this.uniqueID = uniqueID;
        }
        // else do nothing
    } //end mutator
    
    /**
     * Accessor.
     * @return yearPublished of the book
     */
    public int getYearPublished()
    {
        return datePublished.getYear();
    } //end mutator
    
    /**
     * Accessor.
     * @return author's full name
     */
    public String getAuthorFullName()
    {
        return author.getName().getFullName();
    } //end accessor
    
    /**
     * Accessor.
     * @return the genre as a string
     */
    public String getGenreString()
    {
        return genre.getTheBookType();
    } //end accessor
    
    /**
     * Accessor.
     * @return author attribute
     */
    public Author getAuthor()
    {
        return author;
    } //end accessor

    /**
     * Accessor.
     * @return datePublished attribute
     */
    public Date getDatePublished()
    {
        return datePublished;
    }  //end accessor
    
    /**
     * Accessor.
     * @return title attribute
     */
    public String getTitle()
    {
        return title;
    }  //end accessor
    
    /**
     * Accessor.
     * @return genre attribute
     */
    public BookType getGenre()
    {
        return genre;
    }  //end accessor
    
    /**
     * Mutator.
     * @param author to set variables to Book
     */
    public void setAuthor(Author author)
    {
        if( author != null ){
            this.author = author;
        }
    } //end mutator
    
    /**
     * Mutator.
     * @param title to set variables to Book
     */
    public void setDatePublished(Date datePublished)
    {
        if(datePublished != null){
            this.datePublished = datePublished;
        }
    } //end mutator    
    
    /**
     * Mutator.
     * @param title to set variables to Book
     */
    public void setTitle(String title)
    {
        if( title != " " ){
            this.title = title;
        }
    } //end mutator
    
    /**
     * Mutator.
     * @param genre to set variables to Book
     */
    public void setGenre(BookType genre)
    {
        if( genre != null ){
            this.genre = genre;
        }
    } //end mutator
} //end class
