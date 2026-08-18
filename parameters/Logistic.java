class Logistic {

    public static void pickup() {
        System.out.println("Logistic picked up the product.");
        Vendor.sell();
    }

    public static void main(String[] args) {
        pickup();
    }
}