/** 
 * ACS-1904 lab 5
 * @Sveinson
*/

public class CruiseShip extends Ship{
    private String cruiseLine;
    private int passengers;
    
    // constructors
    public CruiseShip(){
        cruiseLine = "Unknown";
        passengers = 0;
    }
    
    //String fn, String ln, int by
    public CruiseShip(String n, String f, int y,  String cl, int p){
        super(n, f, y);
        cruiseLine = cl;
        passengers = p;
    }
    
    //getters
    
    // setters
    
    // other
    /*****************************************
    * Description: gets the instructor's name and degree
    * 
    * @return       String: initial name and degree
    * ****************************************/  
    public String getName(){
        return cruiseLine + ", " + name + ", " + passengers;
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
