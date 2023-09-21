/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shopping2;

/**
 *
 * @author lab_services_student
 */
public abstract class Electronics extends Product{

    public Electronics(String productID, String productName, double price) {
        super(productID, productName, price);
    }
    
    @Override
    public double calculateDiscount() {
       return price * 0.10; 
    }

}
