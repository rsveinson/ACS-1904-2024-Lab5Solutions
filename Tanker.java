/** 
 * ACS-1904 lab 5
 * @Sveinson
*/

public class Tanker extends Ship{
    private int capacity;
    private int length;
    
    // constructors
    public Tanker(){
        capacity = 0;
        length = 0;
    }
    
    //String n, String f, int y
    public Tanker(String n, String f, int y,  int c, int l){
        super(n, f, y);
        capacity = c;
        length = l;
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
        return name + ", " + capacity + "L, " + length + "m";
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
