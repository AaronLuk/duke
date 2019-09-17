package Task;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Event class
 */
public class Events extends Task {

    private String time;
    private String event;
    private SimpleDateFormat sdf;
    private Date date;


    /**
     * Constructor of event task
     * @param name of task
     * @param priority of the task
     */
    public Events(String name, String time, int priority){
        super(name, priority);
        this.time = time.trim();
        event = "[E]";
        sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm");
    }


    /**
     * Converts date and time of event
     * @return  date and time
     * @throws ParseException
     */
    public String convertDate() throws ParseException {
        date = sdf.parse(this.time);
        return sdf.format(date);
    }

    /**
     * Details of event
     * @return details of event
     */
    public String toString(){
        if(done){
            return event + "[/][" + priority + "] " + " (at: " + time + ")";
        } else {
            return event + "[X][" + priority + "] " + " (at: " + time + ")";
        }
    }

    public String toFile() throws ParseException {
        if(done){
            return "E | 1 | " + priority + " | " +  name + " | " +  convertDate();
        } else {
            return "E | 0 | " + priority + " | " +  name + " | " +  convertDate();
        }
    }
}
