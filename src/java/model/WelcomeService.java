package model;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Lesson 2 - Lab 4
 *
 * @author Teresa Mahoney
 */
public class WelcomeService {

    String greeting;
    private Calendar cal = Calendar.getInstance();
    private Calendar morning = Calendar.getInstance();
    private Calendar afternoon = Calendar.getInstance();
    private Calendar evening = Calendar.getInstance();

    public WelcomeService() {
        setGreeting(cal);
        System.out.println(greeting);
                
    }

    public String setGreeting(Calendar cd) {
        morning.set(Calendar.HOUR_OF_DAY, 0);
        morning.set(Calendar.MINUTE, 0);
        morning.set(Calendar.SECOND, 0);
        morning.set(Calendar.MILLISECOND, 0);
        afternoon.set(Calendar.HOUR_OF_DAY, 12);
        afternoon.set(Calendar.MINUTE, 1);
        afternoon.set(Calendar.SECOND, 0);
        afternoon.set(Calendar.MILLISECOND, 0);
        evening.set(Calendar.HOUR_OF_DAY, 19);
        evening.set(Calendar.MINUTE, 1);
        evening.set(Calendar.SECOND, 0);
        evening.set(Calendar.MILLISECOND, 0);

        if ((cd.after(morning)) && (cd.before(afternoon)) && (cd.before(evening))) {
            greeting = "Morning";
        } else if ((cd.after(morning)) && (cd.after(afternoon)) && (cd.before(evening))) {
            greeting = "Afternoon";
        } else {
            greeting = "Evening";
        }
        return greeting ;
    }

    public static void main(String[] args) {
        WelcomeService ws=new WelcomeService();
        
    }
    
}

