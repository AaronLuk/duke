import java.io.FileNotFoundException;
import java.util.Scanner;

public class Duke {
    InputManager manager;
    TaskList tasks;
    Storage storage;
    boolean exit;
    Scanner sc;
    String line;


    public Duke(String FilePath) throws FileNotFoundException {
        storage = new Storage(FilePath);
        tasks = new TaskList(storage.load());
        manager = new InputManager(tasks);
        exit = false;
        sc = new Scanner(System.in);
        line = "\t_____________________________________________";
        System.out.println(line);
        System.out.println("Hello I'm Duke");
        System.out.println("What can I do for you?");


    }
    public void run(){
            System.out.println(tasks);
//        String logo = " ____        _        \n"
//                + "|  _ \\ _   _| | _____ \n"
//                + "| | | | | | | |/ / _ \\\n"
//                + "| |_| | |_| |   <  __/\n"
//                + "|____/ \\__,_|_|\\_\\___|\n";
//        System.out.println("Hello from\n" + logo);


        while(exit == false){
            String input = sc.nextLine();
            if(input.equals("bye")){
                System.out.println(line);
                System.out.println("\t Bye. Hope to see you soon!");
                System.out.println(line);
                exit = true;
            } else if(input.equals("list")){
                System.out.println(line);
                manager.readList();
                System.out.println(line);
            } else if(input.contains("done")){

                int no = Character.getNumericValue(input.charAt(5));
                manager.setDone(no);
                System.out.println(line);
                System.out.println("\t Nice! I've marked this task as done:");
                System.out.println("\t   " + manager.getTask(no));
                System.out.println(line);
            } else if(input.contains("delete")){
                int no = Character.getNumericValue(input.charAt(7));
                System.out.println(line);
                System.out.println("\t Noted, I've removed this task:");
                manager.delete(no);
                System.out.println(line);
            } else {
                System.out.println(line);
                manager.readInput(input);
                System.out.println(line);
            }
        }

    }

    public static void main(String[] args) throws FileNotFoundException {

        new Duke("duke.txt").run();
    }
}