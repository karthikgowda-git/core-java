class Slipper {

    public static void displaySlipper(String brand, String color, int size,double price, String material,boolean washable, String gender,double weight, String style,String manufacturer, int quantity) {

        System.out.println("Brand        : " + brand);
        System.out.println("Color        : " + color);
        System.out.println("Size         : " + size);
        System.out.println("Price        : " + price);
        System.out.println("Material     : " + material);
        System.out.println("Washable     : " + washable);
        System.out.println("Gender       : " + gender);
        System.out.println("Weight       : " + weight);
        System.out.println("Style        : " + style);
        System.out.println("Manufacturer : " + manufacturer);
        System.out.println("Quantity     : " + quantity);
    }

    public static void main(String[] args) {

        displaySlipper("Puma", "Black", 9, 899.0,"Rubber", true, "Men", 450.0,"Casual", "Puma", 1);

        String brand = "Bata";
        String color = "Blue";
        int size = 8;
        double price = 599.0;
        String material = "Foam";
        boolean washable = true;
        String gender = "Women";
        double weight = 350.0;
        String style = "Comfort";
        String manufacturer = "Bata";
        int quantity = 2;

        displaySlipper(brand, color, size, price, material,washable, gender, weight, style, manufacturer, quantity);
    }
}