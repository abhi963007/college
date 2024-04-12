public class Product {
    int pcode;
    String pname;
    double price;

    // Constructor
    Product(int pcode, String pname, double price) {
        this.pcode = pcode;
        this.pname = pname;
        this.price = price;
    }

    public static void main(String[] args) {
        // Creating 3 objects of the class
        Product product1 = new Product(101, "Laptop", 500.0);
        Product product2 = new Product(102, "Smartphone", 300.0);
        Product product3 = new Product(103, "Tablet", 200.0);

        // Finding the product with the lowest price
        Product lowestPriceProduct = product1;
        if (product2.price < lowestPriceProduct.price) {
            lowestPriceProduct = product2;
        }
        if (product3.price < lowestPriceProduct.price) {
            lowestPriceProduct = product3;
        }

        // Output
        System.out.println("Product with the lowest price is: " + lowestPriceProduct.pname + " with price: " + lowestPriceProduct.price);
    }
}
