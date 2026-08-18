class ProvisionStoreRunner {

    public static void main(String[] args) {

        String itemName = "Rice";
        double price = 650;
        double weight = 25;
        String brand = "India Gate";

        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Weight: " + weight);
        System.out.println("Brand: " + brand);

        ProvisionStore.store(itemName, price, weight, brand);

     
        ProvisionStore.store(null, 5, 60, null);
    }
}