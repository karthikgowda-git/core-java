class IceCreamStore {

    public static void save(String name, String flavour, int cost, char size, boolean cone, boolean cup) {

        System.out.println("Valid ice cream data");

        if (name == null) {
            System.out.println("Name is not valid");
        }

        if (flavour == null) {
            System.out.println("Flavour is not valid");
        }

        if (cost < 20 || cost > 500) {
            System.out.println("Cost is not valid");
        }

        if (size != 'S' && size != 'M' && size != 'L' &&
            size != 's' && size != 'm' && size != 'l') {
            System.out.println("Size is not valid");
        }

        if (cone == false && cup == false) {
            System.out.println("Select either cone or cup");
        }

        if (cone == true && cup == true) {
            System.out.println("Choose only one: Cone or Cup");
        }
    }

    public static void order(String name, String flavour, int quantity) {

        System.out.println("Valid order data");

        if (name == null) {
            System.out.println("Name is not valid");
        }

        if (flavour == null) {
            System.out.println("Flavour is not valid");
        }

        if (quantity < 1 || quantity > 20) {
            System.out.println("Quantity is not valid");
        }
    }
}