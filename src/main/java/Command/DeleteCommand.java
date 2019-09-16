package Command;

import Duke.Storage;
import Task.TaskList;
import Duke.UI;
/**
 * Executable that deletes task from the list of task
 */
public class DeleteCommand extends Command {
    private int index;

    /**
     * Constructs delete command class
     * @param index of the task to be deleted
     */
    public DeleteCommand(int index){
        this.index = index;
    }

    /**
     * Performs action to delete specified task
     * @param tasks list of tasks
     * @param storage loads and saves list of tasks to file
     */
    @Override
    public void execute(TaskList tasks, Storage storage, UI ui){
        System.out.println("\t Noted, I've removed this task:");
        System.out.println("\t   " + tasks.getTask(index));

        System.out.println("\t Now you have " + tasks.getLength() + " in the list");
        taskMessage = ui.line() + "\n";
        taskMessage +=  "Noted, I've removed this task:\n";
        taskMessage += "  " + tasks.getTask(index) + "\n";
        taskMessage += ui.line();
        tasks.deleteTask(index);

    }
}
