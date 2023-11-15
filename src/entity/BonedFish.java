package entity;
//Kemikli Balıklar Sınıfı
public class BonedFish extends Fish {
    public BonedFish(String type, int age, String habitat) {
        super(type, age, habitat);
    }

    @Override
    public void swim() {
        System.out.println(getType() + " is swimming");
    }

    @Override
    public void move() {
        System.out.println(getType() + " is moving");
    }

    @Override
    public void feed() {
        System.out.println(getType() + " feeding");
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
