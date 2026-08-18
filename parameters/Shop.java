class Shop{


       //no-arg or zero arg
       public static void details()
	   {
	        System.out.println("running details in Shop");
			//hard coded
			String name="Coffee Day";
			
			System.out.println("name "+name);
	   
	   }
         
   //string arg 
	public static void details(String name)//param
	{
		System.out.println("running details with name param");
		System.out.println("Name :"+name);
	}	
		 
}