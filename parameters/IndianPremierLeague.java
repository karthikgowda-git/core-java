class IndianPremierLeague {

    public static void displayIPL(String season, int year, String champion,String runnerUp, int teams,int totalMatches, String sponsor,String orangeCapWinner,String purpleCapWinner,String venue, String playerOfTournament,boolean completed,double prizeMoney,String hostCountry) {

        System.out.println("Season               : " + season);
        System.out.println("Year                 : " + year);
        System.out.println("Champion             : " + champion);
        System.out.println("Runner Up            : " + runnerUp);
        System.out.println("Teams                : " + teams);
        System.out.println("Total Matches        : " + totalMatches);
        System.out.println("Sponsor              : " + sponsor);
        System.out.println("Orange Cap Winner    : " + orangeCapWinner);
        System.out.println("Purple Cap Winner    : " + purpleCapWinner);
        System.out.println("Venue                : " + venue);
        System.out.println("Player of Tournament : " + playerOfTournament);
        System.out.println("Completed            : " + completed);
        System.out.println("Prize Money          : " + prizeMoney);
        System.out.println("Host Country         : " + hostCountry);
    }

    public static void main(String[] args) {

        displayIPL("IPL 2025", 2025, "Royal Challengers Bengaluru","Punjab Kings", 10, 74,"TATA", "Sai Sudharsan","Prasidh Krishna", "Ahmedabad","Krunal Pandya", true,20.0, "India");

        String season = "IPL 2024";
        int year = 2024;
        String champion = "Kolkata Knight Riders";
        String runnerUp = "Sunrisers Hyderabad";
        int teams = 10;
        int totalMatches = 74;
        String sponsor = "TATA";
        String orangeCapWinner = "Virat Kohli";
        String purpleCapWinner = "Harshal Patel";
        String venue = "Chennai";
        String playerOfTournament = "Sunil Narine";
        boolean completed = true;
        double prizeMoney = 20.0;
        String hostCountry = "India";

        displayIPL(season, year, champion, runnerUp, teams,totalMatches, sponsor, orangeCapWinner,purpleCapWinner, venue, playerOfTournament,completed, prizeMoney, hostCountry);
    }
}