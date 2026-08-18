class FaceWash {

    public static void washFace(String brand, double price, String skinType, boolean isFoaming) {
        System.out.println("Brand      : " + brand);
        System.out.println("Price      : " + price);
        System.out.println("Skin Type  : " + skinType);
        System.out.println("Foaming    : " + isFoaming);
    }

    public static void main(String[] args) {

        washFace("Himalaya", 199.0, "Oily", true);

        String brand = "Pond's";
        double price = 249.0;
        String skinType = "Dry";
        boolean isFoaming = false;

        washFace(brand, price, skinType, isFoaming);
    }
}