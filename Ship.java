/** 
 * ACS-1904 lab 5
 * @Sveinson
*/

public class Ship{
    protected String name;
    protected String flag;
    protected int year;
    
    // constructors
    public Ship(){
        name = "unknown";
        flag = "unknown";
        year = 0;
    }
    
    public Ship(String n, String f, int y){
        name = n;
        flag = f;
        year = y;
    }
    
    // getters
    
    // setters
    
    // other
    /*****************************************
    * Description: gets ther person's name (first name last name)
    * 
    * @return       String: full name
    * ****************************************/  
    public String getName(){
        return name + ", " + flag;
    }
    
    /*****************************************
    * Description: overrides toString() gets the persons name and birthyear
    * 
    * @return      String: person info
    * ****************************************/ 
    @Override
    public String toString(){
        return name + ": " + year;
    }

}

    /*****************************************
    * Description: brief description of the methods purpose
    * 
    * @param        each parameter of the method should be listed with an @param
    * @param        parametername description of parameter
    * 
    * @return       any return value will be noted here
    * ****************************************/
