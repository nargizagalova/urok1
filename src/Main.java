import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Gat cat = new Gat();
//
//        cat.setName("Murca");
//        cat.age = 4;
//        cat.setWeight(2.3);
//        System.out.println("name " + cat.getName());
//        System.out.println("age " + cat.age);
//        System.out.println("weight " + cat.getWeight());


        Person person = new Person();
        person.setName("Nargiza");
        person.setLastName("Galova");

        Gat cat = new Gat();
        cat.setName("Murca");
        cat.setAge(4);
        cat.setWeight(2.3);
        cat.setOwner("Nargiza");
        cat.setPerson(person);

        cat.hasOwner();



    }
}