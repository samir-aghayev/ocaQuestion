package hashmaptasks;

import java.util.HashMap;
import java.util.Map;

public class Task2 {
    private HashMap<String, Product> inventory;

    public Task2() {
        this.inventory = new HashMap<>();
    }

    public void addProduct(Product product) {
        inventory.put(product.getName(), product);
    }

    public void updateProductQuantity(String id, int quantity) {
        if (inventory.containsKey(id)) {
            inventory.get(id).setQuantity(quantity);
        }
    }

    public void displayBelowStockLevel(int limit) {
        for (Map.Entry<String, Product> productEntry : inventory.entrySet()) {
            if (productEntry.getValue().getQuantity() < limit) {
                System.out.println(productEntry.getValue());
            }
        }
    }
}