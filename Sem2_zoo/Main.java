package OOP.Sem2_zoo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Speakable> animals = new ArrayList<>(); // list of objects that implement Speakable interface
        animals.add(new Cat("Kitty"));
        animals.add(new Dog("Buddy"));
        animals.add(new Radio());

        ZooNoise zooNoise = new ZooNoise(animals);
        zooNoise.speakAll();
    }
}
