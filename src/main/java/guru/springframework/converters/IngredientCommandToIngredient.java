package guru.springframework.converters;

import guru.springframework.command.IngredientCommand;
import guru.springframework.domain.Ingredient;
import guru.springframework.domain.Recipe;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class IngredientCommandToIngredient implements Converter<IngredientCommand, Ingredient> {

    private UnitOfMeasureCommandToUnitOfMeasure converter;

    public IngredientCommandToIngredient(UnitOfMeasureCommandToUnitOfMeasure converter){
        this.converter = converter;
    }

    @Nullable
    @Synchronized
    @Override
    public Ingredient convert(IngredientCommand ingredientCommand) {
        if(ingredientCommand == null){
            return null;
        }
        Ingredient ingredient = new Ingredient();
        ingredient.setAmount(ingredientCommand.getAmount());
        ingredient.setDescription(ingredientCommand.getDescription());
        ingredient.setId(ingredientCommand.getId());
        Recipe recipe = new Recipe();
        recipe.setId(ingredientCommand.getRecipeId());
        ingredient.setRecipe(recipe);
        ingredient.setUom(converter.convert(ingredientCommand.getUom()));
        return ingredient;
    }
}
