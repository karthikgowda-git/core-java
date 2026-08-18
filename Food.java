class Food{
    public static int getPriceByFoodItemType(String name, String type)
    {
        System.out.println("Food Price");

        String foodname1 = "Biryani";
        String foodtype1 = "Veg";
        int price1 = 150;

        String foodname2 = "Biryani";
        String foodtype2 = "Non Veg";
        int price2 = 200;

        String foodname3 = "Fried Rice";
        String foodtype3 = "Veg";
        int price3 = 20;

        String foodname4 = "Fried Rice";
        String foodtype4 = "Non Veg";
        int price4 = 150;

        String foodname5 = "Samosa";
        String foodtype5 = "Veg";
        int price5 = 20;

        String foodname6 = "Samosa";
        String foodtype6 = "Non Veg";
        int price6 = 40;

        if(foodname1 == name)
        {
            if(foodtype1 == type)
            {
                return price1;
            }
        }

        if(foodname2 == name)
        {
            if(foodtype2 == type)
            {
                return price2;
            }
        }

        if(foodname3 == name)
        {
            if(foodtype3 == type)
            {
                return price3;
            }
        }

        if(foodname4 == name)
        {
            if(foodtype4 == type)
            {
                return price4;
            }
        }

        if(foodname5 == name)
        {
            if(foodtype5 == type)
            {
                return price5;
            }
        }

        if(foodname6 == name)
        {
            if(foodtype6 == type)
            {
                return price6;
            }
        }

        return 0;
    }


    public static int getPriceByJuiceName(String name)
    {
        System.out.println("Juice Price");

        String juicename1 = "Mango";
        int price1 = 50;

        String juicename2 = "Orange";
        int price2 = 40;

        String juicename3 = "Apple";
        int price3 = 60;

        String juicename4 = "Pineapple";
        int price4 = 50;

        String juicename5 = "Watermelon";
        int price5 = 30;

        if(juicename1 == name)
        {
            return price1;
        }

        if(juicename2 == name)
        {
            return price2;
        }

        if(juicename3 == name)
        {
            return price3;
        }

        if(juicename4 == name)
        {
            return price4;
        }

        if(juicename5 == name)
        {
            return price5;
        }

        return 0;
    }


    public static String getSponsorNameByTotalBill(double totalBill)
    {
        System.out.println("Sponsor Name");

        String sponsor1 = "TCS";
        double bill1 = 5000;

        String sponsor2 = "Infosys";
        double bill2 = 4000;

        String sponsor3 = "Wipro";
        double bill3 = 3000;

        String sponsor4 = "Accenture";
        double bill4 = 2000;

        String sponsor5 = "Microsoft";
        double bill5 = 1000;

        if(totalBill == bill1)
        {
            return sponsor1;
        }

        if(totalBill == bill2)
        {
            return sponsor2;
        }

        if(totalBill == bill3)
        {
            return sponsor3;
        }

        if(totalBill == bill4)
        {
            return sponsor4;
        }

        if(totalBill == bill5)
        {
            return sponsor5;
        }

        return "No Sponsor";
    }
}