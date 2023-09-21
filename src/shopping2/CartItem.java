/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shopping2;

/**
 *
 * @author lab_services_student
 */
public class CartItem {
    private Product product;
    private int quantity;

    public CartItem(Product product, int quanitity) {
        this.product = product;
        this.quantity = quantity;
    }
    
    public double calculateTotalCost() {
        double itemPrice = product.price - product.calculateDiscount();
        return itemPrice * quantity;
    }

}
