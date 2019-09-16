package Command;

import Duke.Storage;
import Task.TaskList;
import Duke.UI;
/**
 * Executable to list all the tasks
 */
public class ListCommand extends Command {

    /**
     * Performs action to list all tasks
     * @param tasks list of tasks
     * @param storage loads and saves list of tasks to file
     */
    @Override
    public void execute(TaskList tasks, Storage storage, UI ui) {
        System.out.println(tasks.toString());
        taskMessage = ui.line() + "\n";
        taskMessage += tasks.toString();
        taskMessage += ui.line();
    }
}
