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
        errorMessage = "OOPS!!! I DESCRIPTION OF A " + action + " CANNOT BE EMPTY";
    }

    /**
     * Shous error made by user
     * @return returns the error message
     */
    public String getMessage(){
        return errorMessage;
    }
}
