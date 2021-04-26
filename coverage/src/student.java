import java.util.Scanner;

public class studentApp {

    private String firstName;
    private String lastName;
    private String classOfYear;
    private String studentID;
    private String courses;
    private Integer oneCourseFees = 600;
    private Integer payFees;
    private Integer courseBalance;
    private Integer payment;
    private Integer static id = 1;

    // constructor: Prompt user to enter student name and Class year
    public StudentApp() {
        Scanner in = new Scanner(System.in); 

        System.out.println("Enter your First Name:");
        this.firstName = in.nextLine();

        System.out.println("Enter your Last Name:");
        this.lastName = in.nextLine();

        System.out.println("Enter your Class of Year:");
        this.classOfYear = in.nextLine();

        System.out.println("Enter your Courses:");
        this.courses = in.nextLine();

        System.out.println(firstName + "" + lastName + "" + classOfYear);

        setStudentID();

    }

    // Genrate an ID
    private String setStudentID() {
        id++;
        return classOfYear + "" + id
    }

    // Enroll in courses
    public void enroll(){
        System.out.println("Enter a course to Enroll:");
        Scanner in = new Scanner(System.in);
        String courses = in.nextLine();
         Integer courseBalance = courseBalance + oneCourseFees;
        System.out.println("Enrolled Courses:" + courses);
        System.out.println("Pay Fees:" + courseBalance); 

    // View balance
    public void viewBalance(){
        System.out.println("Your balance is $" + payFees);
    }
     
    // Show status
    public String toString(){
        return "Name: " + firstName + lastName + "\n Courses Entroll:" + Courses + "\n Balance:" + viewBalance;
    }
}