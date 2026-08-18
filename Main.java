class Main{
    public static void main(String[] args)
    {
        String name1 = "Biryani";
        String type1 = "Veg";

        int price1 = Food.getPriceByFoodItemType(name1, type1);

        System.out.println("Biryani Veg Price = " + price1);


        String name2 = "Biryani";
        String type2 = "Non Veg";

        int price2 = Food.getPriceByFoodItemType(name2, type2);

        System.out.println("Biryani Non Veg Price = " + price2);


        String name3 = "Fried Rice";
        String type3 = "Veg";

        int price3 = Food.getPriceByFoodItemType(name3, type3);

        System.out.println("Fried Rice Veg Price = " + price3);


        String name4 = "Fried Rice";
        String type4 = "Non Veg";

        int price4 = Food.getPriceByFoodItemType(name4, type4);

        System.out.println("Fried Rice Non Veg Price = " + price4);


        String name5 = "Samosa";
        String type5 = "Veg";

        int price5 = Food.getPriceByFoodItemType(name5, type5);

        System.out.println("Samosa Veg Price = " + price5);


        String name6 = "Samosa";
        String type6 = "Non Veg";

        int price6 = Food.getPriceByFoodItemType(name6, type6);

        System.out.println("Samosa Non Veg Price = " + price6);


        String juiceName1 = "Mango";

        int juicePrice1 = Food.getPriceByJuiceName(juiceName1);

        System.out.println("Mango Juice Price = " + juicePrice1);


        String juiceName2 = "Orange";

        int juicePrice2 = Food.getPriceByJuiceName(juiceName2);

        System.out.println("Orange Juice Price = " + juicePrice2);


        String juiceName3 = "Apple";

        int juicePrice3 = Food.getPriceByJuiceName(juiceName3);

        System.out.println("Apple Juice Price = " + juicePrice3);


        String juiceName4 = "Pineapple";

        int juicePrice4 = Food.getPriceByJuiceName(juiceName4);

        System.out.println("Pineapple Juice Price = " + juicePrice4);


        String juiceName5 = "Watermelon";

        int juicePrice5 = Food.getPriceByJuiceName(juiceName5);

        System.out.println("Watermelon Juice Price = " + juicePrice5);


        double totalBill1 = 5000;

        String sponsor1 = Food.getSponsorNameByTotalBill(totalBill1);

        System.out.println("Sponsor for 5000 = " + sponsor1);


        double totalBill2 = 4000;

        String sponsor2 = Food.getSponsorNameByTotalBill(totalBill2);

        System.out.println("Sponsor for 4000 = " + sponsor2);


        double totalBill3 = 3000;

        String sponsor3 = Food.getSponsorNameByTotalBill(totalBill3);

        System.out.println("Sponsor for 3000 = " + sponsor3);


        double totalBill4 = 2000;

        String sponsor4 = Food.getSponsorNameByTotalBill(totalBill4);

        System.out.println("Sponsor for 2000 = " + sponsor4);


        double totalBill5 = 1000;

        String sponsor5 = Food.getSponsorNameByTotalBill(totalBill5);

        System.out.println("Sponsor for 1000 = " + sponsor5);
    }
}