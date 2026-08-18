class PowerBank {
    public static void main(String[] args) {
        String brand = "Mi";
        int capacity = 20000;
        String color = "Black";
        int ports = 2;
        boolean fastCharging = true;
        double price = 1999.99;
        double weight = 0.45;
        String batteryType = "Li-ion";
        int warranty = 12;
        String output = "18W";

        System.out.println("----- PowerBank Details -----");
        System.out.println("Brand: " + brand);
        System.out.println("Capacity: " + capacity + " mAh");
        System.out.println("Color: " + color);
        System.out.println("Ports: " + ports);
        System.out.println("Fast Charging: " + fastCharging);
        System.out.println("Price: ₹" + price);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Battery Type: " + batteryType);
        System.out.println("Warranty: " + warranty + " months");
        System.out.println("Output: " + output);
    }
}