package Command;

import Duke.Storage;
import Task.TaskList;
import Duke.UI;
/**
 * Executable to mark a task as done
 */
public class DoneCommand extends Command {
    private int index;

    /**
     * Constructs done command class
     * @param index of task to be marked done
     */
    public DoneCommand(int index){
        this.index = index;
    }

    /**
     * Performs action to mark specified task as done
     * @param tasks list of tasks
     * @param storage loads and saves list of tasks to file
     */
    @Override
    public void execute(TaskList tasks, Storage storage, UI ui) {
        tasks.setDone(index);
        System.out.println("\t Nice! I've marked this task as done:");
        System.out.println("\t   " + tasks.getTask(index));
        taskMessage = ui.line() + "\n";
        taskMessage +=  "Nice! I've marked this task as done:\n";
        taskMessage += "   " + tasks.getTask(index)+"\n";
        taskMessage += ui.line();
    }
}
