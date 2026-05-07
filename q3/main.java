package lab09.q3;

public class main {
    public static void main(String[] args) {
        Student.universityName="SlIIT";
        Student S1= new Student("It25101505","Ahamed.MLF");
        Student S2= new Student("It25101570","Hasmi.BM");
        Student S3= new Student("It25101867","Ihjas.M");

        S1.displayStudentInfo();
        S2.displayStudentInfo();
        S3.displayStudentInfo();


        Student.universityName="Srilanka institute of Informaation Technowlege";

        S1.displayStudentInfo();
        S2.displayStudentInfo();
        S3.displayStudentInfo();

    }
}
