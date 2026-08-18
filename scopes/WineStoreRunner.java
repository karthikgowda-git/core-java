class WineStoreRunner {

    public static void main(String[] args) {

	String winename="red wine";
	double price=1500;
	int volume=750;
	System.out.println("winename:"+winename);
	System.out.println("price:"+price);
	System.out.println("volume:"+volume);
        
        WineStore.store(swinename,price,volume);

        WineStore.store(null, 100, 50);
    }
}