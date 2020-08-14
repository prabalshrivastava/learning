package learning.java8.functional;

import java.util.Arrays;
import java.util.List;

public class ImperativeVSDeclarative {

    public static void main(String[] args) {
        List<String> ingredients = Arrays.asList(
                "flour", "salt", "baking powder", "butter", "eggs", "milk"
        );

        //Imperative Approach - Focuses on how to perform operations - Taking the System it is running on into account
        //If I am In a restaurant and I wanna know if about a possible cupcake for my daughter
        //We dont say - can you tell me every ingredient in this cupcake and dont worry I will tell you when to stop
        boolean hasEggs = false;
        for (String ingredient : ingredients) {
            if ("eggs".equals(ingredient)) {
                hasEggs = true;
                break;
            }
        }
        if (hasEggs) System.out.println("Sorry Sweetheart! It has eggs :(");


        //Declarative Approach - What specifically you are attempting to accomplish More inline with the real world
        //Does this cupcake contains eggs
        if (ingredients.contains("eggs")) System.out.println("Sorry Sweetheart! It has eggs :(");

    }
}
