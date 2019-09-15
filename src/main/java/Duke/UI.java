package Duke;

public class UI {

    private String line;
    private String greeting;
    private String logo;

    public UI(){
        line = "\t_____________________________________________";
        greeting = "\t Hello I'm Duke\n\tWhat can I do for you?";
        logo = " ____        _        \n"
                + "|  _ \\ _   _| | _____ \n"
                + "| | | | | | | |/ / _ \\\n"
                + "| |_| | |_| |   <  __/\n"
                + "|____/ \\__,_|_|\\_\\___|\n";
    }

    public String greet(){
        return line + "\n" + greeting + "\n" + line;

    }

    public void line(){
        System.out.println(line);
    }

    public String goodBye(){
        return "Bye see you next time";
    }

    public void  loadError(){
        System.out.println("No data was found");
    }
}
