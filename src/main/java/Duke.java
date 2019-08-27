import java.util.Scanner;

public class Duke {
    public static void main(String[] args) {
//        String logo = " ____        _        \n"
//                + "|  _ \\ _   _| | _____ \n"
//                + "| | | | | | | |/ / _ \\\n"
//                + "| |_| | |_| |   <  __/\n"
//                + "|____/ \\__,_|_|\\_\\___|\n";
//        System.out.println("Hello from\n" + logo);
        InputManager manager = new InputManager();
        Scanner sc = new Scanner(System.in);
        String line = "\t_____________________________________________";
        System.out.println(line);
        System.out.println("Hello I'm Duke");
        System.out.println("What can I do for you?");

        boolean exit = false;
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
            } else {
                manager.readInput(input);
                System.out.println(line);
                System.out.println("\t " + input);
                System.out.println(line);
            }
        }

    }
}