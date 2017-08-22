import java.util.Collection;
import java.util.Iterator;

/**
 * Write a description of class BookStore here.
 * 
 * @author Jason Chan
 * @version Assignment 1
 */
public class BookStore extends Store
{
    private BookType specialty;
    
    /**
     * Constructor to intialize object BookStore.
     * @param super to call constructor of Store class
     * @param specialty to set the variables for specialty
     */
    public BookStore(Address address, String name, BookType specialty){
        super(address, name);
        setSpecialty(specialty);
        addBooks();
    }  //end constructor
    
    /**
     * Overload constructor to intialize object BookStore.
     * @param super to call constructor of Store class
     * @param specialty to set the variables for specialty and takes a String 
     * as a paramter.
     */
    public BookStore(Address address, String name, String specialty){
        super(address, name);
        setSpecialty(BookType.get(specialty));
        addBooks();
    } //end constructor
    
    /**
     * Accessor.
     * @return specialty attribute.
     */
    public BookType speicalty()
    {
        return specialty;
    } //end accessor
    
    /**
     * Mutator.
     * @param to set the variable for specialty
     */
    public void setSpecialty(BookType specialty)
    {
        if(specialty != null){
            this.specialty = specialty;
        }
    } //end mutator

    /**
     * Method to initialize a book(s) object and add to collection of books
     */
    private void addBooks(){
        Date birthDate = new Date(1919, 1, 1);
        Name name = new Name("Jerome", "David", "Salinger");
        Author author = new Author(birthDate, name, "fiction", "JD") ;
        Date datePublished = new Date(1951, 5, 14);
        String title = "The Catcher in the Rye";
        BookType genre = BookType.get("fiction");
        Book b = new Book(0.4, 2.0, 4.0, "1234", author, datePublished, title, genre);
        addItem(b);

        datePublished = new Date(1948, 1, 31);
        title = "A Perfect Day for Bananafish";
        genre = BookType.get("fiction");
        b = new Book(1, 11, 12, "2345", author, datePublished, title, genre);
        addItem(b);

        datePublished = new Date(1945, 12, 12);
        title = "A Boy in France";
        genre = BookType.get("fiction");
        b = new Book(2, 33, 35, "3456", author, datePublished, title, genre);
        addItem(b);

        birthDate = new Date(1963, 9, 3);
        name = new Name("Malcolm", "Gladwell");
        author = new Author(birthDate, name, "nonfiction") ;
        datePublished = new Date(2008, 11, 18);
        title = "Outliers";
        genre = BookType.get("nonfiction");
        b = new Book(2.1, 2, 6, "4567", author, datePublished, title, genre);
        addItem(b);

        datePublished = new Date(2000, 3, 1);
        title = "The Tipping Point";
        genre = BookType.get("nonfiction");
        b = new Book(0.5, 3, 5, "5678", author, datePublished, title, genre);
        addItem(b);

        birthDate = new Date(1919, 11, 26);
        name = new Name("Frederik", "Pohl");
        author = new Author(birthDate, name, "sciencefiction", "Paul Dennis Lavond") ;
        datePublished = new Date(1977, 7, 4);
        title = "Gateway";
        genre = BookType.get("sciencefiction");
        b = new Book(0.01, 4, 4, "6789", author, datePublished, title, genre);
        addItem(b);

        datePublished = new Date(1937, 10, 6);
        title = "Elegy to a Dead Planet: Luna";
        genre = BookType.get("sciencefiction");
        b = new Book(0.1, 5, 11, "abcd", author, datePublished, title, genre);
        addItem(b) ;

        birthDate = new Date(1918, 5, 11);
        name = new Name("Richard", "Phillips", "Feynman");
        author = new Author(birthDate, name, "reference") ;
        datePublished = new Date(1942, 5, 20);
        title = "Principle of Least Action in Quantum Mechanics";
        genre = BookType.get("reference");
        b = new Book(0.8, 15, 30, "efgh", author, datePublished, title, genre);
        addItem(b);

        datePublished = new Date(1964, 6, 30);
        title = "The Messenger Lectures";
        genre = BookType.get("reference");
        b = new Book(0.6, 44, 45.5, "ijkl", author, datePublished, title, genre);
        addItem(b);

        datePublished = new Date(1985, 11, 1);
        title = "Surely You're Joking Mr. Feynman";
        genre = BookType.get("nonfiction");
        b = new Book(1.0, 3, 13, "mnop", author, datePublished, title, genre);
        addItem(b);
    } //end method

    /**
     * Displays all books by every author, does not take any parameter
     */
    public void displayAllBooksByEveryAuthor(){
        Collection<Book> allBooks = getCollectionOfItems(); //From the Store class
        Iterator<Book> it         = allBooks.iterator();
        while(it.hasNext()){
            Book b = it.next();
            System.out.println(b.getAuthor().getName().getLastName() + " wrote " + b.getTitle() + " in " +
                b.getYearPublished());
        }
    } //end method
    
