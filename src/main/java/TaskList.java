import java.util.ArrayList;

public class TaskList {
    private ArrayList<Task> tasks;

    public TaskList(ArrayList<Task> list){
        tasks = list;
    }
    public void add(String type, String memo) {
        tasks.add(new ToDos(memo));
    }
    public void add(String type, String memo, String time){

        if(type.equals("event")){
            tasks.add(new Events(memo, time));
        } else {
            tasks.add(new Deadlines(memo, time));
        }
    }
    public String toString(){
        int counter = 1;
        String list = "";
        for(Task task : tasks){
            if(task.isDone()){
                list += "\t " +counter + "."+ task.toString() + "\n";
            } else {
                list += "\t " +counter + "."+ task.toString() + "\n";
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
    public void deleteMemo(int no){
        if(tasks.size()>0) {
            tasks.remove(no - 1);
        } else {
            System.out.println("Memo list is already empty");
        }
    }
}
