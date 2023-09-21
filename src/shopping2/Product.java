/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shopping2;

/**
 *
 * @author lab_services_student
 */
public abstract class Product {
    private String productID;
    private String productName;
    double price;

    public Product(String productID, String productName, double price) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
    }
 
    public abstract double calculateDiscount();
    
}
