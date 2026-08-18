class StreetLight {

    public static void displayStreetLight(String location, int poles) {
        System.out.println("Location: " + location);
        System.out.println("Poles: " + poles);
    }

    public static void main(String[] args) {

        displayStreetLight("MG Road", 20);

        String location = "Brigade Road";
        int poles = 15;

        displayStreetLight(location, poles);
    }
}