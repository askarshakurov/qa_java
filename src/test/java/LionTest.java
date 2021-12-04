import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;


public class LionTest {

    @Before
    public void before() {
        MockitoAnnotations.openMocks(this);
        feline = mock(Feline.class);
    }

    @Mock
    private Feline feline;

    @Test
    public void callFunctionHasManeWithSexMaleShouldBeTrue() throws Exception {
        Lion lion = new Lion("Самец", feline);
        boolean actualHasMane = lion.doesHaveMane();
        boolean expectedHasMane = true;

        assertEquals(actualHasMane, expectedHasMane);
    }
    @Test
    public void callFunctionHasManeWithWrongTypeShouldGetException()  {
        try {
            Lion lion = new Lion("Сам", feline);
            lion.doesHaveMane();
        }catch (Exception e) {
            assertEquals("Используйте допустимые значения пола животного - самей или самка", e.getMessage());
        }
    }

    @Test
    public void callFunctionHasManeWithSexFemaleShouldBeFalse() throws Exception {
        Lion lion = new Lion("Самка", feline);
        boolean actualHasMane = lion.doesHaveMane();
        boolean expectedHasMane = false;

        assertEquals(actualHasMane, expectedHasMane);
    }

    @Test
    public void callFunctionGetFoodShouldReturnListOfFoodOfHunterType() throws  Exception {
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Говядина", "Курица", "Индейка"));
        List<String> actualList = lion.getFood();

        Assert.assertEquals(List.of("Говядина", "Курица", "Индейка"), actualList);
    }

    @Test
    public void callGetKittensShouldReturnValueOne() throws Exception {
        Lion lion = new Lion("Самка", feline);
        Mockito.when(feline.getKittens()).thenReturn(1);
        Integer actualNumber = lion.getKittens();
        Integer expectedNumber = 1;

        assertEquals(actualNumber, expectedNumber);
    }
}

