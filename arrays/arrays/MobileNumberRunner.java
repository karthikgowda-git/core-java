class MobileNumberRunner
{
    public static void main(String[] args)
    {
        MobileNumber[] mobileList = new MobileNumber[20];

		
        mobileList[0] = new MobileNumber(9988776655L);
        mobileList[1] = new MobileNumber(9988776656L);
        mobileList[2] = new MobileNumber(9988776657L);
        mobileList[3] = new MobileNumber(9988776658L);
        mobileList[4] = new MobileNumber(9988776659L);
        mobileList[5] = new MobileNumber(8877665544L);
        mobileList[6] = new MobileNumber(8877665545L);
        mobileList[7] = new MobileNumber(8877665546L);
        mobileList[8] = new MobileNumber(8877665547L);
        mobileList[9] = new MobileNumber(8877665548L);

		
        MobileNumber phone1 = new MobileNumber(7766554433L);
        MobileNumber phone2 = new MobileNumber(7766554434L);
        MobileNumber phone3 = new MobileNumber(7766554435L);
        MobileNumber phone4 = new MobileNumber(7766554436L);
        MobileNumber phone5 = new MobileNumber(7766554437L);
        MobileNumber phone6 = new MobileNumber(6655443322L);
        MobileNumber phone7 = new MobileNumber(6655443323L);
        MobileNumber phone8 = new MobileNumber(6655443324L);
        MobileNumber phone9 = new MobileNumber(6655443325L);
        MobileNumber phone10 = new MobileNumber(6655443326L);

        mobileList[10] = phone1;
        mobileList[11] = phone2;
        mobileList[12] = phone3;
        mobileList[13] = phone4;
        mobileList[14] = phone5;
        mobileList[15] = phone6;
        mobileList[16] = phone7;
        mobileList[17] = phone8;
        mobileList[18] = phone9;
        mobileList[19] = phone10;

        System.out.println("Length of mobile array: " + mobileList.length);
    }
}