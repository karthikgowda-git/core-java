class Camera {

    public static void displayCamera(String brand, String model, double price,int megapixel, boolean flash,String color, double zoom, String batteryType) {

        System.out.println("Brand        : " + brand);
        System.out.println("Model        : " + model);
        System.out.println("Price        : " + price);
        System.out.println("Megapixel    : " + megapixel);
        System.out.println("Flash        : " + flash);
        System.out.println("Color        : " + color);
        System.out.println("Zoom         : " + zoom);
        System.out.println("Battery Type : " + batteryType);
    }

    public static void main(String[] args) {

        displayCamera("Canon", "EOS 1500D", 45000.0, 24, true,"Black", 10.0,"Li-ion");

        String brand = "Nikon";
        String model = "D3500";
        double price = 52000.0;
        int megapixel = 24;
        boolean flash = true;
        String color = "Black";
        double zoom = 8.0;
        String batteryType = "Rechargeable";

        displayCamera(brand, model, price, megapixel, flash, color, zoom, batteryType);
    }
}