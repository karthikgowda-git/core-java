class BallariMovieTheaterFinderRunner{
	public static void main(String[] args){
		
		String[] theatersOfKantara2=BallariMovieTheaterFinder.findTheaterByMovie("Kantara 2");
		System.out.println("The length of the array is:"+theatersOfKantara2.length);

		String[] theatersOfThudarum=BallariMovieTheaterFinder.findTheaterByMovie("Thudarum");
		System.out.println("The length of the array is:"+theatersOfThudarum.length);

		String[] theatersOfTouristFamily=BallariMovieTheaterFinder.findTheaterByMovie("Tourist Family");
		System.out.println("The length of the array is:"+theatersOfTouristFamily.length);

		String[] theatersOfRetro=BallariMovieTheaterFinder.findTheaterByMovie("Retro");
		System.out.println("The length of the array is:"+theatersOfRetro.length);
	}
}