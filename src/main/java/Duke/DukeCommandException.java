package Duke;

/**
 * Handles exception for non task related commands
 * e.g. commands like delete/done/find
 */
public class DukeCommandException extends Exception{

    private String errorMessage;
    private UI ui;


    public DukeCommandException(String action){
        ui = new UI();
        errorMessage = ui.line() + "\n";
        errorMessage += "OOPS!!! "+ action + " requires the index of the task\n";
        if(action.equals("delete")){
            errorMessage += "Format of delete is:\n \tdelete <index of task>\n";
        } else if(action.equals("done")){
            errorMessage += "Format of done is:\n \tdone <index of task>\n";
        } else if(action.equals("sort")){
          errorMessage += "Format of sort is:\n \tsort <priority of task>\n";
        } else{
            errorMessage += "Format of find is:\n \tfind <word(s) to find>\n";
        }
        errorMessage += ui.line() + "\n";
    }

    @Override
    public String getMessage() {
        return this.errorMessage;
    }
}
