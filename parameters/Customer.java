class Customer{



      public static void orderFood()
	  {
		  
		  System.out.println("running orderFood from Customer class");
		  
		  String item="Biryani";
		  int cost=200;
		  String type="Non-Veg";
		  
		  FoodItem.menu(item,cost,type);
		  
	  }


}