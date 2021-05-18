import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ankipractice{
    public void sum()  throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        String line;
        while(true) {
            line = reader.readLine();
            if (line.equals("sum")) {
                break;
            } else {
                sum += Integer.parseInt(line);
            }
        }
        System.out.println(sum);

    }

    public void curr() {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("MM dd yyyy");
        System.out.println(formatter.format(date));
    }

    public void obji() {
        Dog doggyDog = new Dog("dg",6,"brown");
        Cat cattyCat = new Cat("ct",6,"red");
        Mouse mossyMouse = new Mouse("ms",6,"white");
    }

    public class Cat {
        String color;
        int age;
        String name;

        public Cat(String name, int age, String color) {
            this.name = name;
            this.age = age;
            this.color = color;
        }
    }

    public class Dog {
        String color;
        int age;
        String name;

        public Dog(String name, int age, String color) {
            this.name = name;
            this.age = age;
            this.color = color;
        }
    }

    public class Mouse {
        String color;
        int age;
        String name;

        public Mouse(String name, int age, String color) {
            this.name = name;
            this.age = age;
            this.color = color;
        }
    }

    public void conri() {
        Man aman = new Man("man", 5, "man street");
        Woman awoman = new Woman("woman", 5, "woman street");

        System.out.println(aman.name + " "+aman.age+" "+aman.address);
        System.out.println(awoman.name + " "+awoman.age+" "+awoman.address);
    }

    public static class Man {
        String name;
        int age;
        String address;

        public Man() {
            name = "duck";
            age = 5;
            address = "duck street";
        }

        public Man(String name) {
            this.name = name;
            age = 5;
            address = "duck street";
        }

        public Man(String name, int age) {
            this.name = name;
            this.age = age;
            address = "duck street";
        }

        public Man(String name, int age, String address) {
            this.name = name;
            this.address = address;
            this.age = age;
        }
    }

    public static class Woman {
        String name;
        int age;
        String address;

        public Woman() {
            name = "duck";
            age = 5;
            address = "duck street";
        }

        public Woman(String name) {
            this.name = name;
            age = 5;
            address = "duck street";
        }

        public Woman(String name, int age) {
            this.name = name;
            this.age = age;
            address = "duck street";
        }

        public Woman(String name, int age, String address) {
            this.name = name;
            this.address = address;
            this.age = age;
        }
    }

    /*public void ala() {
        Duck duck1 = new Duck();
        Duck duck2 = new Duck();
        System.out.println(duck1);
        System.out.println(duck2);

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        System.out.println(dog1);
        System.out.println(dog2);

        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        System.out.println(cat1);
        System.out.println(cat2);
    }*/

    /*public class Cat {
        public String toString() {
            return "Cat";
        }
    }*/

    /*public class Dog {
        public String toString() {
            return "Dog";
        }
    }

    public class Duck {
        public String toString() {
            return "Duck";
        }
    }*/

    public void ch() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int first = Integer.parseInt(reader.readLine());
        int second = Integer.parseInt(reader.readLine());
        int max = first > second ? first : second;
        System.out.println("The max is "+max);
    }

    public class KissMyShinyMetalRearActuator {

    }

    public void qqq() {
        KissMyShinyMetalRearActuator k = new KissMyShinyMetalRearActuator();
        System.out.println(k);
    }
}
