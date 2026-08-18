class ComputerStore{


//"" or null, size : L,M,S
    public static void storeComputer(String brand,double cost,int storageCapacity,char size)
	{
		System.out.println("running storeComputer from ComputerStore");		
		if(brand==null)
		{
			System.out.println("Brand is not valid");
		}
		if(cost <5000 || cost > 200000){
			
			System.out.println("Cost is not valid");
		}
		if(storageCapacity<128 || storageCapacity > 512 ){
			System.out.println("storageCapacity is invalid");
		}
		if(size !='L' && size !='M' && size !='S'){
			System.out.println("size is invalid");
		}
	}


}