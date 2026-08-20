class FoodIngredientItemRunner {

    public static void main(String[] args) {

        String[] numberOfIngredientsToMakeBiriyani =FoodIngredientItem.findIngredientsItemByFood("Biriyani");
        System.out.println("The Number of Ingredients are: "+ numberOfIngredientsToMakeBiriyani.length);

        String[] numberOfIngredientsToMakeJamoon =FoodIngredientItem.findIngredientsItemByFood("Jamoon");
        System.out.println("The Number of Ingredients are: "+ numberOfIngredientsToMakeJamoon.length);

        String[] numberOfIngredientsToMakeGobi =FoodIngredientItem.findIngredientsItemByFood("Gobi");
        System.out.println("The Number of Ingredients are: "+ numberOfIngredientsToMakeGobi.length);

        String[] numberOfIngredientsToMakeFriedRice =FoodIngredientItem.findIngredientsItemByFood("Fried Rice");
        System.out.println("The Number of Ingredients are: "+ numberOfIngredientsToMakeFriedRice.length);
    }
}