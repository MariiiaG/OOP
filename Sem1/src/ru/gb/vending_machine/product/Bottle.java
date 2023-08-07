package OOP.Sem1.src.ru.gb.vending_machine.product;

public class Bottle extends Product{ // same as Product but has additional characteristics
    private double volume ;

    public Bottle(String name, double price, double volume) {
        super(name, price); // super - обращение к родительскому классу
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return super.toString() + ", volume: " + volume + "л.";
    }
}
