class Air {
    public static void main(String[] args) {
        String composition = "Mixed Gases";
        double oxygen = 21;
        double nitrogen = 78;
        double carbonDioxide = 0.04;
        int humidity = 60;
        int pressure = 1013;
        double temperature = 28;
        String quality = "Good";
        double density = 1.225;
        String location = "Bangalore";

        System.out.println("Air Details");
        System.out.println("Composition: " + composition);
        System.out.println("Oxygen: " + oxygen + "%");
        System.out.println("Nitrogen: " + nitrogen + "%");
        System.out.println("Carbon Dioxide: " + carbonDioxide + "%");
        System.out.println("Humidity: " + humidity + "%");
        System.out.println("Pressure: " + pressure + " hPa");
        System.out.println("Temperature: " + temperature + " °C");
        System.out.println("Quality: " + quality);
        System.out.println("Density: " + density);
        System.out.println("Location: " + location);
    }
}