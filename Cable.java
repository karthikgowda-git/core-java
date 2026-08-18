class Cable {
    public static void main(String[] args) {
        String brand = "Boat";
        String type = "USB Type-C";
        String color = "Black";
        double length = 1.5;
        String material = "Nylon";
        double price = 299.99;
        boolean fastCharging = true;
        String connector = "USB-C";
        int warranty = 12;
        double weight = 0.1;

        System.out.println("Cable Details");
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Color: " + color);
        System.out.println("Length: " + length + " m");
        System.out.println("Material: " + material);
        System.out.println("Price: ₹" + price);
        System.out.println("Fast Charging: " + fastCharging);
        System.out.println("Connector: " + connector);
        System.out.println("Warranty: " + warranty + " months");
        System.out.println("Weight: " + weight + " kg");
    }
}