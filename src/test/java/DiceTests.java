import org.example.Dice;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DiceTests {
    @Test
    public  void test1(){
        Dice dice = new Dice(6, "red");
        assertEquals(6, dice.getSides());
        assertEquals("red", dice.getColor());
    }

    @Test
    public  void test2(){
        Dice dice = new Dice(6, "red");
        int[] rolls = dice.rollMany(4);
        assertEquals(4, rolls.length);
    }
}
