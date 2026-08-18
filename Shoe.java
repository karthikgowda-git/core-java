class Shoe {
    public static void main(String[] args) {

        String brand = "Nike";
        String model = "Air Max";
        String color = "White";
        int size = 9;
        String material = "Leather";
        String type = "Sports";
        double price = 4999.99;
        boolean waterproof = false;
        double weight = 0.80;
        int warranty = 6;

        System.out.println("Shoe Details");
        System.out.println("Brand        : " + brand);
        System.out.println("Model        : " + model);
        System.out.println("Color        : " + color);
        System.out.println("Size         : " + size);
        System.out.println("Material     : " + material);
        System.out.println("Type         : " + type);
        System.out.println("Price        : ₹" + price);
        System.out.println("Waterproof   : " + waterproof);
        System.out.println("Weight       : " + weight + " kg");
        System.out.println("Warranty     : " + warranty + " months");
    }
}