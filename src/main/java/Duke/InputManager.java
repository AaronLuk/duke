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
                    int lastSpace = words[1].lastIndexOf(" ");
                    if(lastSpace == -1){
                        throw new DukeException(action);
                    }
                    String description = words[1].substring(0,lastSpace);
                    String p = words[1].substring(lastSpace).trim();
                    if(description.isEmpty()|| p.isEmpty()){
                        throw new DukeException(action);
                    }
                    int priority = Integer.parseInt(p);
                    return new AddCommand(new ToDos(description,priority));
                }
            case "event":
                if (words.length < 2) {
                    throw new DukeException(action);
                } else {
                    assert(words[1].contains("/at")): "Missing input for event";
                    String[] details = words[1].split(" /at ");
                    int lastSpace = details[0].lastIndexOf(" ");
                    if(lastSpace == -1){
                        throw new DukeException(action);
                    }
                    String description = details[0].substring(0, lastSpace);
                    String p = details[0].substring(lastSpace).trim();
                    String date = details[1];
                    if(description.isEmpty()|| p.isEmpty()){
                        throw new DukeException(action);
                    }
                    int priority = Integer.parseInt(p);
                    return new AddCommand(new Events(description, date, priority));
                }
            case "deadline":
                if (words.length < 2) {
                    throw new DukeException(action);
                } else {
                    assert(words[1].contains("/by")): "Missing input for deadline";
                    String[] details = words[1].split(" /by ");
                    int lastSpace = details[0].lastIndexOf(" ");
                    if(lastSpace == -1){
                        throw new DukeException(action);
                    }
                    String description = details[0].substring(0, lastSpace);
                    String p = details[0].substring(lastSpace).trim();
                    String date = details[1];
                    if(description.isEmpty()|| p.isEmpty()){
                        throw new DukeException(action);
                    }
                    int priority = Integer.parseInt(p);
                    return new AddCommand(new Deadlines(description, date, priority));
                }
            case "find":
                if(words.length < 2){
                    throw new DukeCommandException(action);
                } else {
                    return new FindCommand(words[1]);
                }
            case "sort":
                if(words.length < 2) {
                    throw new DukeCommandException(action);
                } else {
                    int priority = Integer.parseInt(words[1].trim());
                    return new SortCommand(priority);
                }
            case "help":
                return new HelpCommand();
            default:
                return new ErrorCommand();
        }
    }

}
