package Command;

import Duke.Storage;
import Task.TaskList;
import java.io.IOException;
import java.text.ParseException;

public class DeleteCommand extends Command {
    private int index;

    public DeleteCommand(int index){
        this.index = index;
    }

    @Override
    public void execute(TaskList tasks, Storage storage) throws IOException, ParseException {
        System.out.println("\t Noted, I've removed this task:)");
        System.out.println("\t   " + tasks.getTask(index));
        tasks.deleteTask(index);
        System.out.println("\t Now you have " + tasks.getLength() + " in the list");

    }
}
