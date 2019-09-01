import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class Storage{
    private String filePath;

    public Storage(String filePath){
        this.filePath = filePath;
    }

    public ArrayList<Task> load() throws  FileNotFoundException {
        File file = new File(filePath);
        Scanner sc = new Scanner(file);
        SimpleDateFormat timeFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");

        ArrayList<Task> tasks = new ArrayList<>();

        while(sc.hasNextLine()){
            String[] text = sc.nextLine().split(" \\| ");
            Task t;
            switch (text[0]){
                case "T":
                    t = new ToDos(text[2]);
                    System.out.println("todo");
                    break;
                case "D":
                    t = new Deadlines(text[2], text[3]);
                    break;
                case "E":
                    t = new Events(text[2], text[3]);
                    break;
                default:
                    t = new Task("");
                    break;
            }
            if (text[1].equals("1")) {
                t.setDone();
            } else {}
            tasks.add(t);
        }
        return tasks;
    }







}
