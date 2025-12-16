package oops;




class Learner{
    private int id;
    private String name;
    void setId(int id) {
        this.id=id;
    }
    void setName(String name) {
        this.name=name;
    }
    int getId() {
        return id;
    }
    String getName() {
        return name;
    }

}
public class launch {

    public static void main(String[] args) {
        Learner learner=new Learner();
        learner.setId(1);
        learner.setName("telusko");
        System.out.println(learner.getId());
        System.out.println(learner.getName());

    }

}
