class ShopRunner{



  public static void main(String... values)
  {
	  //terminolgies
	  Shop.details();//no-arg 
	  
	  String shopName1="Patanjali";
	  
	  Shop.details(shopName1);//argument
	  
	  String shopName2="BakeMyWish";
	  
	  Shop.details(shopName2);//argument
	  
	  String perfumeName="Fog";
	  double money=100;
	  
	  Perfume.info(perfumeName,money);//explict ref
	  
	  
	  Perfume.info("Skin",999);//implicit ref
	  
	  int value=56;
	  System.out.println(value);//implicit ref 
	  
	  
	  
  }

}