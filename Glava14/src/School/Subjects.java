package School;

public class Subjects {
    private String subjectName;
    private int lesson;
    private int exercise;

    public Subjects(String subjectName, int lesson, int exercise) {
        this.subjectName = subjectName;
        this.lesson = lesson;
        this. exercise = exercise;
    }
    public String getSubjectName() {
        return subjectName;
    }
    public int getLesson() {
        return lesson;
    }
    public int getExercise() {
        return exercise;
    }

    @Override
    public String toString() {
        return "Subjects{" +
                "subjectName='" + subjectName + '\'' +
                ", lesson=" + lesson +
                ", exercise=" + exercise +
                '}';
    }
}
