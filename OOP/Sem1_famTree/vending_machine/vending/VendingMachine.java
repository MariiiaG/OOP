package OOP.OOP.Sem1_famTree.vending_machine.vending;

import OOP.OOP.Sem1_famTree.vending_machine.product.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * vendingMachine
 */
public class VendingMachine {

    private long id;
    private List<Product> productList;

    public VendingMachine(List<Product> productList) {
        this.productList = productList;
    }

    public VendingMachine() {
        this(new ArrayList<>());
    }

    public void addProduct(Product product){
        productList.add(product);
    }
    public Product findMyName (String name) {
        for (Product product: productList) {
            if (product.getName().equalsIgnoreCase(name)) {
                return product;
            }
        }
        return null;
    }

    public String getProductsListInfo() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("List of products :\n");
        for (Product product: productList) {
            stringBuilder.append(product);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}