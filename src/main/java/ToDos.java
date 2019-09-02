public class ToDos extends Task {
    private String todo;

    public ToDos(String name){
        super(name);
        todo = "[T]";
    }

    public String toString(){
        if(done){
            return todo + "[✓] " + name;
        } else {
            return todo + "[X] " + name;
        }
    }

    public String toFile(){
        if(done){
            return "T | 1 | " + name;
        } else {
            return "T | 0 | " + name;
        }
    }
}
