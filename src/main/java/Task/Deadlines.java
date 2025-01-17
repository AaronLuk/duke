package Task;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Deadline class
 */
public class Deadlines extends Task {

    private String deadline;
    private String time;
    private SimpleDateFormat sdf;
    private Date date;



    /**
     * Constructor of deadline task
     * @param name of task
     * @param priority of the task
     */
    public Deadlines(String name, String time, int priority){
        super(name, priority);
        deadline = "[D]";
        this.time = time;
        sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm");
    }

    /**
     * Converts the date input by user to date time format
     * @return date and time
     * @throws ParseException
     */
    public String convertDate() throws ParseException {
        date = sdf.parse(this.time);
        return sdf.format(date);
    }

    /**
     * Prints details of deadline
     * @return detail of deadline
     */
    public String toString(){
        if(done){
            return deadline + "[/][" + priority + "] " + name + " (by: " + time + ")";
        } else {
            return deadline + "[X][" + priority + "] " + name + " (by: " + time + ")";
        }
    }

    /**
     * Formats deadline to be saved to file
     * @return The correct format to be saved to file
     * @throws ParseException
     */
    public String toFile() throws ParseException {
        if(done){
            return "D | 1 | " + priority + " | " + name + " | " +  convertDate();
        } else {
            return "D | 0 | " + priority + " | " + name + " | " +  convertDate();
        }
    }
}
