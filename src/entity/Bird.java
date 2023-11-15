package entity;
//Kuşlar Sınıfı
public abstract class Bird extends BackBonedAnimal{

    public Bird(String type, int age, String habitat) {
        super(type, age, habitat);
    }
    public abstract void crow();

}
