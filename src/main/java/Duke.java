import java.util.Scanner;

public class Duke {
    public static void main(String[] args) {
//        String logo = " ____        _        \n"
//                + "|  _ \\ _   _| | _____ \n"
//                + "| | | | | | | |/ / _ \\\n"
//                + "| |_| | |_| |   <  __/\n"
//                + "|____/ \\__,_|_|\\_\\___|\n";
//        System.out.println("Hello from\n" + logo);

        Scanner sc = new Scanner(System.in);
        String line = "\t_____________________________________________";
        System.out.println(line);
        System.out.println("Hello I'm Duke");
        System.out.println("What can I do for you?");

        boolean exit = false;
        while(exit == false){
            String input = sc.nextLine();
            if(input.equals("list")){
                System.out.println(line);
                MemoList newList = new MemoList();
                System.out.println("\t "+ newList.toString());
                System.out.println(line);
            } else if(input.equals("blah")) {
                System.out.println(line);
                System.out.println("\t blah");
                System.out.println(line);
            }  else if(input.equals("bye")){
                System.out.println(line);
                System.out.println("\t Bye. Hope to see you again soon!");
                System.out.println(line);
                exit = true;
            }
        }

    }
}