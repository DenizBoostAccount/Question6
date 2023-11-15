package entity;
//Uçabilen Kuşlar Sınıfı
//Uçabilen kuşlar aynı zamanda uçabilen bir hayvandır
public class FlyableBird extends Bird implements FlyableAnimal{
    public FlyableBird(String type, int age, String habitat) {
        super(type, age, habitat);
    }

    @Override
    public void crow() {
        System.out.println(getType() + " is crowing");
    }

    @Override
    public void fly() {
        System.out.println(getType() + " is flying");
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
