class Kaldaku {

    public static void kaldaku(String vastu, String yavaga) {

        System.out.println("Item   : " + vastu);
        System.out.println("When   : " + yavaga);

        Mobile.mobile("Samsung", "Galaxy S24", 79999.0, true);
    }

    public static void main(String[] args) {

        kaldaku("Mobile", "Today");
    }
}