package overloading;

public class Overloading {

    public static void main(String[] args) {
        UseAnimals ua = new UseAnimals();
        Animal animal = new Animal();
        Horse horse = new Horse();
        Animal refObj = new Horse();
        ua.doStuff(animal);
        ua.doStuff(horse);
        ua.doStuff(refObj);

    }
}


class Animal {

}

class Horse extends Animal {

}

class UseAnimals {
    public void doStuff(Animal a) {
        System.out.println("In the Animal Version");
    }

    public void doStuff(Horse h) {
        System.out.println("In the Horse Version");
    }

}

