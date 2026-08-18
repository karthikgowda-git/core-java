class Bus {
    public static void main(String[] args) {
        String company = "KSRTC";
        String busNo = "KA01AB1234";
        String route = "Bangalore-Mysore";
        int capacity = 50;
        String fuel = "Diesel";
        String color = "Red";
        double mileage = 6.5;
        String driver = "Ramesh";
        double fare = 250;
        boolean ac = true;

        System.out.println("Bus Details");
        System.out.println("Company: " + company);
        System.out.println("Bus Number: " + busNo);
        System.out.println("Route: " + route);
        System.out.println("Capacity: " + capacity);
        System.out.println("Fuel: " + fuel);
        System.out.println("Color: " + color);
        System.out.println("Mileage: " + mileage);
        System.out.println("Driver: " + driver);
        System.out.println("Fare: ₹" + fare);
        System.out.println("AC: " + ac);
    }
}