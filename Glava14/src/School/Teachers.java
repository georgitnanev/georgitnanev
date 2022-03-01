package School;

import java.util.ArrayList;

public class Teachers {
    private final String name;
    ArrayList<Subjects> subjects = new ArrayList<Subjects>();

    public Teachers(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Subjects> getSubjects() {
        return subjects;
    }
    public void addSubject(Subjects newSubject) {
        subjects.add(newSubject);
    }

    @Override
    public String toString() {
        return "Teachers{" +
                "name='" + name + '\'' +
                '}';
    }
}

