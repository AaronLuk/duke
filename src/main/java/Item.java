public abstract class Item {

    protected String name;
    protected boolean done;

    public Item(String name){
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

}
