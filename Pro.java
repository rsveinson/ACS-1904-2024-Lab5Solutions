import java.util.Scanner;
/** 
 * ACS-1904 Assignment X Question Y
 * @author 
 */

public class Pro extends Athlete{
    private double salary;

    //constructor
    public Pro(){
        // implicit call to the no-arg constructor in Athlete
        salary = 0.0;
    }// end no-arg

    public Pro(String name, String sport, double s){
        super(name, sport);
        salary = s;
    }// end full-arg

    // getters
    public double getSalary(){
        return salary;
    }// end get salary

    // setters

    // utilities
}


