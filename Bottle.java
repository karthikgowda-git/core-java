class Bottle {

    static String brand;
    static String color;
    static int capacity;

    static void storeInfo() {
        System.out.println("Storing Bottle information...");
        brand = "Milton";
        color = "Blue";
        capacity = 1000;
    }

    static void printInfo() {
        System.out.println("Displaying Bottle information");
        System.out.println("Brand : " + brand);
        System.out.println("Color : " + color);
        System.out.println("Capacity : " + capacity + " ml");
    }
}