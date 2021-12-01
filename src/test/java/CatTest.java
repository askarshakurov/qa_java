import com.example.Cat;
import com.example.Feline;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;


public class CatTest {

    @Before
    public void before() {
        MockitoAnnotations.openMocks(this);
        feline = mock(Feline.class);
    }
    @Mock
    private Feline feline;


    @Test
    public void testGetSoundTest() {
        Cat cat = new Cat(feline);
        String actualSound = cat.getSound();
        String expectedSound = "Мяу";

        assertEquals(actualSound, expectedSound);
    }

    @Test
    public void testGetFoodTest() throws Exception {
        Cat cat = new Cat(feline);
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Говядина", "Курица", "Индейка"));
        List<String> actual = cat.getFood();
        assertEquals(List.of("Говядина", "Курица", "Индейка"), actual);
        }
}
