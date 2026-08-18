class CountryRunner {

    public static void main(String[] args) {

        String capital = Country.getCapitalCity("India");
        System.out.println("Capital City: " + capital);

        String code = Country.getCountryCode("India");
        System.out.println("Country Code: " + code);

        long population = Country.getPopulation("India");
        System.out.println("Population: " + population);
    }
}