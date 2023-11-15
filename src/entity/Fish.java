package entity;
//Balıklar Sınıfı
public abstract class Fish extends BackBonedAnimal implements FloatableAnimal {
    public Fish(String type, int age, String habitat) {
        super(type, age, habitat);
    }


}
