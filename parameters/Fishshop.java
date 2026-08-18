class FishShop {

    static void sell(String fishName, int quantity, double price) {

        System.out.println("Running sell in FishShop");

        if (fishName != null && quantity > 0 && quantity <= 100 && price > 0) {
            System.out.println("Fish Name : " + fishName);
            System.out.println("Quantity  : " + quantity);
            System.out.println("Price     : " + price);
            System.out.println("Fish sold successfully");
        } else {
            System.out.println("Invalid Details");
        }
    }
}