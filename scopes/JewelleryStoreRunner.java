class JewelleryStoreRunner {

    public static void main(String[] args) {

        String itemName = "Gold Ring";
        String material = "Gold";
        double price = 55000;
        double weight = 8;
        int purity = 22;
        boolean gemstone = true;
        int size = 12;

        System.out.println("Item Name: " + itemName);
        System.out.println("Material: " + material);
        System.out.println("Price: " + price);
        System.out.println("Weight: " + weight);
        System.out.println("Purity: " + purity + "K");
        System.out.println("Gemstone: " + gemstone);
        System.out.println("Size: " + size);

        JewelleryStore.store(itemName, material, price, weight, purity, gemstone, size);

        JewelleryStore.store(null, null, 50, 0.5, 15, false, 35);
    }
}