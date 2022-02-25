package Student;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println("I am a student: " + student.getFullName() + ", kurs: " + student.getYearOfEducation()
        + " at " + student.getUni());

        Student student1 = new Student("Ivan Ivanov Ivanov", 2, Student.Speciality.Java, Student.Uni.TrakiaUni);
        Student student2 = new Student("Stefan Stefanov Stefanov", 3, Student.Speciality.JVM, Student.Uni.SU);
        System.out.print("student1: ");
        student1.infoStudent();
        System.out.print("student2: ");
        student2.infoStudent();
    }
}
