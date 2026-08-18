class FoodJuiceSponsorRunner {

    public static void main(String[] args) {

        int foodPrice = FoodJuiceSponsor.getPriceByFoodItemAndType("Biryani", "Veg");
        System.out.println("Food Price: " + foodPrice);

        int juicePrice = FoodJuiceSponsor.getPriceByJuiceName("Mango");
        System.out.println("Juice Price: " + juicePrice);

        String sponsor = FoodJuiceSponsor.getSponsorNameByTotalBill(4500);
        System.out.println("Sponsor Name: " + sponsor);
    }
}