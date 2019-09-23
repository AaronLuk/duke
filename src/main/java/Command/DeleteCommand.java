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
        taskMessage = ui.line() + "\n";
        if(tasks.getLength()< index){

            taskMessage +=  "No such task to remove\n";
            taskMessage += ui.line();
        } else {

            taskMessage +=  "Noted, I've removed this task:\n";
            taskMessage += "  " + tasks.getTask(index) + "\n";

            tasks.deleteTask(index);
        }
        taskMessage += ui.line();

    }
}
