public class student {
    public int sNo;
    private String sname;
    public String add;
    private int yearLevel;
    final int present_year = 2024;
    private int birthYEAR;

    public void setBY(int meow){
        birthYEAR = meow;
    }

    public int compute(){
        return (present_year-birthYEAR);
    }

    //methods
    //setter or mutator
    public void setSNO(int meow){
        sNo = meow; 
    }

    //getter
    public int getSNO(){
        return sNo;
    }

    //methods
    //setter or mutator
    public void setSNAME(String meow){
        sname = meow;
    }

    //getter
    public String getSNAME(){
        return sname;
    }

    //methods
    //setter or mutator
    public void setADD(String meow){
        add = meow;
    }
    
    //getter
    public String getADD(){
        return add;
    }
    //methods
    //setter or mutator
    public void setYL(int meow){
        yearLevel = meow;
    }
    
    //getter
    public int getYL(){
        return yearLevel;
    }

    public void display (){
        System.out.println("Student NO: "+sNo);
        System.out.println("Student Name: "+getSNAME());
        System.out.println("Student Address: "+getADD());
        System.out.println("Student Year Level: "+getYL());
        System.out.println("Student age: "+ compute());
    }

}
