package duke;


import Duke.DukeCommandException;
import Duke.DukeException;
import Duke.InputManager;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class InputManagerTest {
    @Test
    public void invalid_argument_test(){
        try{
            InputManager.parse("todo sleep");

        } catch (DukeException | DukeCommandException e){
            assertEquals("OOPS!!! DESCRIPTION OF A todo CANNOT BE EMPTY\nFormat of todo is:\n \ttodo <description> <priority:1/2/3>"
                    , e.getMessage());
        }
    }
}
