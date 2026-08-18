class ProvisionStore {

    public static void store(String itemName, double price, double weight, String brand) {

        System.out.println("Valid provision store data");

        if (itemName == null) {
            System.out.println("Item name is not valid");
        }

        if (price < 10 || price > 10000) {
            System.out.println("Price is not valid");
        }

        if (weight < 0.1 || weight > 50) {
            System.out.println("Weight is not valid");
        }

        if (brand == null) {
            System.out.println("Brand is not valid");
        }
    }
}