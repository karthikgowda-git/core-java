class Paint {
    public static void main(String[] args) {
        String brand = "Asian Paints";
        String color = "Blue";
        String type = "Emulsion";
        String finish = "Matte";
        int volume = 10;
        double price = 2500;
        boolean waterproof = true;
        int dryingTime = 4;
        int coverage = 120;
        int warranty = 5;

        System.out.println("Paint Details");
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Type: " + type);
        System.out.println("Finish: " + finish);
        System.out.println("Volume: " + volume + " L");
        System.out.println("Price: ₹" + price);
        System.out.println("Waterproof: " + waterproof);
        System.out.println("Drying Time: " + dryingTime + " hrs");
        System.out.println("Coverage: " + coverage + " sq.ft");
        System.out.println("Warranty: " + warranty + " years");
    }
}