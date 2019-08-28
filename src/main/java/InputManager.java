public class InputManager {

    private String task;
    private MemoList newList;
    private String time;
    private String type;
    private String acknowledgement;

    public InputManager(){
        newList = new MemoList();
        acknowledgement = "\t Got it. I've added this task: ";
    }
    //adds task into the memo list
    public void addInput(String type, String task, String time){
        newList.add(type, task, time);
    }
    //adds task into the memo list
    public void addInput(String type, String task){
        newList.add(type,task);
    }
    //processes task and finds the type  and time
    public void readInput(String input){
        int firstSpace;
        try{
            firstSpace = input.indexOf(' ');
            type = input.substring(0,firstSpace);
            if(type.equals("todo")){

                task = input.substring(firstSpace+1);
                if(!task.equals("")) {
                    addInput(type, task);
                    acknowledge();
                } else {
                    System.out.println("OOPS DESCRIPTION OF TODO CANNOT BE EMPTY.");
                }

            } else  if (type.equals("deadline")||type.equals("event")) {
                int timeStamp = input.indexOf("/");
                time = input.substring(timeStamp + 1);
                task = input.substring(firstSpace + 1, timeStamp - 1);
                addInput(type, task, time);
                acknowledge();
            }
        } catch (StringIndexOutOfBoundsException e){
            System.out.println("\t OOPS DONT KNOW WHAT THAT MEANS");
        }


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
    //prints acknowledgement paragraph
    public void acknowledge(){
       System.out.println(acknowledgement);
       System.out.println(fetch());
       System.out.println("\t Now you have " + newList.getLength() + " tasks in the list.");
    }
    //fetches task from memolist
    public String fetch(){
        return "\t  " + newList.getLatest();
    }
    //handles case for unknown memo type
    private void handleUnknownType(){
        System.out.println("OOPS!!! I'm sorry, but I dont't know what that means :-(");
    }
    //deletes memo from list
    public void delete(int taskNo){
        System.out.println(newList.getTask(taskNo-1).toString());
        newList.deleteMemo(taskNo);
        System.out.println("Now you have " + newList.getLength() + " in the list");
    }
}
