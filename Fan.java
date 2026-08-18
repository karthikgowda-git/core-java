class Fan {
    public static void main(String[] args) {

        String brand = "Usha";
        String type = "Ceiling Fan";
        String color = "Brown";
        int blades = 3;
        int speed = 400;
        int power = 75;
        double price = 2499.99;
        boolean remoteControl = false;
        int warranty = 2;
        int voltage = 230;

        System.out.println("Fan Details");
        System.out.println("Brand          : " + brand);
        System.out.println("Type           : " + type);
        System.out.println("Color          : " + color);
        System.out.println("Number of Blades : " + blades);
        System.out.println("Speed (RPM)    : " + speed);
        System.out.println("Power (Watts)  : " + power);
        System.out.println("Price          : ₹" + price);
        System.out.println("Remote Control : " + remoteControl);
        System.out.println("Warranty       : " + warranty + " years");
        System.out.println("Voltage        : " + voltage + " V");
    }
}