    /**
     * Displays all books by author's last name
     * @param lastName searches and displays all author by this last name.
     */
    public void displayAllBooksByAuthor(String lastName){
        Collection<Book> booksByAuthor = getCollectionOfItems();//From the Store class
        Iterator<Book> it              = booksByAuthor.iterator();
        boolean displayedAll           = false;
        while(it.hasNext()){
            Book b = it.next();
            String lastNameOfAuthor = b.getAuthor().getName().getLastName();
            if(lastNameOfAuthor.equalsIgnoreCase(lastName)){
                System.out.println(b.getAuthor().getName().getLastName() + " wrote " + b.getTitle());
                displayedAll = true;
            }
        }
        if(displayedAll == false){
            System.out.println("No author by the last name of " + lastName);
        }
    } //end method
    
    /**
     * Displays all books written before the given year
     * @param displayAllBooksWrittenBefore takes an int which is the year of published
     */
    public void displayAllBooksWrittenBefore(int year){
        Collection<Book> allBooks = getCollectionOfItems(); //From the Store class
        Iterator<Book> it         = allBooks.iterator();
        boolean displayedAll       = false;
        while(it.hasNext()){
            Book b = it.next();
            int publishedYear = b.getYearPublished();
            if(publishedYear < year){
                System.out.println(b.getTitle() + " was published in " + b.getYearPublished() + 
                    ", which is before " + year);
                displayedAll = true;
            }
        }
        if(displayedAll == false){
            System.out.println("No books was published before year " + year);
        }
    } //end method
    
    /**
     * Displays Titles of books written by pseudonym of the author
     * @param pseudonym takes a String, pseudonym which is the nickname of the author
     */
    public void displayTitlesOfBooksWrittenBy(String pseudonym){
        Collection<Book> books = getCollectionOfItems(); //From the Store class
        Iterator<Book> it = books.iterator();
        boolean displayedAll = false;
        while(it.hasNext()){
            Book b = it.next();
            String author = b.getAuthor().getPseudonym();
            if(author != null){
                if(author.equalsIgnoreCase(pseudonym)){
                    System.out.println(b.getAuthor().getName().getLastName() + " wrote " + b.getTitle() +
                    " as " + b.getAuthor().getPseudonym());
                    displayedAll = true;
                }
            }
        }
        if(displayedAll == false){
            System.out.println("No author written any book as " + pseudonym);
        }
    } //end method
    
    /**
     * Displays all books of a genre
     * @param genre takes a String, genre is the book type of the book
     */
    public void displayAllBooksForGenre(String genre){
        Collection<Book> books = getCollectionOfItems(); //From the Store class
        Iterator<Book> it = books.iterator();
        boolean displayedAll = false;
        while(it.hasNext()){
            Book b = it.next();
            if(b.getGenreString().equalsIgnoreCase(genre)){
                System.out.println(b.getTitle() + " is a " + b.getGenreString() + " book written by " +
                b.getAuthor().getName().getLastName());
                displayedAll = true;
            }
        }
        if(displayedAll == false){
            System.out.println("The genre " + genre + " does not exist in this book store. ");
        }
    } //end method
    
    /**
     * Displays total weight of all books in the book store.
     * This method does not take any parameter.
     */
    public void displayTotalWeightKgOfAllBooks(){
        Collection<Book> books = getCollectionOfItems(); //From the Store class
        Iterator<Book> it = books.iterator();
        boolean allWeightKg = false;
        double totalWeightKg = 0.0;
        while(it.hasNext()){
            Book b = it.next();
            totalWeightKg = totalWeightKg + b.getWeightKg();
            allWeightKg = true;
        }
        if(allWeightKg == false){
            System.out.println("There are either no books in the book store, or they are weightless.");
        }
        System.out.println("total kg of books: " + totalWeightKg);
    } //end method
    
    /**
     * @param ageInYears takes int as a parameter to search for authors over this age.
     * will display all books written by author over the age taken in the parameter.
     */
    public void displayAllBooksWrittenByAuthorsOverThisAge(int ageInYears){
        Collection<Book> books = getCollectionOfItems(); // From the Store class
        Iterator<Book> it = books.iterator();
        boolean displayedSome = false;
        while(it.hasNext()){
            Book b = it.next();
            int ageYears = b.getDatePublished().getYear() - b.getAuthor().getBirthDate().getYear();
            if(ageYears > ageInYears){
                System.out.println(b.getTitle() + " was written by " + b.getAuthor().getName().getLastName() + " at age " + ageYears +
                    ", which is more than " + ageInYears);
                displayedSome = true;
            }
        }
        if(displayedSome == false){
            System.out.println("No books by authors over age " + ageInYears);
        }
    } //end method
    
