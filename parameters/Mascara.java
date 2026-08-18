class Mascara {

    public static void displayMascara(String brand, String color, double price,int quantity, boolean waterproof,String expiryDate, String type,double weight, String manufacturer,int rating) {

        System.out.println("Brand        : " + brand);
        System.out.println("Color        : " + color);
        System.out.println("Price        : " + price);
        System.out.println("Quantity     : " + quantity);
        System.out.println("Waterproof   : " + waterproof);
        System.out.println("Expiry Date  : " + expiryDate);
        System.out.println("Type         : " + type);
        System.out.println("Weight       : " + weight);
        System.out.println("Manufacturer : " + manufacturer);
        System.out.println("Rating       : " + rating);
    }

    public static void main(String[] args) {

        displayMascara("Maybelline", "Black", 499.0, 1, true,"12-2028", "Volume", 15.5, "Maybelline", 5);

        String brand = "Lakme";
        String color = "Brown";
        double price = 399.0;
        int quantity = 2;
        boolean waterproof = false;
        String expiryDate = "10-2027";
        String type = "Lengthening";
        double weight = 12.0;
        String manufacturer = "Lakme";
        int rating = 4;

        displayMascara(brand, color, price, quantity, waterproof,expiryDate, type, weight, manufacturer, rating);
    }
}