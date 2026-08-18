class Medicine {

    public static void displayMedicine(String name, String company, double price,int quantity, String expiryDate, boolean prescriptionRequired) {

        System.out.println("Medicine Name        : " + name);
        System.out.println("Company              : " + company);
        System.out.println("Price                : " + price);
        System.out.println("Quantity             : " + quantity);
        System.out.println("Expiry Date          : " + expiryDate);
        System.out.println("Prescription Required: " + prescriptionRequired);
    }

    public static void main(String[] args) {

        displayMedicine("Paracetamol", "Cipla", 45.50, 10, "12-2027", true);

        String name = "Dolo 650";
        String company = "Micro Labs";
        double price = 35.00;
        int quantity = 15;
        String expiryDate = "08-2028";
        boolean prescriptionRequired = false;

        displayMedicine(name, company, price, quantity, expiryDate, prescriptionRequired);
    }
}