class Lion {

    public static void displayLion(String name, int age, String gender,double weight, String color,String habitat, boolean isWild,double height, String country) {

        System.out.println("Name      : " + name);
        System.out.println("Age       : " + age);
        System.out.println("Gender    : " + gender);
        System.out.println("Weight    : " + weight);
        System.out.println("Color     : " + color);
        System.out.println("Habitat   : " + habitat);
        System.out.println("Wild      : " + isWild);
        System.out.println("Height    : " + height);
        System.out.println("Country   : " + country);
    }

    public static void main(String[] args) {

        displayLion("Simba", 8, "Male", 190.5, "Golden","Forest", true, 1.2, "India");

        String name = "Leo";
        int age = 6;
        String gender = "Male";
        double weight = 180.0;
        String color = "Brown";
        String habitat = "Grassland";
        boolean isWild = true;
        double height = 1.1;
        String country = "South Africa";

        displayLion(name, age, gender, weight, color,habitat, isWild, height, country);
    }
}