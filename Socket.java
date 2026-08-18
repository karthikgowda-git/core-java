class Socket {
    public static void main(String[] args) {
        String brand = "Anchor";
        String type = "3-Pin";
        String color = "White";
        int voltage = 230;
        int current = 16;
        String material = "Plastic";
        double price = 199.99;
        boolean grounded = true;
        int warranty = 1;
        String country = "India";

        System.out.println("Socket Details");
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Color: " + color);
        System.out.println("Voltage: " + voltage);
        System.out.println("Current: " + current);
        System.out.println("Material: " + material);
        System.out.println("Price: ₹" + price);
        System.out.println("Grounded: " + grounded);
        System.out.println("Warranty: " + warranty + " year");
        System.out.println("Country: " + country);
    }
}