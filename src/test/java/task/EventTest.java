import Task.Events;

import org.junit.jupiter.api.Test;

import java.text.ParseException;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class EventTest {


    @Test
    public void toFileFormat() throws ParseException {
        String correctFormatToFile = "E | 0 | 2 | workshop | 12-12-2020 15:00";
        Events event = new Events("workshop", "12-12-2020 15:00", 2);


        assertEquals(correctFormatToFile, event.toFile());
    }

    
    

}
