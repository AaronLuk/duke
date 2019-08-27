import java.util.ArrayList;

public class MemoList {
    private ArrayList<Item> memos;

    public MemoList(){
        memos = new ArrayList<>();
    }
    public void add(String memo){
        memos.add(new Item(memo));
    }
    public String toString(){
        int counter = 1;
        String list = "";
        String Done = "[✓]";
        String notDone = "[✗]";
        for(Item task : memos){
            if(task.isDone()){
                list += "\t " +counter + "."+ Done + " " + task.toString() + "\n";
            } else {
                list += "\t " +counter + "."+ notDone + " " + task.toString() + "\n";
            }
            counter++;
        }
        return list;

    }
    //sets the task inside the list to completed
    public void setDone(int no){
        memos.get(no-1).setDone();
    }
    //returns name of the task
    public String getTask(int no){
        return memos.get(no-1).toString();
    }
}
