class Shade {
    public static void main(String[] args) {

        String brand = "Ray-Ban";
        String type = "Sunglasses";
        String color = "Black";
        String frameMaterial = "Metal";
        String lensMaterial = "Glass";
        boolean uvProtection = true;
        double price = 2999.99;
        double weight = 0.15;
        int warranty = 12;
        String country = "India";

        System.out.println("Shade Details");
        System.out.println("Brand           : " + brand);
        System.out.println("Type            : " + type);
        System.out.println("Color           : " + color);
        System.out.println("Frame Material  : " + frameMaterial);
        System.out.println("Lens Material   : " + lensMaterial);
        System.out.println("UV Protection   : " + uvProtection);
        System.out.println("Price           : ₹" + price);
        System.out.println("Weight          : " + weight + " kg");
        System.out.println("Warranty        : " + warranty + " months");
        System.out.println("Country         : " + country);
    }
}