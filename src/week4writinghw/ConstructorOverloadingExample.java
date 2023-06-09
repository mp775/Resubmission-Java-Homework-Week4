package week4writinghw;

public class ConstructorOverloadingExample {

        int id;
        String name;
        int age;

        //creating two arg constructor
        ConstructorOverloadingExample(int i, String n) {
            id = i;
            name = n;
        }

        //creating three arg constructor
        ConstructorOverloadingExample(int i, String n, int a) {
            id = i;
            name = n;
            age = a;
        }

        public void display() {
            System.out.println(id + " " + name + " " + age);
        }

        public static void main(String args[]) {
            ConstructorOverloadingExample s1 = new ConstructorOverloadingExample(111, "Karan");
            ConstructorOverloadingExample s2 = new ConstructorOverloadingExample(222, "Aryan", 25);
            s1.display();
            s2.display();
        }
    }


