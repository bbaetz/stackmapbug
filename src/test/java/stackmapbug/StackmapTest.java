package stackmapbug;

import org.junit.Rule;
import org.junit.Test;
import org.powermock.modules.junit4.rule.PowerMockRule;

public class StackmapTest {
    @Rule
    public PowerMockRule rule = new PowerMockRule();

    @Test
    public void testStackmapBug() {
        new breaksStuff();
    }

    private class breaksStuff {
        public void breaks() {
            if (getClass() != getClass()) {

            }
        }
    }
}
