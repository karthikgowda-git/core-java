class MobileStore {

    public static void store(String name, String brand, int ram, double storage) {

        System.out.println("Valid mobile store data");

        if (name == null) {
            System.out.println("Name is not valid");
        }

        if (brand == null) {
            System.out.println("Brand is not valid");
        }

        if (ram < 2 || ram > 24) {
            System.out.println("RAM is not valid");
        }

        if (storage < 32 || storage > 1024) {
            System.out.println("Storage is not valid");
        }
    }
}