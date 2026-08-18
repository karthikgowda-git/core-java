class Customer1 {

    public static void order() {
        System.out.println("Customer placed an order.");
        Amazon.buy();
    }

    public static void main(String[] args) {
        order();
    }
}