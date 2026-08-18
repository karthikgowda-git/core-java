class Amazon {

    public static void buy() {
        System.out.println("Product purchased.");
        discount();
    }

    public static void discount() {
        System.out.println("Discount applied.");
        member();
    }

    public static void member() {
        System.out.println("Prime membership verified.");
        Logistic.pickup();
    }

    public static void main(String[] args) {
        buy();
    }
}