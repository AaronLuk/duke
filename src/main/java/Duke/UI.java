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
        line = "==================================================";
        greeting = "\t Hello I'm HackerMan\n\tWhat can I do for you?";
        logo ="\n" +
                "  _    _            _                                     \n" +
                " | |  | |          | |                                    \n" +
                " | |__| | __ _  ___| | _____ _ __   _ __ ___   __ _ _ __  \n" +
                " |  __  |/ _` |/ __| |/ / _ | '__| | '_ ` _ \\ / _` | '_ \\ \n" +
                " | |  | | (_| | (__|   |  __| |    | | | | | | (_| | | | |\n" +
                " |_|  |_|\\__,_|\\___|_|\\_\\___|_|    |_| |_| |_|\\__,_|_| |_|\n" +
                "                                                          \n" +
                "                                                          \n";
    }

    /**
     * Greets user
     * @return the Greeting
     */
    public String greet(){
        return line + "\n" + logo + greeting + "\n" + line;

    }

    /**
     * A line for dividing content
     */
    public String line(){
        return line;
    }

    /**
     * Says goodbye to user to let user know program has ended
     * @return
     */
    public String goodBye(){
        return line + "\nYour modifications have been saved. See you next time\n" + line;
    }

    /**
     * Informs user that file was not found
     */
    public void  loadError(){
        System.out.println("No data was found");
    }
}
