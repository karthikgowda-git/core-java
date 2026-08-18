class Cylinder {
    public static void main(String[] args) {
        String type = "LPG";
        double capacity = 14.2;
        double weight = 29.5;
        String color = "Red";
        int pressure = 150;
        String brand = "Indane";
        double price = 950;
        String refillDate = "20-07-2026";
        String expiryDate = "20-07-2036";
        String status = "Available";

        System.out.println("Cylinder Details");
        System.out.println("Type: " + type);
        System.out.println("Capacity: " + capacity + " kg");
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Color: " + color);
        System.out.println("Pressure: " + pressure + " bar");
        System.out.println("Brand: " + brand);
        System.out.println("Price: ₹" + price);
        System.out.println("Refill Date: " + refillDate);
        System.out.println("Expiry Date: " + expiryDate);
        System.out.println("Status: " + status);
    }
}