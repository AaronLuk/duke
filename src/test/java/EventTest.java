import Task.Events;
import jdk.jfr.Event;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EventTest {


    @Test
    public void dateFormat() throws ParseException {
        Date date = new SimpleDateFormat("dd/MM/yyyy HH:mm").parse("11/12/2222 18:00");
        Events event = new Events("meeting", "11-12-2222 18:00", 2);


        assertEquals("11-12-2222 18:00", Events.convertDate());
    }

    
    

}
