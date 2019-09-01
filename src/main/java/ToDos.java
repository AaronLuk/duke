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

}
