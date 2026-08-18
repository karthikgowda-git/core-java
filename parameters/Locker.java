class Locker {

    public static void displayLocker(int lockerNumber, String ownerName,String location, String type,double height, double width,String color, boolean isLocked,String keyType, int capacity,double price, String manufacturer) {

        System.out.println("Locker Number : " + lockerNumber);
        System.out.println("Owner Name    : " + ownerName);
        System.out.println("Location      : " + location);
        System.out.println("Type          : " + type);
        System.out.println("Height        : " + height);
        System.out.println("Width         : " + width);
        System.out.println("Color         : " + color);
        System.out.println("Locked        : " + isLocked);
        System.out.println("Key Type      : " + keyType);
        System.out.println("Capacity      : " + capacity);
        System.out.println("Price         : " + price);
        System.out.println("Manufacturer  : " + manufacturer);
    }

    public static void main(String[] args) {

        displayLocker(101, "Rahul", "Office", "Digital",6.5, 3.0, "Grey", true,"PIN", 100, 25000.0, "Godrej");

        int lockerNumber = 202;
        String ownerName = "Karthika";
        String location = "Bank";
        String type = "Electronic";
        double height = 7.0;
        double width = 3.5;
        String color = "Black";
        boolean isLocked = true;
        String keyType = "Fingerprint";
        int capacity = 150;
        double price = 32000.0;
        String manufacturer = "Godrej";

        displayLocker(lockerNumber, ownerName, location, type, height, width, color, isLocked,keyType, capacity, price, manufacturer);
    }
}