package task;

import Task.ToDos;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TodoTest {
    @Test
    public void file_to_list_format(){
        String expectedFormat = "[T][X][2] skateboard";
        ToDos todo = new ToDos("skateboard", 2);

        assertEquals("[T][X][2] skateboard", todo.toString());
    }
}
