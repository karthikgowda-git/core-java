class ChocolateStoreRunner {

    public static void main(String[] args) {

        String chocolateName = "Dairy Milk";
        double price = 120;
        double weight = 100;

        System.out.println("Chocolate Name: " + chocolateName);
        System.out.println("Price: " + price);
        System.out.println("Weight: " + weight);

        ChocolateStore.store(chocolateName, price, weight);

        ChocolateStore.store(null, 5, 5);
    }
}