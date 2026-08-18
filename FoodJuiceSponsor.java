class FoodJuiceSponsor {

    static int getPriceByFoodItemAndType(String name, String type) {

        if (name.equals("Biryani") && type.equals("Veg")) {
            return 150;
        } else if (name.equals("Biryani") && type.equals("Non Veg")) {
            return 200;
        } else if (name.equals("Fried Rice") && type.equals("Veg")) {
            return 120;
        } else if (name.equals("Fried Rice") && type.equals("Non Veg")) {
            return 150;
        } else if (name.equals("Samosa") && type.equals("Veg")) {
            return 20;
        } else if (name.equals("Samosa") && type.equals("Non Veg")) {
            return 40;
        }

        return 0;
    }

    static int getPriceByJuiceName(String name) {

        if (name.equals("Mango")) {
            return 80;
        } else if (name.equals("Orange")) {
            return 60;
        } else if (name.equals("Apple")) {
            return 70;
        } else if (name.equals("Pineapple")) {
            return 75;
        } else if (name.equals("Watermelon")) {
            return 50;
        }

        return 0;
    }

    static String getSponsorNameByTotalBill(double bill) {

        if (bill >= 5000) {
            return "TCS";
        } else if (bill >= 4000) {
            return "Infosys";
        } else if (bill >= 3000) {
            return "Wipro";
        } else if (bill >= 2000) {
            return "Accenture";
        } else if (bill >= 1000) {
            return "IBM";
        }

        return "No Sponsor";
    }
}