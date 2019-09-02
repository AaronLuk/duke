import java.text.ParseException;

public class Task {

    protected String name;
    protected boolean done;

    public Task(String name){
        this.name = name;
        done = false;
    }
    //prints the name of the task
    public String toString(){
        return name;
    }
    //sets the task to completed
    public void setDone(){
        done = true;
    }
    //returns state of task i.e completed or not
    public boolean isDone(){
        return done;
    }
    public String toFile() throws ParseException {
        return "";
    }

}
