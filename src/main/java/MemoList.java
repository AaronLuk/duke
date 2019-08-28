import java.util.ArrayList;

public class MemoList {
    private ArrayList<Item> memos;

    public MemoList(){
        memos = new ArrayList<>();
    }
    public void add(String type, String memo) {
        memos.add(new ToDos(memo));
    }
    public void add(String type, String memo, String time){

        if(type.equals("event")){
            memos.add(new Events(memo, time));
        } else {
            memos.add(new Deadlines(memo, time));
        }
    }
    public String toString(){
        int counter = 1;
        String list = "";
        for(Item task : memos){
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
        memos.get(no-1).setDone();
    }
    //returns name of the task
    public String getTask(int no){
        return memos.get(no-1).toString();
    }
    //returns length of memo list
    public int getLength(){
        return this.memos.size();
    }
    //returns latest added memo
    public String getLatest(){
        return memos.get(memos.size()-1).toString();
    }
    //deletes the task from list
    public void deleteMemo(int no){
        if(memos.size()>0) {
            memos.remove(no - 1);
        } else {
            System.out.println("Memo list is already empty");
        }
    }
}
