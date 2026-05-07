package lab09.q6;

public class Student implements Enrollable {
    private String studentName;

    public Student(String studentName) {
        this.studentName = studentName;
    }

    @Override
    public void enrollCourse(String courseName) {
        System.out.println("Sudent"+studentName+" has successfully entrolled in: "+courseName);
    }
}
