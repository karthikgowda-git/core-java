class Seafood {

    public static void sell(String fishName, int quantity, double price) {

        System.out.println("Name of Fish: " + fishName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: " + price);

        if (quantity >= 0 && quantity <= 100) {
            System.out.println("Valid quantity");
        } else {
            System.out.println("Invalid quantity");
        }
    }

    public static void main(String[] args) {
        sell("Pomfret", 20, 450.0);
    }
}