import java.util.ArrayList;

public class Person {
    private String name;
    private String email;
    private ArrayList job;

    public Person() {
    }

    public Person(String name, String email, ArrayList job) {
        this.name = name;
        this.email = email;
        this.job = job;
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

    public ArrayList getJob() {
        return job;
    }

    public void setJob(ArrayList job) {
        this.job = job;
    }

    public void displaytext1(){
        System.out.println(getName());
        System.out.println(getEmail());
        System.out.println(getJob());
    }
}

