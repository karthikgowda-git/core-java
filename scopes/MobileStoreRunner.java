class MobileStoreRunner {

    public static void main(String[] args) {
		String name="Galaxy S25";
		String brand="samsung";
		int ram=12;
		double storage=256;
        System.out.println("name:"+name);
		System.out.println("brand:"+brand);
		System.out.println("ram:"+ram);
		System.out.println("storage:"+storage);
        MobileStore.store(name,brand,ram,storage);

        MobileStore.store(null, null, 1, 16);
    }
}