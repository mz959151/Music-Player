import java.util.*;
public class Calendar1 {
    public static void main(String args[])
    {
        Calendar c = Calendar.getInstance();
        System.out.println("The Current Date is:" + c.getTime());
    }
}
import java.util.*;
public class Calendar2 {
    public static void main(String[] args)
    {
        // creating Calendar object
        Calendar calendar = Calendar.getInstance();
          
        // Demonstrate Calendar's get()method
        System.out.println("Current Calendar's Year: " + calendar.get(Calendar.YEAR));
        System.out.println("Current Calendar's Day: " + calendar.get(Calendar.DATE));
        System.out.println("Current MINUTE: " + calendar.get(Calendar.MINUTE));
        System.out.println("Current SECOND: " + calendar.get(Calendar.SECOND));
    }
}
