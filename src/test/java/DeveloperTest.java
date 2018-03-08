import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before() {
        developer = new Developer("Bert", 67890, 75000);
    }

    @Test
    public void hasName() {
        assertEquals("Bert", developer.getName());
    }

    @Test
    public void hasniNumber() {
        assertEquals(67890, developer.getNiNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(75000, developer.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary() {
        developer.raiseSalary(5000);
        assertEquals(80000, developer.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(750, developer.payBonus(), 0.01);
    }

}
