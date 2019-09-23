package Task;

import java.util.ArrayList;

/**
 * Class with list of tasks and methods to access individual tasks
 */
public class TaskList {
    private static ArrayList<Task> tasks;

    /**
     * Creates tasklist object
     * @param list of tasks
     */
    public TaskList(ArrayList<Task> list){
        tasks = list;
    }

    public TaskList() {
        tasks = new ArrayList<Task>();
    }

    /**
     * Adds task to list
     * @param t task to be added
     */
    public void add(Task t){
        tasks.add(t);
    }


    /**
     * Prints all the task in the list
     * @return full list of tasks
     */
    public String toString(){
        int counter = 1;
        String list = "";
        for(Task task : tasks){
            if(task.isDone()){
                list += counter + ". "+ task.toString() + "\n";
            } else {
                list += counter + ". "+ task.toString() + "\n";
            }
            counter++;
        }
        return list;

    }
    //sets the task inside the list to completed
    public void setDone(int no){
        tasks.get(no-1).setDone();
    }
    //returns name of the task
    public String getTask(int no){
        return tasks.get(no-1).toString();
    }
    //returns length of memo list
    public int getLength(){
        return this.tasks.size();
    }
    //returns latest added memo
    public String getLatest(){
        return tasks.get(tasks.size()-1).toString();
    }
    //deletes the task from list
    public void deleteTask(int no){
        if(tasks.size()>0) {
            tasks.remove(no - 1);
        } else {
            System.out.println("Task list is already empty");
        }
    }
    //returns entire list of tasks
    public static ArrayList<Task> getTasks(){
        return tasks;
    }

    public void setPriority(int priority){
        tasks.get(tasks.size()-1).setPriority(priority);
    }
}
