package Command;

import Task.TaskList;
import Task.Task;
import Duke.Storage;
import Duke.UI;


/**
 * Executable that add tasks to the task list
 */
public class AddCommand extends Command{

    private Task task;

    /**
     * Constructs Add command object
     * @param task task to be added
     */
    public AddCommand(Task task){
        this.task = task;
    }

    /**
     * Gets the information of task just added to the list
     * @return The information of latest added task
     */
    public Task getTask(){
        return task;
    }

    /**
     * Performs action to add task to list
     * @param tasks list of tasks
     * @param storage loads and saves the list of tasks
     */
    public void execute(TaskList tasks, Storage storage, UI ui)  {
        tasks.add(this.task);

        taskMessage = ui.line() + "\n";
        taskMessage +=  "Got it I've added this task:\n";
        taskMessage += "   " + tasks.getLatest() + "\n";
        taskMessage += "Now you have " + tasks.getLength() + " in the list\n";
        taskMessage += ui.line();
    }

}
