import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before() {
        director = new Director("Rachel", 12457, 150000, "IT", 1000000);
    }

    @Test
    public void hasName() {
        assertEquals("Rachel", director.getName());
    }

    @Test
    public void hasniNumber() {
        assertEquals(12457, director.getNiNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(150000, director.getSalary(), 0.01);
    }

    @Test
    public void hasDeptName() {
        assertEquals("IT", director.getDeptName());
    }

    @Test
    public void canRaiseSalary() {
        director.raiseSalary(50000);
        assertEquals(200000, director.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(1500, director.payBonus(), 0.01);
    }

    @Test
    public void canGetBudget() {
        assertEquals(1000000, director.getBudget(), 0.01);
    }

}
