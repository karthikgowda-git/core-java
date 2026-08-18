class FancystoreRun{

public static void main(String...values)
{
	String items="hairclip";
	double cost=70;
	int quantity=20;
	String colour="pink";
	
	System.out.println("items:"+items);
	System.out.println("cost:"+cost);
	System.out.println("quantity:"+quantity);
	System.out.println("colour:"+colour);

	
	 Fancystore.store(items,cost,quantity,colour);
	 Fancystore.store(null,110,60,"black");
	 
	 
} 
}