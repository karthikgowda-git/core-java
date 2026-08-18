class DryFruitStoreRunner {

    public static void main(String[] args) {

		String dryfruitname ="Almond";
		double price=850;
		double weight= 1;
		System.out.println("dryfruitname:"+dryfruitname);
		System.out.println("price:"+price);
		System.out.println("weight:"+weight);
        DryFruitStore.store(dryfruitname, price, weight);

        DryFruitStore.store(null, 50, 15);
    }
}