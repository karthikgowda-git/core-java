class CricketCaptainRunneer{
	public static void main(String[] args){
		
		String[] captainAndViceCaptainOfIndia=CricketCaptain.getCaptainAndViceCaptain("India");
		System.out.println("The length of the array is:"+captainAndViceCaptainOfIndia.length);
		
		String[] captainAndViceCaptainOfAustrelia=CricketCaptain.getCaptainAndViceCaptain("Austrelia");
		System.out.println("The length of the array is:"+captainAndViceCaptainOfAustrelia.length);
	}
}