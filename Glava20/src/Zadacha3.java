import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Zadacha3 {
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
        static class WageComparator implements Comparator {
            public int compare(Object o1,Object o2){ Zadacha3.Worker s1=(Zadacha3.Worker)o1;
                Zadacha3.Worker s2=(Zadacha3.Worker)o2;
                if(s1.calcHourlyWage()==s2.calcHourlyWage())
                    return 0;
                else if(s1.calcHourlyWage()<s2.calcHourlyWage())
                    return 1;
                else return -1;
            }
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
        myList.add(new Worker("Ali","Alev",80,8));
        myList.add(new Worker("Balio","Balev",90,8));
        myList.add(new Worker("Caicho","Calev",70,8));
        myList.add(new Worker("Dan","Delev",60,8));
        myList.add(new Worker("Emo","Enchev",40,8));
        myList.add(new Worker("Falcho","Falev",100,8));
        myList.add(new Worker("Gandi","Genev",20,8));
        myList.add(new Worker("Halil","Halev",10,8));
        myList.add(new Worker("Ian","Indjov",50,8));
        myList.add(new Worker("Jelio","Jechev",48,8));



        Collections.sort(myList, new Worker.WageComparator());
        System.out.println("Sorted Student objects by result are as follows: ");
        Iterator iter= myList.iterator();
        while(iter.hasNext()) {
            Zadacha3.Worker st = (Zadacha3.Worker) iter.next();
            System.out.println(st.firstName + ' ' + st.lastName + ' ' + st.calcHourlyWage());
        }


    }
}

