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
     * Constructs event task
     * @param name description of event
     * @param time time of event
     */
    public Events(String name, String time){
        super(name);
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
            return event + "[√] " + name + " (at: " + time + ")";
        } else {
            return event + "[X] " + name + " (at: " + time + ")";
        }
    }

    public String toFile() throws ParseException {
        if(done){
            return "E | 1 | " + name + " | " +  convertDate();
        } else {
            return "E | 0 | " + name + " | " +  convertDate();
        }
    }
}
