class BankAccountRunner
{
    public static void main(String[] args)
    {
        BankAccount[] accountList = new BankAccount[5];

        accountList[0] = new BankAccount(98765432101L);
        accountList[1] = new BankAccount(98765432102L);

        BankAccount account1 = new BankAccount(98765432103L);
        BankAccount account2 = new BankAccount(98765432104L);
        BankAccount account3 = new BankAccount(98765432105L);

        accountList[2] = account1;
        accountList[3] = account2;
        accountList[4] = account3;

        System.out.println("Length of bank account array: " + accountList.length);
    }
}