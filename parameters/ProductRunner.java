class ProductRunner {

    public static void main(String[] args) {

        double cost = Product.getCost("Laptop");
        System.out.println("Cost: " + cost);

        double weight = Product.getWeight("Laptop", "Dell");
        System.out.println("Weight: " + weight + " kg");

        int warranty = Product.getWarranty("Laptop", "Dell");
        System.out.println("Warranty: " + warranty + " years");
    }
}