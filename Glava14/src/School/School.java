package School;

import java.util.ArrayList;

public class School {

    private String name;
    ArrayList<SchoolClass> schoolClasses = new ArrayList<SchoolClass>();
    ArrayList<Students> students = new ArrayList<Students>();

    public School(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void addClass(SchoolClass newClass) {
        schoolClasses.add(newClass);
    }
    public void addStudent(Students newStudent) {
        students.add(newStudent);
    }


    @Override
    public String toString() {
        StringBuilder allStudents = new StringBuilder();
        for ( Students student: students) {
            allStudents.append(student+ "\n");

        }
        StringBuilder allClassesStringBuilder = new StringBuilder();
        for (SchoolClass schoolClass : schoolClasses) {
            allClassesStringBuilder.append(schoolClass.toString() + "\n");
        }
        return "School:" + name + '\'' + allClassesStringBuilder + allStudents;
    }
}

