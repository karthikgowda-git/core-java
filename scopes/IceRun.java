class IceRun{

public static void main(String ...values){
 String name = "Cornetto";
 String flavour = "Chocolate";
 int cost = 120;
 char size = 'M';
 boolean cone = true;
 boolean cup = false;
 
 System.out.println("name:"+name);
 System.out.println("flavour:"+flavour);
 System.out.println("cost:"+cost);
 System.out.println("size:"+size);
 System.out.println("cone:"+cone);
 System.out.println("cup:"+cup);
 IceCreamStore.save(name,flavour,cost,size,cone,cup);
 IceCreamStore.save(null, null, 10, 'X', false, false);
 IceCreamStore.order("arun","vanaila",100);
 IceCreamStore.order(null,"null",100);
 }
}