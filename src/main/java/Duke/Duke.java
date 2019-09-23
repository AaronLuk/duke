package Duke;


import java.io.IOException;
import java.text.ParseException;


import Command.Command;
import Command.AddCommand;
import Task.TaskList;


/**
 * Main program skeleton
 */
public class Duke {


    TaskList tasks;
    Storage storage;
    boolean exit;
    UI ui;

    /**
     * Starts duke class from the UI class
     *
     */
    public Duke(){
        startup();
    }

    /**
     * Gets input from user and handles the action
     * @param input User input
     * @return  Tells user actions performed
     */
    public String getResponse(String input) {
        try{
            exit = false;
            Command c = InputManager.parse(input);

            c.execute(tasks, storage, ui);
            storage.save(tasks.getTasks());
            exit = c.isExit();

            if(exit){
                return ui.goodBye();
            } else {
                return c.toString();
            }
        } catch (IOException | ParseException | DukeException | DukeCommandException e){
            return e.getMessage();
        }

    }

    /**
     * Initialises the duke class and loads tasks from file
     * @param filePath directory of the file
     */
    public void startup(){
        storage = new Storage();
        ui = new UI();
        try{
            tasks = new TaskList(storage.load());
        } catch (IOException e){
            tasks = new TaskList();
        }
    }

    /**
     * Gets UI text for the app
     * @return UI messages for users
     */
    public UI getUI(){
        return ui;
    }

}