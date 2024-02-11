import java.util.Scanner;
/** 
 * ACS-1904 Assignment X Question Y
 * @author 
*/

public class Athlete{
    protected String name;
    protected String sport;
    
    // constructors
    public Athlete(){
        name = "unknow";
        sport = "uknown";
    }// end no-arg

    public Athlete(String name, String sport){
        this.name = name;
        this.sport = sport;
    }// end no-arg
    
    // getters
    public String getName(){
        return name;
    }// end get name
    
    public String getSport(){
        return sport;
    }// end get sport
    
    // setters
    
    // utilities
    @Override
    public String toString(){
        return name + " " + sport;
    }// end toString()
}

