public class InputManager {

    private String task;
    private MemoList newList;

    public InputManager(){
        newList = new MemoList();
    }
    //adds task into the memo list
    public void readInput(String input){
        task = input;
        newList.add(task);
    }
    //lists all the tasks in the memo list
    public void readList(){
        System.out.println(newList.toString());
    }
    //marks task as done
    public void setDone(int taskNo){
        newList.setDone(taskNo);
    }
    //returns which task got completed
    public String getTask(int taskNo){
        return newList.getTask(taskNo);
    }
}