    /**
     * Displays all books written by authors born on a certain day of the week
     * @param displayAllBooksWrittenByAuthorsBornOn takes a String, day of the week
     */
    public void displayAllBooksWrittenByAuthorsBornOn(String dayOfTheWeek){
        Collection<Book> books = getCollectionOfItems(); //From the Store class
        Iterator<Book> it = books.iterator();
        boolean displayedAll = false;
        while(it.hasNext()){
            Book b = it.next();
            
            if(b.getAuthor().getBirthDate().getDayOfTheWeek().equalsIgnoreCase(dayOfTheWeek)){
                System.out.println(b.getTitle() + " was written by " + b.getAuthor().getName().getLastName() + 
                ", who was born on a " + b.getAuthor().getBirthDate().getDayOfTheWeek());
                displayedAll = true;
            }
        }
        if(displayedAll == false){
            System.out.println("No authors were born on a " + dayOfTheWeek);
        }
    } //end method
    
    /**
     * Displays all book published on a certain day of the week
     * @param displayAllBooksPublishedOn takes a String, day of the week
     */
    public void displayAllBooksPublishedOn(String dayOfTheWeek){
        Collection<Book> books = getCollectionOfItems(); //From the Store class
        Iterator<Book> it = books.iterator();
        boolean displayedAll = false;
        while(it.hasNext()){
            Book b = it.next();
            String publishedOnDayOfTheWeek = b.getDatePublished().getDayOfTheWeek();
            if(publishedOnDayOfTheWeek.equalsIgnoreCase(dayOfTheWeek)){
                System.out.println(b.getTitle() + " was written by " + b.getAuthor().getName().getLastName() +
                ", which was published on a " + b.getDatePublished().getDayOfTheWeek());
                displayedAll = true;
            }
        }
        if(displayedAll == false){
            System.out.println("No books were published on a " + dayOfTheWeek);
        }
    } //end method
    
    /**
     * Displays all books written by authors with a pseudonym.
     * This method does not take any parameters
     */
    public void displayAllBooksWrittenByAuthorsWithAPseudonym(){
        Collection<Book> books = getCollectionOfItems(); //From the Store class
        Iterator<Book> it = books.iterator();
        boolean displayedAll = false;
        while(it.hasNext()){
            Book b = it.next();
            if(b.getAuthor().getPseudonym()!= null){
                System.out.println(b.getAuthor().getName().getLastName() + " wrote " +
                b.getTitle() + " as " + b.getAuthor().getPseudonym());
                displayedAll = true;
            }
        }
        if(displayedAll == false){
            System.out.println("No author of the colletion of books has a pseudonym");
        }
    } //end method
    
    /**
     * Displays the book with the biggest markup price in percentage
     */
    public void displayBookWithBiggestPercentageMarkup(){
        Collection<Book> books = getCollectionOfItems(); //From the Store class
        Iterator<Book> it = books.iterator();
        double markUpPercent = 0.0;
        double biggestMarkUp = 0.0;
        String highestRevenue = "";
        String author = "";
        boolean foundBiggestMarkUp = false;
        while(it.hasNext()){
            Book b = it.next();
            markUpPercent = b.getSuggestedRetailPriceDollars()/b.getManufacturingPriceDollars();
            if( markUpPercent > biggestMarkUp){
                    biggestMarkUp = markUpPercent;
                    highestRevenue = b.getTitle();
                    author = b.getAuthor().getName().getLastName();
                    foundBiggestMarkUp = true;
            }
        }
        System.out.println("Highest markup is " + biggestMarkUp*100 + "%, for " + highestRevenue
            + " by " + author);
        if(foundBiggestMarkUp == false){
            System.out.println("There are no books in the book store");
        }
    } //end method
    
    /**
     * Displays all books written outside speacilty
     */
    public void displayAllBooksWrittenOutsideSpecialty()
    {
        Collection<Book> books = getCollectionOfItems(); //From the Store class
        Iterator<Book> it = books.iterator();
        boolean bookOutsideGenre = false;
        while(it.hasNext()){
            Book b = it.next();
            if(!(b.getAuthor().getGenre().getTheBookType().equalsIgnoreCase(b.getGenreString()))){
                System.out.println(b.getAuthor().getName().getLastName() + " usually wrote " +
                b.getAuthor().getGenre().getTheBookType() + " but wrote " + b.getTitle() + 
                " which is " + b.getGenre().getTheBookType());
                bookOutsideGenre = true;
            }
        }
        if(bookOutsideGenre == false){
            System.out.println("There are no books in the book store out outside specialty");
        }
    } //end method
} //end class
