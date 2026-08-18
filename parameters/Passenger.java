class Passenger {

    public static void travel() {
        System.out.println("Passenger starts travelling.");
        BusStand.board();
    }

    public static void main(String[] args) {
        travel();
    }
}