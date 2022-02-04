import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemo1Test {
    @Test 
    public void powerTest(){
        //2^4 = 16 
        assertEquals(32, SkillDemo1.power(2, 4));
    }
    
}
