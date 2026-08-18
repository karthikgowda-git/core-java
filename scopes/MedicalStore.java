class MedicalStore {

    public static void store(String medicineName, double price, String expiryDate) {

        System.out.println("Valid medical store data");

        if (medicineName == null) {
            System.out.println("Medicine name is not valid");
        }

        if (price < 10 || price > 10000) {
            System.out.println("Price is not valid");
        }

        if (expiryDate == null) {
            System.out.println("Expiry date is not valid");
        }
    }
}