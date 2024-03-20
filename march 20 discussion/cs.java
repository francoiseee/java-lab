public class cs extends student{
    private String course;

    public void setC(String x){
        course =x;
    }

    public void display(){
        super.display();
        System.out.println("Student course: " + course);
    }
}
