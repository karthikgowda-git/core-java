class Stone {

    public static void displayStone(String type, String color, double weight,double price, String shape, String origin,boolean polished) {

        System.out.println("Type      : " + type);
        System.out.println("Color     : " + color);
        System.out.println("Weight    : " + weight);
        System.out.println("Price     : " + price);
        System.out.println("Shape     : " + shape);
        System.out.println("Origin    : " + origin);
        System.out.println("Polished  : " + polished);
    }

    public static void main(String[] args) {

        displayStone("Granite", "Black", 12.5, 1500.0, "Square", "India", true);

        String type = "Marble";
        String color = "White";
        double weight = 10.2;
        double price = 1800.0;
        String shape = "Rectangle";
        String origin = "Italy";
        boolean polished = true;

        displayStone(type, color, weight, price, shape, origin, polished);
    }
}