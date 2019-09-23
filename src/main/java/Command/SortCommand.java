package Command;

import Duke.Storage;
import Duke.UI;
import Task.TaskList;
import Task.Task;

import java.util.ArrayList;

/**
 * Executable to print oll tasks of specified priority
 */
public class SortCommand extends Command{

    int priority;
    UI ui;

    /**
     * Constructor of sort command class
     * @param priority of the task
     */
    public SortCommand(int priority){
        this.priority = priority;
        ui = new UI();
    }
    @Override
    public void execute(TaskList tasks, Storage storage, UI ui) {
        taskMessage = ui.line() + "\n";
        ArrayList<Task> sortedTasks = new ArrayList<Task>();
        for(Task task : tasks.getTasks()){
            if(task.getPriority() == priority){
                sortedTasks.add(task);
            }
        }
        if(sortedTasks.isEmpty()){
            taskMessage += "\t Sorry no tasks with priority of " + priority + "\n";
        } else {
            int counter = 1;
            for(Task task : sortedTasks){
                taskMessage +=  counter + ". " + task.toString() + "\n";
                counter++;
            }

        }
        taskMessage += ui.line();
    }
}
