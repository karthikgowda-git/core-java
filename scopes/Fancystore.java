class Fancystore{
		
	public static void store(String items,double cost,int quantity,String colour){
		
		System.out.println("Vaild fancy store data");
		if(items==null){
		System.out.println("items is not vaild");	
		}
		if (cost<10||cost>100){
			System.out.println("cost is not vaild");
		}
		if(quantity<0 || quantity>50){
			System.out.println("quantity is invaild");
		}
		if(!colour.equalsIgnoreCase("Pink") && !colour.equalsIgnoreCase("Blue")){
			System.out.println("colour is mismatch");
		}
	}
		}