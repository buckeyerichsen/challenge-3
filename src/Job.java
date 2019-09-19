
public class Job {
    private String email;
    private String name;
    private String company;
    private String jobTitle;
    private String startDate;
    private String endDate;
    private String description;



    public Job() {
    }

    public Job(String email, String name, String company, String jobTitle, String startDate, String endDate, String description) {
        this.email = email;
        this.name = name;
        this.company = company;
        this.jobTitle = jobTitle;
        this.startDate = startDate;
        this.endDate = endDate;
        this.description = description;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public void displayText(){
        System.out.println(getName());
        System.out.println(getEmail());
        System.out.println(getCompany());
        System.out.println(getDescription());
        System.out.println(getEndDate());
        System.out.println(getJobTitle());
        System.out.println(getStartDate());
    }
}
