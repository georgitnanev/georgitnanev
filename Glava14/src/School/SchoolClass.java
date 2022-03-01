package School;

import java.util.ArrayList;

public class SchoolClass {
    private String textID;
    ArrayList<Teachers> teachers = new ArrayList<Teachers>();

    public SchoolClass(String textID) {
        this.textID = textID;
    }

    public String getTextID() {
        return textID;
    }

    public void addTeacher(Teachers newTeacher) {
        teachers.add(newTeacher);
    }

    @Override
    public String toString() {
        return "SchoolClass{" +
                "textID='" + textID + '\'' +
                '}';
    }
}

