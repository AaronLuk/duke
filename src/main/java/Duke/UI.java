package Duke;

/**
 * Program instructions for the user
 */
public class UI {

    private String line;
    private String greeting;
    private String logo;

    /**
     * Constructor for the UI class
     */
    public UI(){
        line = "\t_____________________________________________";
        greeting = "\t Hello I'm Duke\n\tWhat can I do for you?";
        logo = " ____        _        \n"
                + "|  _ \\ _   _| | _____ \n"
                + "| | | | | | | |/ / _ \\\n"
                + "| |_| | |_| |   <  __/\n"
                + "|____/ \\__,_|_|\\_\\___|\n";
    }

    /**
     * Greets user
     * @return the Greeting
     */
    public String greet(){
        return line + "\n" + greeting + "\n" + line;

    }

    /**
     * A line for dividing content
     */
    public void line(){
        System.out.println(line);
    }

    /**
     * Says goodbye to user to let user know program has ended
     * @return
     */
    public String goodBye(){
        return "Your modifications have been saved. See you next time";
    }

    /**
     * Informs user that file was not found
     */
    public void  loadError(){
        System.out.println("No data was found");
    }
}
