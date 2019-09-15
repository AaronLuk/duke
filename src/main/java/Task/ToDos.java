package Task;

/**
 * Todo class
 */
public class ToDos extends Task {
    private String todo;

    /**
     * Constructs todo task
     * @param name description of todo
     */
    public ToDos(String name){
        super(name);
        todo = "[T]";
    }

    /**
     * Details of todo
     * @return details of todo
     */
    public String toString(){
        if(done){
            return todo + "[✓] " + name;
        } else {
            return todo + "[X] " + name;
        }
    }

    /**
     * Formats todo to correct format
     * @return format to save to file
     */
    public String toFile(){
        if(done){
            return "T | 1 | " + name;
        } else {
            return "T | 0 | " + name;
        }
    }
}
