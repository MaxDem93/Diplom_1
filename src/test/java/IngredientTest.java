import org.junit.Assert;
import org.junit.Test;
import praktikum.Ingredient;
import static org.junit.Assert.*;
import static praktikum.IngredientType.SAUCE;

public class IngredientTest {


    @Test
    public void getPrice() {
        var ingredient = new Ingredient(SAUCE, "Плюшка", 40);
        assertEquals(40, 40, ingredient.getPrice());
    }

    @Test
    public void getName() {
        var ingredient = new Ingredient(SAUCE, "Плюшка", 40);
        assertEquals("Плюшка", ingredient.getName());
    }

    @Test
    public void getType() {
        var ingredient = new Ingredient(SAUCE, "Плюшка", 40);
        assertEquals(SAUCE, ingredient.getType());
    }
}