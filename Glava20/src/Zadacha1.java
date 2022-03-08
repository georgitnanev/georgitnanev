public class Zadacha1 {
    static abstract class Human {
        String firstName, lastName;

        public Human(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public abstract double calcHourlyWage();
    }
    static class Student extends Human implements Comparable<Student> {
        private double result;


        public Student(String firstName, String lastName, double result) {
            super(firstName, lastName);
            this.result = result;
        }

        public double getResult() {
            return result;
        }

        public void setResult(double result) {
            this.result = result;
        }


        @Override
        public double calcHourlyWage() {
            return 0;
        }

        @Override
        public int compareTo(Student otherStudent) {
            return Double.compare(this.result, otherStudent.result);
        }
    }
    static class Worker extends Human {
        protected int wage, workingHours;

        public Worker(String firstName, String lastName, int wage, int workingHours) {
            super(firstName, lastName);
            this.wage = wage;
            this.workingHours =workingHours;
        }

        public int getWage() {
            return wage;
        }

        public void setWage(int wage) {
            this.wage = wage;
        }

        public int getWorkingHours() {
            return workingHours;
        }

        public void setWorkingHours(int workingHours) {
            this.workingHours = workingHours;
        }




        @Override
        public double calcHourlyWage() {
            return this.wage / this.workingHours;


        }
        @Override
        public String toString() {
            return "Worker{" +
                    "wage=" + wage +
                    ", workingHours=" + workingHours +
                    ", hourlyWage=" + this.calcHourlyWage() +
                    '}';
        }
    }

    public static void main(String[] args) {
        Worker worker = new Worker("Iv", "Ivs",80, 8);
        System.out.println(worker);

    }


}
