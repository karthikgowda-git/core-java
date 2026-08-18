class JewelleryStore {

    public static void store(String itemName, String material, double price,
                             double weight, int purity, boolean gemstone, int size) {

        System.out.println("Valid jewellery store data");

        if (itemName == null) {
            System.out.println("Item name is not valid");
        }

        if (material == null) {
            System.out.println("Material is not valid");
        }

        if (price < 100 || price > 1000000) {
            System.out.println("Price is not valid");
        }

        if (weight < 1 || weight > 500) {
            System.out.println("Weight is not valid");
        }

        if (purity < 18 || purity > 24) {
            System.out.println("Purity is not valid");
        }

        if (gemstone == false) {
            System.out.println("Gemstone is not available");
        }

        if (size < 4 || size > 30) {
            System.out.println("Size is not valid");
        }
    }
}