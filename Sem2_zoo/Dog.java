package OOP.Sem2_zoo;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    @Override // indicates that the method originates from the parent class (Animal)
    public void speak() {
        System.out.println("Woof !");
    }
}