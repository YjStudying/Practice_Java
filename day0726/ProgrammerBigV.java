package day0726;

public class ProgrammerBigV implements Programmer {
    private JavaWh JavaWh;

    public ProgrammerBigV() {
        this.JavaWh = new JavaWh();
    }

    public void upvote() {
        System.out.println("!!!");
    }

    @Override
    public void coding() {
        JavaWh.coding();
        upvote();
    }
}
