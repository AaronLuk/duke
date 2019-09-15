package Command;

import Task.TaskList;
import Task.Task;
import Duke.Storage;


import java.io.IOException;
import java.text.ParseException;

public class AddCommand extends Command{

    private Task task;

    public AddCommand(Task task){
        this.task = task;
    }

    public Task getTask(){
        return task;
    }


    public void execute(TaskList tasks, Storage storage) throws IOException, ParseException {
        tasks.add(this.task);
        System.out.println("\t Got it I've added this task:");
        System.out.println("\t " + tasks.getLatest());
        System.out.println("\t Now you have " + tasks.getLength() + " in the list");
        taskMessage =  "Got it I've added this task:\n";
        taskMessage += "   " + tasks.getLatest() + "\n";
        taskMessage += "Now you have " + tasks.getLength() + " in the list";
    }

}
