class ChocolateStore {

    public static void store(String chocolateName, double price, double weight) {

        System.out.println("Valid chocolate store data");

        if (chocolateName == null) {
            System.out.println("Chocolate name is not valid");
        }

        if (price < 10 || price > 5000) {
            System.out.println("Price is not valid");
        }

        if (weight < 10 || weight > 1000) {
            System.out.println("Weight is not valid");
        }
    }
}