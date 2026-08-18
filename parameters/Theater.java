class Theater {

    static void book(String movieName, int quantity, String screen, boolean discount, boolean orderSnacks) {

        System.out.println("Running book in Theater");

        if (movieName != null && quantity > 0 && quantity < 10 && screen != null) {

            System.out.println("Movie Name : " + movieName);
            System.out.println("Quantity   : " + quantity);
            System.out.println("Screen     : " + screen);
            System.out.println("Discount   : " + discount);
            System.out.println("Snacks     : " + orderSnacks);
            System.out.println("Booking Successful");
        } else {
            System.out.println("Invalid Details");
        }
    }
}