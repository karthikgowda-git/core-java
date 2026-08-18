class BusTicket {

    static void book(String from, String to, int age, String address,
                     int pincode, String paymentType, String bookingLocation) {

        System.out.println("Running book in BusTicket");

        if (from != null && to != null && age > 3 && age < 100 &&
            address != null && pincode > 0 &&
            paymentType != null && bookingLocation != null) {

            System.out.println("From : " + from);
            System.out.println("To : " + to);
            System.out.println("Age : " + age);
            System.out.println("Address : " + address);
            System.out.println("Pincode : " + pincode);
            System.out.println("Payment Type : " + paymentType);
            System.out.println("Booking Location : " + bookingLocation);
            System.out.println("Ticket Booked Successfully");
        } else {
            System.out.println("Invalid Details");
        }
    }
}