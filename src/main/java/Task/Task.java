package Task;

import java.text.ParseException;

/**
 * Base task class for different kinds of tasks
 */
public class Task {

    protected String name;
    protected boolean done;
    protected int priority;



    /**
     * Constructor of task
     * @param name of task
     * @param priority of the task
     */
    public Task(String name, int priority){
        this.name = name;
        this.priority = priority;
    }

    /**
     * prints the name of the task
     */
    public String toString(){
        return name;
    }

    /**
     * Sets the priority of the task
     * @param priority of the task
     */
    public void setPriority(int priority){
        this.priority = priority;
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

    /**
     * Returns the priority of the task
     */
    public int getPriority(){
        return this.priority;
    }

}
