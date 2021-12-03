import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelineParameterizedTest {
    private final Integer number;
    private final Integer expected;

    public FelineParameterizedTest(Integer number, Integer expected) {
        this.number = number;
        this.expected = expected;
    }
    @Parameterized.Parameters
    public static Object[][] getKittensCountData(){
        return new Object[][] {
                {2,2},
                {200,200},
                {5000,5000},
        };
    }

    @Test
    public void callCheckGetKittensWithThreeParameters() {
        Feline feline = new Feline();
        Integer actual = feline.getKittens(number);
        assertEquals(expected, actual);
    }
}
