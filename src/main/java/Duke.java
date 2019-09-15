import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;
import Duke.Storage;
import Duke.InputManager;

import Command.Command;
import Task.TaskList;

import javafx.scene.control.Label;


public class Duke {

    InputManager manager;
    TaskList tasks;
    Storage storage;
    boolean exit;
    Scanner sc;
    String line;


    public Duke(String filePath){
        startup(filePath);
    }

    public String getResponse(String input) {
        try{
            exit = false;
            Command c = InputManager.parse(input);
            c.execute(tasks, storage);
            exit = c.isExit();
            if(exit){

            } else {
                return c.toString();
            }
        } catch (IOException | ParseException e){
            return e.getMessage();
        }




        return "";
    }

//
//    public Duke(String FilePath)  {
//
//        storage = new Storage(FilePath);
//
//        manager = new InputManager();
//        try{
//            tasks = new TaskList(storage.load());
//        } catch(IOException e) {
//            System.out.println(e.getMessage());
//        }
//        exit = false;
//        sc = new Scanner(System.in);
//        line = "\t_____________________________________________";
//        System.out.println(line);
//        System.out.println("Hello I'm Duke");
//        System.out.println("What can I do for you?");
//
//
//}

//    public void run() throws IOException, ParseException {
////        String logo = " ____        _        \n"
////                + "|  _ \\ _   _| | _____ \n"
////                + "| | | | | | | |/ / _ \\\n"
////                + "| |_| | |_| |   <  __/\n"
////                + "|____/ \\__,_|_|\\_\\___|\n";
////        System.out.println("Hello from\n" + logo);
//        while(exit == false){
//            String command = sc.nextLine();
//            Command c = InputManager.parse(command);
//            c.execute(tasks, storage);
//            exit = c.isExit();
//        }
//
//    }
    public void startup(String filePath){
        storage = new Storage(filePath);
        try{
            tasks = new TaskList(storage.load());
        } catch (IOException e){
            System.out.println(e);
        }
    }

}