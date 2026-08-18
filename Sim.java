class Sim {
    public static void main(String[] args) {
        String provider = "Jio";
        String number = "9876543210";
        String type = "4G";
        String network = "LTE";
        int validity = 84;
        double balance = 100;
        double data = 2;
        int sms = 100;
        double price = 719;
        String country = "India";

        System.out.println("SIM Details");
        System.out.println("Provider: " + provider);
        System.out.println("Number: " + number);
        System.out.println("Type: " + type);
        System.out.println("Network: " + network);
        System.out.println("Validity: " + validity + " days");
        System.out.println("Balance: ₹" + balance);
        System.out.println("Daily Data: " + data + " GB");
        System.out.println("SMS: " + sms);
        System.out.println("Price: ₹" + price);
        System.out.println("Country: " + country);
    }
}