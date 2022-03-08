import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Zadacha2 {
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
    static class Student extends Zadacha1.Human {
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
        static class ResultComparator implements Comparator {
            public int compare(Object o1,Object o2){ Student s1=(Student)o1;
                Student s2=(Student)o2;
                if(s1.result==s2.result)
                    return 0;
                else if(s1.result>s2.result)
                    return 1;
                else return -1;
            }
        }


        @Override
        public double calcHourlyWage() {
            return 0;
        }



    }
    static class Worker extends Zadacha1.Human {
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
        ArrayList myList = new ArrayList();
        myList.add(new Student("Anio", "Anev",5.20));
        myList.add(new Student("Bencho", "Benchev",3.00));
        myList.add(new Student("Ceco", "Cvetanov",4.00));
        myList.add(new Student("Dinko", "Dinev",3.50));
        myList.add(new Student("Enio", "Enev",5.00));
        myList.add(new Student("Fanka", "Fankova",5.60));
        myList.add(new Student("Georgi", "Nanev",5.90));
        myList.add(new Student("Hristo", "Hristov",5.40));
        myList.add(new Student("Ina", "Inkova",5.10));
        myList.add(new Student("Zlatina", "Nonova",6.00));


        Collections.sort(myList, new Student.ResultComparator());
        System.out.println("Sorted Student objects by result are as follows: ");
        Iterator iter= myList.iterator();
        while(iter.hasNext()) {
            Student st = (Student) iter.next();
            System.out.println(st.firstName + ' ' + st.lastName + ' ' + st.result);
        }



    }
}
