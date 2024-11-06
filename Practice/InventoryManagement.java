
import java.util.ArrayList;

/*
 Write a Java program to create a class called "Inventory" with a
 collection of products and methods to add and remove products,
 and to check for low inventory.
 */

class Product{
    private String name;
    private int quantity;

    public Product(String name, int quantity){
        this.name = name;
        this.quantity = quantity;
    }

    public String getName(){
        return name;
    }

    public int getQuantity(){
        return quantity;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public boolean isStackLow(){
        return quantity < 10;
    }
}


class Inventory{
    private final ArrayList<Product> products; //final dewa na dewa my wish
    public Inventory(){
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product){
        products.add(product);
    }

    public void removeProduct(Product product){
        products.remove(product);
    }

    public void checkLowInventory(){
        for(Product product : products){
            if(product.getQuantity() <= 100){
                System.out.println(product.getName() + " is running low on inventory. Current quantity: " + product.getQuantity());
            }
        }
    }
}

public class InventoryManagement {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        Product product1 = new Product("LED TV", 200);
        Product product2 = new Product("Mobile", 80);
        Product product3 = new Product("Tablet", 50);

        System.out.println("Add three products in inventory:");
        inventory.addProduct(product1);
        inventory.addProduct(product2);
        inventory.addProduct(product3);

        System.out.println("\nCheck low inventory:");
        inventory.checkLowInventory();

        System.out.println("\nRemove Tablet from the inventory!");
        inventory.removeProduct(product3);

        System.out.println("\nAgain check low inventory:");
        inventory.checkLowInventory();
    }
}
