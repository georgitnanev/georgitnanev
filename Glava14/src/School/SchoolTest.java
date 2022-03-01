package School;

public class SchoolTest {
    public static void main(String[] args) {
        School IvanVazov = new School("IvanVazov-STZ");
        IvanVazov.addClass(new SchoolClass("A"));
        IvanVazov.addClass(new SchoolClass("B"));
        IvanVazov.addStudent(new Students("Belcho Belchev"));
        IvanVazov.addStudent(new Students("Stoiko Stoikov"));
        System.out.println(IvanVazov);

        Teachers TinkaArgirova = new Teachers("Tinka Argirova");
        TinkaArgirova.addSubject(new Subjects("Chemistry", 10, 1));
        System.out.println(TinkaArgirova);
    }
}
