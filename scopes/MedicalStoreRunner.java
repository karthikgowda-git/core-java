class MedicalStoreRunner {

    public static void main(String[] args) {

        String medicineName = "Paracetamol";
        double price = 45;
        String expiryDate = "12/2027";

        System.out.println("Medicine Name: " + medicineName);
        System.out.println("Price: " + price);
        System.out.println("Expiry Date: " + expiryDate);

        MedicalStore.store(medicineName, price, expiryDate);

        MedicalStore.store(null, 5, null);
    }
}