import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before() {
        manager = new Manager("Kashfa", 12345, 100000, "IT");
    }

    @Test
    public void hasName() {
        assertEquals("Kashfa", manager.getName());
    }

    @Test
    public void hasniNumber() {
        assertEquals(12345, manager.getNiNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(100000, manager.getSalary(), 0.01);
    }

    @Test
    public void hasDeptName() {
        assertEquals("IT", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary() {
        manager.raiseSalary(10000);
        assertEquals(110000, manager.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(1000, manager.payBonus(), 0.01);
    }

}
