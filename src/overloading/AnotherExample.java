package overloading;

public class AnotherExample {




    public static void main(String[] args) {
        AnimalEx animal = new AnimalEx();
        animal.eat();

        HorseEx horse = new HorseEx();
        horse.eat();

        AnimalEx animalEx = new HorseEx();
        animalEx.eat();

    }


}

class AnimalEx {
    public void eat() {
        System.out.println("Generic Animal eating");
    }
}
class HorseEx extends AnimalEx{
    public void eat() {
        System.out.println("Horse eating");
    }
    public void eat(String s) {
        System.out.println(" Horse eating" + s);
    }
}