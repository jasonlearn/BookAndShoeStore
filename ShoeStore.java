import java.util.Collection;
import java.util.Iterator;

/**
 * Write a description of class ShoeStore here.
 * 
 * @author Jason Chan A00698160
 * @version Assignment 1
 */
class ShoeStore extends Store
{
    private ShoeType department;

    /**
     * Constructor to intialize object ShoeStore.
     * @param super to call constructor of Store class
     * @param department to set the variables for department
     */
    public ShoeStore(Address address, String name, ShoeType department){
        super(address, name);
        setDepartment(department);
        addShoes();
    } //end constructor

    /**
     * overload constructor to intialize object ShoeStore.
     * @param super to call constructor of Store class
     * @param department to set the variables for department and takes a String
     * as a parameter
     */
    public ShoeStore(Address address, String name, String department){
        super(address, name);
        this.department = ShoeType.get(department);
        addShoes();
    } //end constructor

    /**
     * Accessor.
     * @return department attribute.
     */
    public ShoeType getDepartment()
    {
        return department;
    } //end accessor

    /**
     * Mutator.
     * validates that parameter is not null
     * @param to set the variable for department
     */
    public void setDepartment(ShoeType department)
    {
        if( department != null ){
            this.department = department;
        }
        //else do nothing
    } //end mutator    

    /**
     * Method to initialize a shoe(s) object and add to collection of shoes
     */
    public void addShoes(){
        Name name = new Name("Skechers");
        Material material = Material.get("leather");
        ShoeType shoeType = ShoeType.get("men");
        Shoe s = new Shoe(1.0, 58.5, 90.0, "Diameter", material, 10, name, shoeType, java.awt.Color.darkGray);
        addItem(s);

        material = Material.get("plastic");
        shoeType = ShoeType.get("children");
        s = new Shoe(0.85, 32.5, 50.0, "Lite Kicks Rainbow Sprite", material, 10, name, shoeType, java.awt.Color.pink);    
        addItem(s);

        name = new Name("Robert", "Cobbler");
        material = Material.get("leather");
        shoeType = ShoeType.get("dress");
        s = new Shoe(1.15, 104.0, 160.0, "Wave", material, 12, name, shoeType, java.awt.Color.black);
        addItem(s);

        material = Material.get("cloth");
        shoeType = ShoeType.get("children");
        s = new Shoe(0.5, 39.0, 60.0, "Toachi", material, 5, name, shoeType, java.awt.Color.blue);
        addItem(s);

        name = new Name("Geox");
        material = Material.get("cloth");
        shoeType = ShoeType.get("men");
        s = new Shoe(1.0, 104.0, 160.0, "Monet", material, 7, name, shoeType, java.awt.Color.blue);
        addItem(s);

        material = Material.get("plastic");
        shoeType = ShoeType.get("women");
        s = new Shoe(0.9, 97.5, 150.0, "Marieclaire", material, 10, name, shoeType, java.awt.Color.gray);
        addItem(s);

        name = new Name("Nine", "West");
        material = Material.get("plastic");
        shoeType = ShoeType.get("women");
        s = new Shoe(0.85, 84.5, 130.0, "Camya Multi Glitter", material, 8, name, shoeType, java.awt.Color.black);
        addItem(s);

        name = new Name("Stride", "Rite");
        material = Material.get("rubber");
        shoeType = ShoeType.get("children");
        s = new Shoe(0.6, 45.5, 70.0, "Balance Of The Force", material, 9, name, shoeType, java.awt.Color.gray);
        addItem(s);

        name = new Name("Sperry");
        material = Material.get("cloth");
        shoeType = ShoeType.get("children");
        s = new Shoe(0.7, 39.0, 60.0, "Top-Sider Unisex Bluefish H&L", material, 9, name, shoeType, java.awt.Color.orange);
        addItem(s);

        name = new Name("Nike");
        material = Material.get("rubber");
        shoeType = ShoeType.get("sports");
        s = new Shoe(1.2, 117.0, 180.0, "Jordan Ace 23 II", material, 13, name, shoeType, java.awt.Color.white);
        addItem(s);
    } //end method

