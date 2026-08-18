class Product {

    public static double getCost(String productName) {
        System.out.println("Product Name: " + productName);
        return 25000.0;
    }

    public static double getWeight(String productName, String brand) {
        System.out.println("Product Name: " + productName);
        System.out.println("Brand: " + brand);
        return 1.5;
    }

    public static int getWarranty(String productName, String brand) {
        System.out.println("Product Name: " + productName);
        System.out.println("Brand: " + brand);
        return 2;
    }
}