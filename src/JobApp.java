import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JobApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String input;
        String name;
        String email;
        String company;
        String jobTitle;
        String startDate;
        String endDate;
        String description;
        ArrayList<Job> jobs = new ArrayList<>();
        int counter = 1;



        System.out.println("please enter in the information below. victor es mi mejores amigo");



            Job job1 = new Job();
            Person person = new Person();
            System.out.println("please enter your name");
            name = sc.nextLine();
            person.setName(name);



            System.out.println("please enter your email address");
            email = sc.nextLine();
            person.setEmail(email);



            while(true){



                System.out.println("what was the name of your company? " + counter);
                company = sc.nextLine();
                job1.setCompany(company);

                System.out.println("what was your job title? " + counter);
                jobTitle = sc.nextLine();
                job1.setJobTitle(jobTitle);

                System.out.println("what was the start date of your job? " + counter);
                startDate = sc.nextLine();
                job1.setStartDate(startDate);

                System.out.println("what was the end date of your job? " + counter);
                endDate = sc.nextLine();
                job1.setEndDate(endDate);

                System.out.println("how would you describe your job?");
                description = sc.nextLine();
                job1.setDescription(description);


                jobs.add(job1);
                System.out.println("enter stop if you are ready to stop, otherwise press any key.");
                input = sc.nextLine();
                if(input.equalsIgnoreCase("stop")){
                    break;
                }
                counter = counter + 1;

        }
            person.displaytext1();
            counter =1;
            for (Job job : jobs){
                System.out.println("Job " + counter);
                job.displayText();

                counter = counter + 1;
            }
            counter = counter - 1;
        System.out.println("number of previous jobs = " + counter );
    }
}
