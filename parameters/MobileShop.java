class MobileShop {

    static void buy(String brand, String model,
                    int quantity, double price) {

        if (brand != null && model != null &&
            quantity > 0 && price > 0) {

            System.out.println("Brand : " + brand);
            System.out.println("Model : " + model);
            System.out.println("Quantity : " + quantity);
            System.out.println("Price : " + price);
            System.out.println("Purchase Successful");
        } else {
            System.out.println("Invalid Details");
        }
    }
}