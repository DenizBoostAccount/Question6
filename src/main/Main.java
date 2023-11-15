package main;

import entity.*;

public class Main {
    public static void main(String[] args) {
        Animal animal = getAnAnimal();
        System.out.println("Type: " + animal.getType());
        System.out.println("Age: " + animal.getAge());
        System.out.println("Habitat: " + animal.getHabitat());
        System.out.println("***************************");
        animal.move();
        animal.feed();
        animal.sleep();
        if(animal instanceof FlyableBird flyableBird1){
            flyableBird1.crow();
            flyableBird1.fly();
        } else if (animal instanceof Snake snake1) {
            snake1.swim();
        } else if (animal instanceof Crocodile crocodile1) {
            crocodile1.swim();
        } else if (animal instanceof BonedFish bonedFish1) {
            bonedFish1.swim();
        } else if (animal instanceof CartilageFish cartilageFish1) {
            cartilageFish1.swim();
        } else if (animal instanceof LeglessFrog leglessFrog1) {
            leglessFrog1.swim();
        } else if (animal instanceof TaillessFrog taillessFrog1) {
            taillessFrog1.swim();
        }else if (animal instanceof TailedFrog tailedFrog1){
            tailedFrog1.swim();
        }
        animal.survive();


    }
    public static Animal getAnAnimal(){
        int number = (int)(1 + Math.random() * 14);

        switch (number){
            case 1:
                return new CartilageFish("Cartilage Fish",1,"Water");
            case 2:
                return new BonedFish("Boned Fish",2,"Water");
            case 3:
                return new LeglessFrog("Legless Frog",2,"Water");
            case 4:
                return new TaillessFrog("Tailless Frog",3,"Land");
            case 5:
                return new TailedFrog("Tailed Frog",3,"Water-Land");
            case 6:
                return new Snake("Snake",6,"Water");
            case 7:
                return new Lizard("Lİzard",4,"Land");
            case 8:
                return new Crocodile("Crocodile",2,"Land");
            case 9:
                return new Turtle("Turtle",1,"Land");
            case 10:
                return new FlightlessBird("Flightless Bird",2,"Land");
            case 11:
                return new FlyableBird("Flyable Bird",7,"Land");
            case 12:
                return new BeakedMammal("Beaked Mammal",2,"Land");
            case 13:
                return new MarsupialMammal("Marsupial Mammal",8,"Land");
            case 14:
                return new PlacentalMammal("Placental Mammal",5,"Land");
        }
        return null;
    }

}
