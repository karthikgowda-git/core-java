class FlowerStore {

    public static void store(String flowerName, String fragrance, boolean fresh, String occasion, String origin) {

        System.out.println("Valid flower store data");

        if (flowerName == null) {
            System.out.println("Flower name is not valid");
        }

        if (fragrance == null) {
            System.out.println("Fragrance is not valid");
        }

        if (fresh == false) {
            System.out.println("Flower is not fresh");
        }

        if (occasion == null) {
            System.out.println("Occasion is not valid");
        }

        if (origin == null) {
            System.out.println("Origin is not valid");
        }
    }
}