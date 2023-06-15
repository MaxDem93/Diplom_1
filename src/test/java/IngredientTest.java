import org.junit.Test;
import praktikum.Ingredient;

import static org.junit.Assert.assertEquals;
import static praktikum.IngredientType.SAUCE;

public class IngredientTest {
    int price = 40;

    @Test
    public void getPrice() {
        int actual = 40;
        int expected = 40;
        var ingredient = new Ingredient(SAUCE, "Плюшка", price);
        assertEquals(expected, actual, ingredient.getPrice());
    }

    @Test
    public void getName() {
        var ingredient = new Ingredient(SAUCE, "Плюшка", price);
        assertEquals("Плюшка", ingredient.getName());
    }

    @Test
    public void getType() {
        var ingredient = new Ingredient(SAUCE, "Плюшка", price);
        assertEquals(SAUCE, ingredient.getType());
    }
}