    /**
     * Displays all shoes by every designer, does not take any parameter
     */
    public void displayAllShoesAndDesigners(){
        Collection<Shoe> shoes = getCollectionOfItems(); //From the Store class
        Iterator<Shoe> it      = shoes.iterator();
        while(it.hasNext()){
            Shoe s = it.next();
            System.out.println(s.getDesignerFullName() + " offers " + s.getMaterialString() + 
                " size-" + s.getSize() + " " + s.getDepartmentString() + "'s " + s.getDescription());
        }
    } //end method

    /**
     * Displays all shoe by designer's name
     * @param name searches and displays all designer by this name.
     */
    public void displayAllShoesByDesigner(String designerName){
        Collection<Shoe> shoes = getCollectionOfItems();//From the Store class
        Iterator<Shoe> it      = shoes.iterator();
        boolean displayedAll   = false;
        while(it.hasNext()){
            Shoe s = it.next();
            if(s.getDesignerFullName().equalsIgnoreCase(designerName)){
                System.out.println(s.getDesignerFullName() + " offers a size-" + s.getSize() + " " +
                    s.getDepartmentString() + "'s " + s.getDescription());
                displayedAll = true;
            }
        }
        if(displayedAll == false){
            System.out.println("No designer by the name of " + designerName + " in the shoe store.");
        }
    } //end method

    /**
     * Displays all shoes made of parameter's material
     * @param displayAllShoesMadeOf to search through shoe store for this material
     */
    public void displayAllShoesMadeOf(Material material){
        Collection<Shoe> shoes = getCollectionOfItems();//From the Store class
        Iterator<Shoe> it      = shoes.iterator();
        boolean displayedAll   = false;
        while(it.hasNext()){
            Shoe s = it.next();
            if(material == s.getMaterial()){
                System.out.println("The size-" + s.getSize() + " " + s.getDescription() + " is made of "
                    + s.getMaterialString());
                displayedAll = true;
            }
        }
        if(displayedAll == false){
            System.out.println("No shoe in the store is made of the material " + material);
        }
    } //end method

    /**
     * Displays all shoes made of parameter's material as  String
     * @param displayAllShoesMadeOf to search through shoe store for this material
     */
    public void displayAllShoesMadeOf(String material){
        Collection<Shoe> shoes = getCollectionOfItems();//From the Store class
        Iterator<Shoe> it      = shoes.iterator();
        boolean displayedAll   = false;
        while(it.hasNext()){
            Shoe s = it.next();
            if(s.getMaterialString().equalsIgnoreCase(material)){
                System.out.println("The size-" + s.getSize() + " " + s.getDescription() + " is made of "
                    + s.getMaterialString());
                displayedAll = true;
            }
        }
        if(displayedAll == false){
            System.out.println("No shoe in the store is made of the material " + material);
        }
    } //end method

    /**
     * Displays number of shoe(s) by designer's name
     * @param name searches and displays number of shoe(s) made by this designer.
     */
    public void displayNumberOfShoesDesignedBy(Name designer){
        Collection<Shoe> shoes = getCollectionOfItems();//From the Store class
        Iterator<Shoe> it      = shoes.iterator();
        boolean displayedAll   = false;
        int counter            = 0;    
        if ( designer != null ) {
            while(it.hasNext()){
                Shoe s = it.next();
                if(s.getDesignerFullName().equalsIgnoreCase(designer.getFullName())){
                    counter ++;
                    displayedAll = true;
                }
            }
            System.out.println("This store has " + counter + " shoes designed by " +
                designer.getFullName());
            if(displayedAll == false){
                System.out.println("No designer by the name of " + designer.getFullName() + " in the shoe store.");
            }
        }
    } //end method

