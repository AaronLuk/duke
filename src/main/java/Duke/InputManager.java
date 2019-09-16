package Duke;

import Command.*;
import Task.Deadlines;
import Task.Events;
import Task.ToDos;

/**
 * Parsers commands of user to get the action to be executed
 */
public class InputManager {

    private String input;

    public InputManager(){
    }

    /**
     * Parse command given by user
     * @param input User input
     * @return Command object
     * @throws DukeException Invalid actions/ Missing values
     */
    public static Command parse(String input) throws DukeException{
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
                    throw new DukeException(action);
                } else {
                    return new AddCommand(new ToDos(words[1].trim()));
                }
            case "event":
                if (words.length < 2) {
                    throw new DukeException(action);
                } else {
                    String[] details = words[1].split(" /at ");
                    return new AddCommand(new Events(details[0].trim(), details[1].trim()));
                }
            case "deadline":
                if (words.length < 2) {
                    throw new DukeException(action);
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
                return new ErrorCommand();
        }
    }

}
