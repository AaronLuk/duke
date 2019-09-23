package Duke;


/**
 * Handles and informs missing values and invalid commands
 */
public class DukeException extends Exception {
    private String errorMessage;
    private UI ui;
    /**
     * Constructor for DukeException
     */
    public DukeException(){
        errorMessage = "OOPS!!! DONT KNOW WHAT THAT MEANS";
        ui = new UI();
    }

    /**
     * Constructor to change error message
     * @param action missing information for specific task
     */
    public DukeException(String action){
        ui = new UI();
        errorMessage = ui.line() + "\n";
        errorMessage += "OOPS!!! You entered the wrong format for " + action + "\n";
        if(action.equals("todo")) {
            errorMessage += "Format of todo is:\n \ttodo <description> <priority>\n";
        } else if(action.equals("deadline")) {
            errorMessage += "Format of deadline is:\n \tdeadline <description> <priority> /by <DD-MM-YYYY> <HH:MM>\n";
        } else {
            errorMessage += "Format of event is:\n \t event<description> <priority> /at <DD-MM-YYYY> <HH:MM>\n";
        }
        errorMessage += ui.line();
    }

    /**
     * Shous error made by user
     * @return returns the error message
     */
    public String getMessage(){
        return errorMessage;
    }
}
