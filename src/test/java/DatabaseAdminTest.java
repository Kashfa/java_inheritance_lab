import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before() {
        databaseAdmin = new DatabaseAdmin("Alex", 24680, 50000);
    }

    @Test
    public void hasName() {
        assertEquals("Alex", databaseAdmin.getName());
    }

    @Test
    public void hasniNumber() {
        assertEquals(24680, databaseAdmin.getNiNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(50000, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary() {
        databaseAdmin.raiseSalary(5000);
        assertEquals(55000, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(500, databaseAdmin.payBonus(), 0.01);
    }

}
