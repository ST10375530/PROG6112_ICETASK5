/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shopping2;

/**
 *
 * @author lab_services_student
 */
public class Clothing extends Product{

    public Clothing(String productID, String productName, double price) {
        super(productID, productName, price);
    }
    
    @Override 
    public double calculateDiscount() {
        return price*015;
    }
}
