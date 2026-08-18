class EmailRunner
{
    public static void main(String[] args)
    {
        Email[] emailList = new Email[10];

		
        emailList[0] = new Email("karthika@gmail.com");
        emailList[1] = new Email("javaworld@gmail.com");
        emailList[2] = new Email("coding@gmail.com");
        emailList[3] = new Email("developer@gmail.com");
        emailList[4] = new Email("training@gmail.com");

		
        Email mail1 = new Email("xworkz@gmail.com");
        Email mail2 = new Email("student@gmail.com");
        Email mail3 = new Email("software@gmail.com");
        Email mail4 = new Email("learning@gmail.com");
        Email mail5 = new Email("practice@gmail.com");

        emailList[5] = mail1;
        emailList[6] = mail2;
        emailList[7] = mail3;
        emailList[8] = mail4;
        emailList[9] = mail5;

        System.out.println("Number of emails: " + emailList.length);
    }
}