    /**
     * Displays number of shoe(s) by designer's last name, takes a String
     * @param name searches and displays number of shoe(s) made by this designer.
     */
    public void displayNumberOfShoesDesignedBy(String designerLastName){
        Collection<Shoe> shoes = getCollectionOfItems();//From the Store class
        Iterator<Shoe> it      = shoes.iterator();
        boolean displayedAll   = false;
        int counter            = 0;         
        while(it.hasNext()){
            Shoe s = it.next();
            String lastName = s.getDesigner().getLastName();
            if(s.getDesigner().getLastName() != null){
                if(lastName.equalsIgnoreCase(designerLastName)){
                    counter ++;
                    displayedAll = true;
                }
            }
        }
        System.out.println("This store has " + counter + " shoes designed by " +
            designerLastName);
        if(displayedAll == false){
            System.out.println("No designer by the name of " + designerLastName + " in the shoe store.");
        }
    } //end method

    /**
     * Displays the total weight of all shoe(s) in the store
     */
    public void displaySmallestShoeSize(){
        Collection<Shoe> shoes = getCollectionOfItems(); //From the Store class
        Iterator<Shoe> it = shoes.iterator();
        int smallestShoe = 100;
        boolean foundSmallestShoe = false;
        while(it.hasNext()){
            Shoe s = it.next();
            if(s.getSize() < 100){ 
                smallestShoe = s.getSize();
            }
            foundSmallestShoe = true;
        }
        if(foundSmallestShoe == false){
            System.out.println("There are no shoes in the shoe store.");
        }
        System.out.println("smallest shoe size: " + smallestShoe);
    } //end method

    /**
     * Displays the smallest shoe size in the store
     */
    public void displayTotalWeightKgOfAllShoes(){
        Collection<Shoe> shoes = getCollectionOfItems(); //From the Store class
        Iterator<Shoe> it = shoes.iterator();
        boolean allWeightKg = false;
        double totalWeightKg = 0.0;
        while(it.hasNext()){
            Shoe s = it.next();
            totalWeightKg += s.getWeightKg();
            allWeightKg = true;
        }
        if(allWeightKg == false){
            System.out.println("There are either no shoes in the store, or they are weightless.");
        }
        System.out.println("total kg of shoes: " + totalWeightKg);
    } //end method

    /**
     * Displays all shoes made by designer and material used
     * @param displayAllShoesOfThisMaterialMadeByThisDesigner to search through shoe store for 
     * this material AND designer name
     */
    public void displayAllShoesOfThisMaterialMadeByThisDesigner(Material material, Name designer){
        Collection<Shoe> shoes = getCollectionOfItems();//From the Store class
        Iterator<Shoe> it      = shoes.iterator();
        boolean displayedAll   = false;
        if( material != null){
            if( designer != null){
                while(it.hasNext()){
                    Shoe s = it.next();
                    if(s.getMaterial().getTheMaterial().equalsIgnoreCase(material.getTheMaterial())){
                        if(s.getDesigner().getFullName().equalsIgnoreCase(designer.getFullName())){
                            System.out.println("The " + s.getDescription() + " is a " + s.getMaterialString() +
                                " shoe offered by " + s.getDesignerFullName());
                            displayedAll = true;
                        }
                    }
                }
                if(displayedAll == false){
                    System.out.println("This store has no " + material.getTheMaterial() + " shoes designed by " 
                        + designer.getFullName());
                }
            }
        }
    } //end method

    /**
     * Display all shoes not in matching store.
     * Meaning this will display designer and shoe made that are not matching to store
     */
    public void displayAllShoesNotInMatchingStore(){
        Collection<Shoe> shoes     = getCollectionOfItems();//From the Store class
        Iterator<Shoe> it          = shoes.iterator();
        boolean foundAllNotMatching   = false;
        while(it.hasNext()){
            Shoe s = it.next();
            if( !(department.getTheShoeType().equalsIgnoreCase(s.getShoeType().getTheShoeType()))){
                System.out.println("The " + s.getDescription() + " is a " + s.getDepartmentString() + 
                    "'s shoe offered by " + s.getDesigner().getFullName());
                foundAllNotMatching = true;
            }
        }
        if(foundAllNotMatching == false){
            System.out.println("All shoes type matches the shoe store type");
        }
    } //end method

} //end class
