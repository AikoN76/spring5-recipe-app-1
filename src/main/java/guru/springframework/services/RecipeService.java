package guru.springframework.services;

import guru.springframework.command.RecipeCommand;
import guru.springframework.domain.Recipe;

import java.util.Optional;
import java.util.Set;

public interface RecipeService {

    Set<RecipeCommand> getRecipes();

    Recipe findById(Long l);

    RecipeCommand findCommandById(Long l);

    RecipeCommand saveRecipeCommand(RecipeCommand command);
}
