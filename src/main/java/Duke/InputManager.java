package Duke;

import Command.*;
import Task.Deadlines;
import Task.Events;
import Task.ToDos;

public class InputManager {

    private String input;

    public InputManager(){
    }

    public static Command parse(String input){
        String[] words = input.split(" ",2);
        String action = words[0];

        switch(action) {
            case "list":
                return new ListCommand();
            case "bye":
                return new ByeCommand();
            case "done":
                if (words.length < 2) {
                    System.out.println("OOPS DONE KNOW WHAT THAT MEANS");
                } else {
                    int index = Integer.parseInt(words[1].trim());
                    return new DoneCommand(index);
                }
            case "delete":
                if (words.length < 2) {
                    System.out.println("OOPS DONE KNOW WHAT THAT MEANS");
                } else {
                    int index = Integer.parseInt(words[1].trim());
                    return new DeleteCommand(index);
                }
            case "todo":
                if (words.length < 2) {
                    System.out.println("OOPS DESCRIPTION OF TODO CANT BE EMPTY");
                } else {
                    return new AddCommand(new ToDos(words[1].trim()));
                }
            case "event":
                if (words.length < 2) {
                    System.out.println("OOPS DESCRIPTION OF EVENT CANT BE EMPTY");
                } else {
                    String[] details = words[1].split(" /at ");
                    return new AddCommand(new Events(details[0].trim(), details[1].trim()));
                }
            case "deadline":
                if (words.length < 2) {
                    System.out.println("OOPS DESCRIPTION OF DEADLINE CANT BE EMPTY");
                } else {
                    String[] details = words[1].split(" /by ");
                    return new AddCommand(new Deadlines(details[0].trim(), details[1].trim()));
                }
            case "find":
                if(words.length < 2){
                    System.out.println("OOPS DESCRIPTION OF FIND CANT BE EMPTY");
                } else {
                    return new FindCommand(words[1]);
                }
            default:
                System.out.println("OOPS DONT KNOW WHAT THAT MEANS");
                return new ListCommand();
        }
    }

//    //adds task into the memo list
//    public void addInput(String type, String task, String time){
//        thisList.add(type, task, time);
//    }
//    //adds task into the memo list
//    public void addInput(String type, String task){
//        thisList.add(type,task);
//    }
//    //processes task and finds the type  and time
//    public void readInput(String input){
//
//        if(!input.contains("todo")&&!input.contains("event")&& !input.contains("deadline")){
//            System.out.println("\t OOPS DONT KNOW WHAT THAT MEANS");
//        } else {
//            if(!input.contains(" ")){
//                System.out.println("\t OOPS DESCRIPTION CANNOT BE EMPTY");
//            } else {
//                int firstSpace;
//                firstSpace = input.indexOf(' ');
//                type = input.substring(0, firstSpace);
//                if (type.equals("todo")) {
//                    task = input.substring(firstSpace + 1);
//                    addInput(type, task);
//                    acknowledge();
//
//                } else if (type.equals("deadline") || type.equals("event")) {
//                        int timeStamp = input.indexOf("/");
//                        time = input.substring(timeStamp + 4);
//                        task = input.substring(firstSpace + 1, timeStamp - 1);
//                        addInput(type, task, time);
//                        acknowledge();
//                }
//
//            }
//        }
//
//    }
//
//    //lists all the tasks in the memo list
//    public void readList(){
//        System.out.println(thisList.toString());
//    }
//    //marks task as done
//    public void setDone(int taskNo){
//        thisList.setDone(taskNo);
//    }
//    //returns which task got completed
//    public String getTask(int taskNo){
//        return thisList.getTask(taskNo);
//    }
//    //prints acknowledgement paragraph
//    public void acknowledge(){
//       System.out.println(acknowledgement);
//       System.out.println(fetch());
//       System.out.println("\t Now you have " + thisList.getLength() + " tasks in the list.");
//    }
//    //fetches task from memolist
//    public String fetch(){
//        return "\t  " + thisList.getLatest();
//    }
//    //handles case for unknown memo type
//    private void handleUnknownType(){
//        System.out.println("OOPS!!! I'm sorry, but I dont't know what that means :-(");
//    }
//    //deletes memo from list
//    public void delete(int taskNo){
//        System.out.println("\t   " + thisList.getTask(taskNo));
//        thisList.deleteMemo(taskNo);
//        System.out.println("\t Now you have " + thisList.getLength() + " in the list");
//    }
}
