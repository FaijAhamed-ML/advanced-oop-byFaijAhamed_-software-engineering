package lab09.q6;

public class Instructor implements Enrollable,Teachable {
    private String instructorName;

    public Instructor(String instructorName) {
        this.instructorName = instructorName;
    }

    @Override
    public void assignCourse(String courseName) {
        System.out.println("Instructor " + instructorName + " is enrolled in a professional development course: " + courseName);
    }
    @Override
    public void enrollCourse(String courseName) {
        System.out.println("Instructor " + instructorName + " has been assigned to teach: " + courseName);
    }
}
