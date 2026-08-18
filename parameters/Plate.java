class Plate {

    public static void displayPlate(String material, String color, double price) {
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {

        displayPlate("Steel", "Silver", 250.0);

        String material = "Plastic";
        String color = "White";
        double price = 120.0;

        displayPlate(material, color, price);
    }
}