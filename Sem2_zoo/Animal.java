package OOP.Sem2_zoo;

public abstract class Animal implements Speakable{ // abstract class is a blueprint for future classes
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
