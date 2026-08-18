class WineStore {

    public static void store(String wineName, double price, double volume) {

        System.out.println("Valid wine store data");

        if (wineName == null) {
            System.out.println("Wine name is not valid");
        }

        if (price < 200 || price > 10000) {
            System.out.println("Price is not valid");
        }

        if (volume < 180 || volume > 5000) {
            System.out.println("Volume is not valid");
        }
    }
}