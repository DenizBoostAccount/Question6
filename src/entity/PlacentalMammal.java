package entity;
//Plasentalı Memeliler Sınıfı
public class PlacentalMammal extends Mammal{
    public PlacentalMammal(String type, int age, String habitat) {
        super(type, age, habitat);
    }

    @Override
    public void move() {
        System.out.println(getType() + " is moving");
    }

    @Override
    public void feed() {
        System.out.println(getType() + " is feeding");
    }

    @Override
    public void sleep() {
        System.out.println(getType() + " is sleeping");
    }

    @Override
    public void printAnimal() {
        System.out.println(super.toString());
    }
}
