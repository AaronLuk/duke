public class InputManager {

    private String task;
    private TaskList thisList;
    private String time;
    private String type;
    private String acknowledgement;

    public InputManager(TaskList tl){
        thisList = tl;
        acknowledgement = "\t Got it. I've added this task: ";
    }
    //adds task into the memo list
    public void addInput(String type, String task, String time){
        thisList.add(type, task, time);
    }
    //adds task into the memo list
    public void addInput(String type, String task){
        thisList.add(type,task);
    }
    //processes task and finds the type  and time
    public void readInput(String input){

        if(!input.contains("todo")&&!input.contains("event")&& !input.contains("deadline")){
            System.out.println("\t OOPS DONT KNOW WHAT THAT MEANS");
        } else {
            if(!input.contains(" ")){
                System.out.println("\t OOPS DESCRIPTION CANNOT BE EMPTY");
            } else {
                int firstSpace;
                firstSpace = input.indexOf(' ');
                type = input.substring(0, firstSpace);
                if (type.equals("todo")) {
                    task = input.substring(firstSpace + 1);
                    addInput(type, task);
                    acknowledge();

                } else if (type.equals("deadline") || type.equals("event")) {
                        int timeStamp = input.indexOf("/");
                        time = input.substring(timeStamp + 4);
                        task = input.substring(firstSpace + 1, timeStamp - 1);
                        addInput(type, task, time);
                        acknowledge();
                }

            }
        }

    }

    //lists all the tasks in the memo list
    public void readList(){
        System.out.println(thisList.toString());
    }
    //marks task as done
    public void setDone(int taskNo){
        thisList.setDone(taskNo);
    }
    //returns which task got completed
    public String getTask(int taskNo){
        return thisList.getTask(taskNo);
    }
    //prints acknowledgement paragraph
    public void acknowledge(){
       System.out.println(acknowledgement);
       System.out.println(fetch());
       System.out.println("\t Now you have " + thisList.getLength() + " tasks in the list.");
    }
    //fetches task from memolist
    public String fetch(){
        return "\t  " + thisList.getLatest();
    }
    //handles case for unknown memo type
    private void handleUnknownType(){
        System.out.println("OOPS!!! I'm sorry, but I dont't know what that means :-(");
    }
    //deletes memo from list
    public void delete(int taskNo){
        System.out.println("\t   " + thisList.getTask(taskNo));
        thisList.deleteMemo(taskNo);
        System.out.println("\t Now you have " + thisList.getLength() + " in the list");
    }
}
