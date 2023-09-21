/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shopping2;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author lab_services_student
 */

public class Cart {
    private List<CartItem> items;

    public Cart() {
        this.items = new ArrayList<>();
    }

    public void addItem(CartItem item) {
        items.add(item);
    }

    public double calculateTotalCost() {
        double totalCost = 0;
        for (CartItem item : items) {
            totalCost += item.calculateTotalCost();
        }
        return totalCost;
    }

    public void checkout() {
        System.out.println("Checkout is complete");
    }
}

