class Bakery{


    public static void item(String cake)
	{
		
		System.out.println("running item of Bakery");
		
		System.out.println("arg 1 :"+cake);
		
	}
	
	
	public static void location(String area,int pincode)
	{
		System.out.println("running location of Bakery");
		System.out.println("Area: "+area);
		System.out.println("Pincode :"+pincode);
		
	}
	
	
	public static void order(String cusomerName,double advance,String deliveryDate)
	{
		 System.out.println("running order from Bakery Class");
		 System.out.println("Customer Name :"+cusomerName);
		 System.out.println("Advance :"+advance);
		 System.out.println("Delivery Date :"+deliveryDate);
		 
		
	}
	

}