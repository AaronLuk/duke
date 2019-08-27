public class InputManager {
    String task;
    MemoList newList;
    public InputManager(){
        newList = new MemoList();
    }
    public void readInput(String input){
        task = input;
        newList.add(task);
    }
    public void readList(){
        System.out.println(newList.toString());
    }
}
