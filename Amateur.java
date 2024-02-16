import java.util.Scanner;
/** 
 * ACS-1904 Assignment X Question Y
 * @author 
 */

public class Amateur extends Athlete{

    private boolean eligible;

    // constructor
    public Amateur(String name, String sport, boolean e){
        super(name, sport);
        eligible = e;
    }// end full-arg

    // getters

    public boolean isEligible(){
        return this.eligible;
    }

    // setters

    // utilities
    @Override
    public String toString(){
        StringBuilder st = new StringBuilder();
        st.append("Amateur: " + name + "\n");
        st.append("Sport: " + sport + "\n");
        st.append("Eligible: " + (eligible ? "Eligible" : "Not Eligible"));
        
        return st.toString();
    }

}

