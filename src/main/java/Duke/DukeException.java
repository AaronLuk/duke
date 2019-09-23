package Duke;

/**
 * Handles and informs missing values and invalid commands
 */
public class DukeException extends Exception {
    private String errorMessage;

    /**
     * Constructor for DukeException
     */
    public DukeException(){
        errorMessage = "OOPS!!! DONT KNOW WHAT THAT MEANS";
    }

    /**
     * Constructor to change error message
     * @param action missing information for specific task
     */
    public DukeException(String action){
        errorMessage = "OOPS!!! DESCRIPTION OF A " + action + " CANNOT BE EMPTY\n";
        if(action.equals("todo")) {
            errorMessage += "Format of todo is:\n \ttodo <description> <priority:1/2/3>";
        } else if(action.equals("deadline")) {
            errorMessage += "Format of deadline is:\n \tdeadline <description> <priority> /by <DD-MM-YYYY> <HH:MM>";
        } else {
            errorMessage += "Format of event is:\n \t event<description> <priority> /at <DD-MM-YYYY> <HH:MM>";
        }
    }

    /**
     * Shous error made by user
     * @return returns the error message
     */
    public String getMessage(){
        return errorMessage;
    }
}
