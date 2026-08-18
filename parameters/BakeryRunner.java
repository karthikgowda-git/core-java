class BakeryRunner{



public static void main(String... values)
{
	
	String cakeName="100";
	Bakery.item(cakeName);//argument
	
	String location="BTM";
    int code=560016;
 
     Bakery.location(location,code);
	 
	 
	 String name="Brijesh";
	 String deliveryDate="10/08/2026";
	 double advance=50000;
   
	Bakery.order(name,advance,deliveryDate);
}


}