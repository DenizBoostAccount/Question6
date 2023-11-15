package entity;
//Hayvanlar Sınıfı
public abstract class Animal implements IAnimal{
    private String type;//Hayvanın tipi : Kuş, Balık, Yılan vb.
    private int age;
    private String habitat; //Hayvanın doğal ortamı

    public Animal(String type, int age, String habitat) {
        this.type = type;
        this.age = age;
        this.habitat = habitat;
    }

    public String getType() {
        return type;
    }

    public int getAge() {
        return age;
    }

    public String getHabitat() {
        return habitat;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", age=" + age +
                ", habitat='" + habitat + '\'' +
                '}';
    }
}
