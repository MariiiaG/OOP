package OOP.Sem2_zoo;

public class Radio implements Speakable{
    @Override  // indicates that the method originates from the parent class (Animal)
    public void speak() {
        System.out.println("ad break");
    }
}
