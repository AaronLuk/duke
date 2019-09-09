package Task;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Deadlines extends Task {

    private String deadline;
    private String time;
    private SimpleDateFormat sdf;
    private Date date;

    public Deadlines(String name, String time){
        super(name);
        deadline = "[D]";
        this.time = time;
        sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm");


    }
    public String convertDate() throws ParseException {
        date = sdf.parse(this.time);
        return sdf.format(date);
    }
    public String toString(){
        if(done){
            return deadline + "[✓] " + name + " (by: " + time + ")";
        } else {
            return deadline + "[X] " + name + " (by: " + time + ")";
        }
    }
    public String toFile() throws ParseException {
        if(done){
            return "D | 1 | " + name + " | " +  convertDate();
        } else {
            return "D | 0 | " + name + " | " +  convertDate();
        }
    }
}
