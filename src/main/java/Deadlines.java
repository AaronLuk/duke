public class Deadlines extends Item{

    private String deadline;
    private String time;

    public Deadlines(String name, String time){
        super(name);
        deadline = "[D]";
        this.time = time;
    }
    public String toString(){
        if(done){
            return deadline + "[✓] " + name + " (by: " + time.substring(3) + ")";
        } else {
            return deadline + "[X] " + name + " (by: " + time.substring(3) + ")";
        }
    }
}
