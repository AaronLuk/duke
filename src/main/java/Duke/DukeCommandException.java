package Duke;

public class DukeCommandException extends Exception{

    private String errorMessage;

    public DukeCommandException(String action){
        errorMessage = "OOPS!!! "+ action + " REQUIRES THE INDEX OF THE TASK\n";
        if(action.equals("delete")){
            errorMessage += "Format of delete is:\n \tdelete <index of task>";
        } else if(action.equals("done")){
            errorMessage += "Format of done is:\n \tdone <index of task>";
        } else{
            errorMessage += "Format of find is:\n \tfind <word(s) to find>";
        }
    }

    @Override
    public String getMessage() {
        return this.errorMessage;
    }
}
