class CricketPlayerRunner
{
    public static void main(String[] args)
    {
        CricketPlayer[] playerList = new CricketPlayer[10];

        playerList[0] = new CricketPlayer("Rohit Sharma");
        playerList[1] = new CricketPlayer("Virat Kohli");
        playerList[2] = new CricketPlayer("Shubman Gill");
        playerList[3] = new CricketPlayer("Jasprit Bumrah");
        playerList[4] = new CricketPlayer("Hardik Pandya");

        CricketPlayer player1 = new CricketPlayer("KL Rahul");
        CricketPlayer player2 = new CricketPlayer("Rishabh Pant");
        CricketPlayer player3 = new CricketPlayer("Ravindra Jadeja");
        CricketPlayer player4 = new CricketPlayer("Mohammed Siraj");
        CricketPlayer player5 = new CricketPlayer("Kuldeep Yadav");

        playerList[5] = player1;
        playerList[6] = player2;
        playerList[7] = player3;
        playerList[8] = player4;
        playerList[9] = player5;

        System.out.println("Length of cricket player array: " + playerList.length);
    }
}