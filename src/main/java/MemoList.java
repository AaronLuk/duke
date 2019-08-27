import java.util.ArrayList;

public class MemoList {
    ArrayList<String> memos;

    public MemoList(){
        memos = new ArrayList<>();
    }
    public void add(String memo){
        memos.add(memo);
    }
    public String toString(){
        int counter = 1;
        String list = "";
        for(String task : memos){
            list += "\t " +counter + ". " + task + "\n";
            counter++;
        }
        return list;

    }
}
