class DistFinderRunner{
	public static void main(String[] args){
		
		String[] numberOfDistrictsInKarnataka=DistFinder.findDistrictsByStateName("Karnataka");
		System.out.println("The Number of District in Karnataka are:"+numberOfDistrictsInKarnataka.length);
		
		String[] numberOfDistrictsInTripura=DistFinder.findDistrictsByStateName("Tripura");
		System.out.println("The Number of District in Karnataka are:"+numberOfDistrictsInTripura.length);
		
	}
}