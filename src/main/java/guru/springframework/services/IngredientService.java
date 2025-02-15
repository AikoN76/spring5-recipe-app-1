package guru.springframework.services;

import guru.springframework.commands.IngredientCommand;

public interface IngredientService {

    IngredientCommand findByRecipeIdAndIngredientId(Long recipeId, Long ingredientId);
    IngredientCommand saveIngredientCommand(IngredientCommand ingredientCommand) throws Exception;
    void deleteByRecipeIdAndId(Long recipeId, Long ingredientId);

}
