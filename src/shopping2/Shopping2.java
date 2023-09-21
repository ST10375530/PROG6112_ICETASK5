/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package shopping2;
import java.util.Scanner;
/**
 *
 * @author lab_services_student
 */
public class Shopping2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       Product[] products = new Product[3];
       int[] quantities = new int[3];

       Cart cart = new Cart();
       
       double totalCost = cart.calculateTotalCost();
       

       for (int i = 0; i < 3; i++) {
                System.out.println("Please enter the following details of the product you wish to purchase: ");
                System.out.println("Product ID: ");
                String productId = input.nextLine();
                
                System.out.println("Product Name: ");
                String productName = input.nextLine();
                
                System.out.println("Product Price: R");
                double price = input.nextDouble();
                System.out.println();
                
                System.out.print("Quantity: ");
                int quantity = input.nextInt();
                input.nextLine();

                
                System.out.println("Product Type: ( Electronics or Clothing)");
                String productType = input.nextLine();

                if (productType.equalsIgnoreCase("Electronics")) {
                    products[i] = new Electronics(productId, productName, price) {};
                } else if (productType.equalsIgnoreCase("Clothing")) {
                    products[i] = new Clothing(productId, productName, price);
                } else {
                    System.out.println("Invalid product type. Defaulting to Electronics.");
                    products[i] = new Electronics(productId, productName, price) {};
                }
                cart.addItem(new CartItem(products[i], quantities[i]));
            
       }
       System.out.println("Total product cost (+ shipping fee): R" + totalCost);

    }
    
}
