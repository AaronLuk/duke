package Task;

/**
 * Todo class
 */
public class ToDos extends Task {
    private String todo;


    /**
     * Constructor of todo task
     * @param name of task
     * @param priority of the task
     */
    public ToDos(String name, int priority){
        super(name, priority);
        todo = "[T]";
    }

    /**
     * Details of todo
     * @return details of todo
     */
    public String toString(){
        if(done){
            return todo + "[/][" + priority + "] " + name;
        } else {
            return todo + "[X][" + priority + "] " + name;
        }
    }

    /**
     * Formats todo to correct format
     * @return format to save to file
     */
    public String toFile(){
        if(done){
            return "T | 1 | " + priority + " | " + name;
        } else {
            return "T | 0 | " + priority + " | " + name;
        }
    }
}
