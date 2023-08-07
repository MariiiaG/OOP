package OOP.Sem1.src.ru.gb.vending_machine.product;

/**
 * InnerProduct
 */
public class Product {
    private String name; // если не указан модификатор доступа, то по умолч - только внутри данного пакета
    private double price;

/*    public void setName(String name) { // start typing 'getname' to have these 2 lines autopopulated
        this.name = name;
    }*/

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() { // shortcut - type getName
        return name;
    }

    @Override
    public String toString() {
        return "name: " + name + ", price: " + price + "p.";
    }
}