package lab09.q6;

public class main {
    public static void main(String[] args) {
        System.out.println("--- E-Learning Platform System ---");

        // (d) Create a student and demonstrate enrolling
        Student myStudent = new Student("Alex");
        myStudent.enrollCourse("Java Programming 101");

        System.out.println(); // Blank line for readability

        // (d) Create an instructor and demonstrate both enrolling and assigning
        Instructor myInstructor = new Instructor("Dr. Roberts");

        // Instructor teaching a course
        myInstructor.assignCourse("Advanced Software Architecture");

        // Instructor learning a new course
        myInstructor.enrollCourse("Introduction to Cloud Computing");
    }
}
