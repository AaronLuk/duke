import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Events extends Task {

    private String time;
    private String event;
    private SimpleDateFormat sdf;
    private Date date;

    public Events(String name, String time){
        super(name);
        this.time = time.trim();
        event = "[E]";
        sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm");
    }

    public String convertDate() throws ParseException {
        date = sdf.parse(this.time);
        return sdf.format(date);
    }

    public String toString(){
        if(done){
            return event + "[✓] " + name + " (at: " + time + ")";
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
