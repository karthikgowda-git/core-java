class Logo {

    public static void displayLogo(String companyName, String color, String shape, int yearEstablished, boolean isRegistered) {

        System.out.println("Company Name   : " + companyName);
        System.out.println("Color          : " + color);
        System.out.println("Shape          : " + shape);
        System.out.println("Year Founded   : " + yearEstablished);
        System.out.println("Registered     : " + isRegistered);
    }

    public static void main(String[] args) {

        displayLogo("OpenAI", "Black", "Circle", 2015, true);

        String companyName = "Xworkz";
        String color = "Blue";
        String shape = "Rectangle";
        int yearEstablished = 2018;
        boolean isRegistered = true;

        displayLogo(companyName, color, shape, yearEstablished, isRegistered);
    }
}