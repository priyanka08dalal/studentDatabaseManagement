package StudentDatabase;

public class StudentDatabase {
    public static void main(String[] args) {
        Student std1 = new Student();
        std1.enroll();
        std1.payFees(100);
        System.out.println(std1.toString())

        // Add new student
        System.out.println("Enter the number of Students:");
        Scanner in = new Scanner(System.in);
        int noOfStudents = in.nextLine();
        Student[] Student = new Student[noOfStudents - 1];

        // Create new Students

        for (int n=0; n < noOfStudents; n++) {
            Students[n] = new Student();
            std.payFees();
            System.out.println(stu.toString());
        }
    }

    