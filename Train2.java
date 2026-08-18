class Train2{
		
	// access-specifier non-AS returntype name(para's)throws ClassName
	//class name 
	public static void horn()
	{
		System.out.println("running horn in Train");
		//speed();error
	}
	
	// refe
	public  void speed()
	{
		System.out.println("running speed in Train");
		horn();
		turnOnLight();
	}
	
	public void turnOnLight()
	{
		speed();
		
		String destination="Goa";
	}
	
}