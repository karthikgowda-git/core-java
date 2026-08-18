class IronBox {
    public static void main(String[] args) {
        String brand = "Philips";
        String color = "Blue";
        int power = 1000;
        int voltage = 230;
        boolean steam = true;
        double price = 1599;
        int warranty = 2;
        double weight = 1.2;
        double cordLength = 2.0;
        String type = "Steam Iron";

        System.out.println("IronBox Details");
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Power: " + power + " W");
        System.out.println("Voltage: " + voltage + " V");
        System.out.println("Steam: " + steam);
        System.out.println("Price: ₹" + price);
        System.out.println("Warranty: " + warranty + " years");
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Cord Length: " + cordLength + " m");
        System.out.println("Type: " + type);
    }
}