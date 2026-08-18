class TailorShop {

    static void stitch(String dressType, double width, String material,
                       String pattern, int price,
                       boolean iron, String date, double time) {

        System.out.println("Running stitch in TailorShop");

        if (dressType != null && width > 0 &&
            material != null && pattern != null &&
            price > 0 && date != null && time > 0) {

            System.out.println("Dress Type : " + dressType);
            System.out.println("Width : " + width);
            System.out.println("Material : " + material);
            System.out.println("Pattern : " + pattern);
            System.out.println("Price : " + price);
            System.out.println("Iron : " + iron);
            System.out.println("Date : " + date);
            System.out.println("Time : " + time);
            System.out.println("Order Accepted");
        } else {
            System.out.println("Invalid Details");
        }
    }
}