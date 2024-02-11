
import java.util.Scanner;
import java.util.ArrayList;
/** 
 * ACS-1904 Assignment X Question Y
 * @author 
 */

public class Athletes{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Athlete a = new Athlete("Pele", "Football");
        Pro p = new Pro("Klammer", "Skiing", 100000.00);
        Amateur am = new Amateur("Indurain", "Cycling", false);

        ArrayList<Athlete> athletes = new ArrayList();

        athletes.add(a);
        athletes.add(p);
        athletes.add(am);

        System.out.println(a.getSport());
        System.out.println(am);
        
        System.out.println(athletes.get(1) instanceof Amateur ? "Amateur." : "Not an Amateur.");


        System.out.println("end of program");
    }
}




