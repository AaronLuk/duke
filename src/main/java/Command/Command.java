package Command;

import Duke.Storage;
import Task.TaskList;

import java.io.IOException;
import java.text.ParseException;

public abstract class Command {
    protected String taskMessage;
    protected boolean isExit = false;

    public abstract void execute(TaskList tasks, Storage storage) throws IOException, ParseException;

    public String toString(){
        return taskMessage;
    }

    public boolean isExit(){
        return isExit;
    }
}
