package Command;

import Duke.Storage;
import Task.TaskList;
import Task.Task;
import java.io.IOException;
import java.text.ParseException;

public class DoneCommand extends Command {
    private int index;

    public DoneCommand(int index){
        this.index = index;
    }
    @Override
    public void execute(TaskList tasks, Storage storage) throws IOException, ParseException {
        tasks.setDone(index);
        System.out.println("\t Nice! I've marked this task as done:");
        System.out.println("\t   " + tasks.getTask(index));

    }
}
