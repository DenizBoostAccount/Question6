package entity;

public interface IAnimal {
    void move(); //hareket et arayüzü
    void feed(); //beslen arayüzü
    void sleep(); //uyu arayüzü
    void printAnimal(); //hayvanın türünü(Kuş, balık, yılan vb.) bastıran arayüz
    default void survive(){ //yaşamaya çalış metodu
        System.out.println(takeString());
    }
    private static String takeString(){
        return "I am an animal and trying to live";
    }
}
