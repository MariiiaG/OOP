package OOP.Sem1.src.ru.gb.vending_machine;

import OOP.Sem1.src.ru.gb.vending_machine.product.Bottle;
import OOP.Sem1.src.ru.gb.vending_machine.product.Product;
import OOP.Sem1.src.ru.gb.vending_machine.vending.VendingMachine;

public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();

        Product product1 = new Product("twix", 100);
        Product product2 = new Bottle("coca-cola", 120, 2); // using Product/ Bottle in the 1st instance determines what methods we will have available
        Product product3 = new Product("bounty", 90);

        vendingMachine.addProduct(product1);
        vendingMachine.addProduct(product2);
        vendingMachine.addProduct(product3);

        System.out.println(vendingMachine.getProductsListInfo());

    }
}
