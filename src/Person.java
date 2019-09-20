import java.util.ArrayList;

public class Person {
    private String name;
    private String email;
    private ArrayList jobarray;

    public Person() {
    }

    public Person(String name, String email, ArrayList jobarray) {
        this.name = name;
        this.email = email;
        this.jobarray = jobarray;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList getJobarray() {
        return jobarray;
    }

    public void setJobarray(ArrayList jobarray) {
        this.jobarray = jobarray;
    }

    public void displaytext1(){
        System.out.println(getName());
        System.out.println(getEmail());
//        System.out.println(getJobarray());
    }
}

