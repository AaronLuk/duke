package Task;

import java.text.ParseException;

/**
 * Base task class for different kinds of tasks
 */
public class Task {

    protected String name;
    protected boolean done;

    /**
     * Constructs the task
     * @param name details of the task
     */
    public Task(String name){
        this.name = name;
        done = false;
    }

    /**
     * prints the name of the task
     */
    public String toString(){
        return name;
    }

    /**
     * sets the task to completed
     */
    public void setDone(){
        done = true;
    }

    /**
     * Check if task is done
     * @return state of task i.e completed or not
     */
    public boolean isDone(){
        return done;
    }

    /**
     * Formats task into file format
     * @return String with correct format
     * @throws ParseException
     */
    public String toFile() throws ParseException {
        return "";
    }

}
