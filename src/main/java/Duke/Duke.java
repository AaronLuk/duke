package Duke;


import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

import Command.Command;
import Task.TaskList;



public class Duke {

    InputManager manager;
    TaskList tasks;
    Storage storage;
    boolean exit;
    Scanner sc;
    String line;
    UI ui;


    public Duke(String filePath){
        startup(filePath);
    }

    public String getResponse(String input) {
        try{
            exit = false;
            Command c = InputManager.parse(input);
            c.execute(tasks, storage);
            storage.save(tasks.getTasks());
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


    public void startup(String filePath){
        storage = new Storage(filePath);
        ui = new UI();
        try{
            tasks = new TaskList(storage.load());
        } catch (IOException e){
            System.out.println(e);
        }
    }

    public UI getUI(){
        return ui;
    }

}