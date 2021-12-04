import com.example.Feline;
import org.junit.Test;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest {
    @Test
    public void callFunctionEatMeatShouldReturnListOfFoodOfHunter() throws Exception {
        Feline feline = new Feline();
        List<String> actualList = feline.eatMeat();
        List<String> expectedList = List.of("Животные", "Птицы", "Рыба");

        assertEquals(actualList, expectedList);
    }

    @Test
    public void callGetFamilyShouldReturnCattyTypeString() {
        Feline feline = new Feline();
        String actualStr = feline.getFamily();
        String expectedStr = "Кошачьи";

        assertEquals(actualStr, expectedStr);
    }

    @Test
    public void callGetKittensReturnsValueOne() {
        Feline feline = new Feline();
        Integer actualNumber = feline.getKittens();
        Integer expectedNumber = 1;

        assertEquals(actualNumber, expectedNumber);

    }
}
