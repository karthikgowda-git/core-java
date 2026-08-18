class Keychain {

    public static void displayKeychain(String brand, String material, String color,double price, double weight, String shape,int numberOfKeys, boolean hasLED,String manufacturer, String country,String keyType, String size,String design) {

        System.out.println("Brand            : " + brand);
        System.out.println("Material         : " + material);
        System.out.println("Color            : " + color);
        System.out.println("Price            : " + price);
        System.out.println("Weight           : " + weight);
        System.out.println("Shape            : " + shape);
        System.out.println("Number of Keys   : " + numberOfKeys);
        System.out.println("Has LED          : " + hasLED);
        System.out.println("Manufacturer     : " + manufacturer);
        System.out.println("Country          : " + country);
        System.out.println("Key Type         : " + keyType);
        System.out.println("Size             : " + size);
        System.out.println("Design           : " + design);
    }

    public static void main(String[] args) {
        displayKeychain("Wildcraft", "Metal", "Silver",250.0, 50.0, "Round", 5, true,"Wildcraft", "India", "Car","Medium", "Modern");

        String brand = "Skybags";
        String material = "Leather";
        String color = "Black";
        double price = 180.0;
        double weight = 40.0;
        String shape = "Rectangle";
        int numberOfKeys = 4;
        boolean hasLED = false;
        String manufacturer = "Skybags";
        String country = "India";
        String keyType = "House";
        String size = "Small";
        String design = "Classic";

        displayKeychain(brand, material, color, price, weight,shape, numberOfKeys, hasLED, manufacturer,country, keyType, size, design);
    }
}