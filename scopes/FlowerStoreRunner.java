class FlowerStoreRunner {

    public static void main(String[] args) {

        String flowername="rose";
	    String frangence="sweet";
		boolean fresh=true;
		String occasion="wedding";
	    String origin="Bengaluru";
		System.out.println("flowername:"+flowername);
		System.out.println("frangence:"+frangence);
		System.out.println("fresh:"+fresh);
		System.out.println("occasion:"+occasion);
		System.out.println("origin:"+origin);
        FlowerStore.store(flowername,frangence,fresh,occasion,origin);

        FlowerStore.store(null, null, false, null, null);
    }
}