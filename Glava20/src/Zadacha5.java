public class Zadacha5 {
    public static class Animal {
        int age;
        String name;
        String gender;

        public Animal(int age, String name, String gender) {
            this.age = age;
            this.name = name;
            this.gender = gender;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public String produceSound() {
            return "sound";

        }
        public static class Dog extends Animal {
            public Dog(int age, String name, String gender) {
                super(age, name, gender);

            }

            @Override
            public String produceSound() {
                return "Bau";
            }

            @Override
            public String toString() {
                return "Dog{" +
                        "age=" + age +
                        ", name='" + name + '\'' +
                        ", sound='" + produceSound() + '\'' +
                        '}';

            }
        }

            public static class Frog extends Animal {
                public Frog(int age, String name, String gender) {
                    super(age, name, gender);

                }

                @Override

                public String produceSound() {
                    return "Grr";
                }

                @Override
                public String toString() {
                    return "Frog{" +
                            "age=" + age +
                            ", name='" + name + '\'' +
                            ", sound='" + produceSound() + '\'' +
                            '}';
                }
            }

                public static class Cat extends Animal {
                    public Cat(int age, String name, String gender) {
                        super(age, name, gender);

                    }

                    @Override

                    public String produceSound() {
                        return "Miau";
                    }

                    @Override
                    public String toString() {
                        return "Cat{" +
                                "age=" + age +
                                ", name='" + name + '\'' +
                                ", sound='" + produceSound() + '\'' +
                                '}';
                    }
                }
        public static class Kitten extends Animal {
            public Kitten(int age, String name, String gender) {
                super(age, name, gender);

            }

            @Override

            public String produceSound() {
                return "Pis";
            }

            @Override
            public String toString() {
                return "Kitten{" +
                        "age=" + age +
                        ", name='" + name + '\'' +
                        ", sound='" + produceSound() + '\'' +
                        '}';
            }
        }
        public static class Tomcat extends Animal {
            public Tomcat(int age, String name, String gender) {
                super(age, name, gender);

            }

            @Override

            public String produceSound() {
                return "Mrrrr";
            }

            @Override
            public String toString() {
                return "Tomcat{" +
                        "age=" + age +
                        ", name='" + name + '\'' +
                        ", sound='" + produceSound() + '\'' +
                        '}';
            }
        }

                    public static void main(String[] args) {

                        Animal[] animals = {new Dog(10, "Bertha", "female"),
                                new Frog(11,"Kermit", "Male"),
                                new Cat(12,"Paula", "Female"),
                        new Kitten(1,"Lilly","female"),
                        new Tomcat(5,"Tom","male")};
                        for (var animal : animals) {
                            System.out.println(animal);
                        }



        }
    }
}












