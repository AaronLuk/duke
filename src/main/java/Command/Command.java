package Command;

import Duke.Storage;
import Task.TaskList;
import Duke.UI;

/**
 * Abstract command class for all kinds of commands
 */
public abstract class Command {
    protected String taskMessage;
    protected boolean isExit = false;

    /**
     * Constructor for command class
     * @param tasks list of tasks
     * @param storage loads and saves list of tasks to file
     */
    public abstract void execute(TaskList tasks, Storage storage, UI ui) ;

    /**
     * Message of what action was executed
     * @return Message of action performed
     */
    public String toString(){
        return taskMessage;
    }

    /**
     * Switch to end the session
     * @return boolean to end the session
     */
    public boolean isExit(){
        return isExit;
    }
}
