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
    String message;
    String greetingName;
    private Calendar cal = Calendar.getInstance();
    private Calendar morning = Calendar.getInstance();
    private Calendar afternoon = Calendar.getInstance();
    private Calendar evening = Calendar.getInstance();

    public WelcomeService(String gn) {
        //cal.set(Calendar.HOUR_OF_DAY, 14);
        greetingName=gn;
        setGreeting(cal);
        //System.out.println(greeting);
        composeGreetingMessage(greetingName);
        //System.out.println(message);
                
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
    public String composeGreetingMessage(String name){
        message = "Good "+greeting+ ", "+name+". Welcome!";
        System.out.println(message);
       return message; 
    }
    

//    public static void main(String[] args) {
//        WelcomeService ws=new WelcomeService("Teresa");
//        
//    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
}

