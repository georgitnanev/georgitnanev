package Student;

public class Student {

    private final String fullName;
    private final int yearOfEducation;

    public enum Speciality {Java, JVM, Android, IOS}
    private final Speciality speciality;
    enum Uni {Edynamix, SU, TrakiaUni}
    private final Uni uni;
    private final String email = null;
    private final String mobile = null;
    public static int numberStudent = 0;

    public Student() {
        this("Georgi Trifonov Nanev");
    }

    public Student(String name) {
        this(name, 1);
    }

    public Student(String name, int yearOfEducation) {
        this(name, yearOfEducation, Speciality.Java);
    }

    public Student(String name, int yearOfEducation, Speciality speciality) {
        this(name, yearOfEducation, speciality, Uni.Edynamix);
    }

    public String getFullName() {
        return fullName;
    }

    public int getYearOfEducation() {
        return yearOfEducation;
    }

    public Uni getUni() {
        return uni;
    }

    public Student(String name, int yearOfEducation, Speciality speciality, Uni uni) {
        this.fullName = name;
        this.yearOfEducation = yearOfEducation;
        this.speciality = speciality;
        this.uni = uni;
        numberStudent++;

    }
    public void infoStudent() {
        System.out.println(this.fullName
                + " ," + this.yearOfEducation + " kurs "
                + ", specialnost: " + this.speciality
                + ", "+ this.uni);


    }


}





