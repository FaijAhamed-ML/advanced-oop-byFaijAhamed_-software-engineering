package lab09.q3;

public class Student {
    private String studentId;
    private String studentName;

    static String universityName;

    public Student(String studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }
    public void displayStudentInfo(){
        System.out.println("Details:");
        System.out.println(" The Student Id : "+studentId);
        System.out.println(" The Stident Name : "+studentName);
        System.out.println(" The University name : "+universityName);
    }

}
