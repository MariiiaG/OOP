package OOP.Sem2_zoo;

public class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }

    @Override // indicates that the method originates from the parent class (Animal)
    public void speak() {
        System.out.println("Meow !");
    }
}
