class DryFruitStore {

    public static void store(String dryFruitName, double price, double weight) {

        System.out.println("Valid dry fruit store data");

        if (dryFruitName == null) {
            System.out.println("Dry fruit name is not valid");
        }

        if (price < 100 || price > 5000) {
            System.out.println("Price is not valid");
        }

        if (weight < 0.25 || weight > 10) {
            System.out.println("Weight is not valid");
        }
    }
}