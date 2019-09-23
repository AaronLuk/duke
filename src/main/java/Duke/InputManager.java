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
    public static Command parse(String input) throws DukeException, DukeCommandException{
        String[] words = input.split(" ",2);
        String action = words[0];

        switch(action) {
            case "list":
                return new ListCommand();
            case "bye":
                return new ByeCommand();
            case "done":
                if (words.length < 2) {
                   throw new DukeCommandException(action);
                } else {
                    int index = Integer.parseInt(words[1].trim());
                    return new DoneCommand(index);
                }
            case "delete":
                if (words.length < 2) {
                   throw new DukeCommandException(action);
                } else {
                    int index = Integer.parseInt(words[1].trim());
                    return new DeleteCommand(index);
                }
            case "todo":
                if (words.length < 2) {
                    throw new DukeException(action);
                } else {
                    String[] details = words[1].split(" ");
                    if(details.length < 2){
                        throw new DukeException(action);
                    }
                    int priority = Integer.parseInt(details[1]);
                    return new AddCommand(new ToDos(details[0].trim(),priority));
                }
            case "event":
                if (words.length < 2) {
                    throw new DukeException(action);
                } else {
                    String[] details = words[1].split(" /at ");
                    if(details.length < 2){
                        throw new DukeException(action);
                    }
                    String date = details[1];
                    String[] description = details[0].split(" ");
                    if(description.length < 2){
                        throw new DukeException(action);
                    }
                    String task = description[0].trim();
                    int priority = Integer.parseInt(description[1]);
                    return new AddCommand(new Events(task, date, priority));
                }
            case "deadline":
                if (words.length < 2) {
                    throw new DukeException(action);
                } else {
                    String[] details = words[1].split(" /by ");
                    if(details.length < 2){
                        throw new DukeException(action);
                    }
                    String date = details[1];
                    String[] description = details[0].split(" ");
                    if(description.length < 2){
                        throw new DukeException(action);
                    }
                    String task = description[0].trim();
                    int priority = Integer.parseInt(description[1]);
                    return new AddCommand(new Deadlines(task, date, priority));
                }
            case "find":
                if(words.length < 2){
                    throw new DukeCommandException(action);
                } else {
                    return new FindCommand(words[1]);
                }
            default:
                return new ErrorCommand();
        }
    }

}
