import org.junit.Before;
import org.junit.Test;
import staff.management.Director;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class DirectorTest {
    private Director director;

    @Before
    public void before() {
        director = new Director("Saad", "SP123021D", 50000, 100000);
    }

    @Test
    public void hasName() {
        assertEquals("Saad", director.getName());
    }

    @Test
    public void hasNI() {
        assertEquals("SP123021D", director.getNiNumber());
    }

    @Test
    public void hasDepartment() {
        assertEquals(50000, director.getSalary());
    }

    @Test
    public void hasBudget(){
        assertEquals(100000, director.getBudget(), 0.0);
    }

    @Test
    public void canRaiseSalary() {
        director.raiseSalary(0.02);
        assertEquals(51000, director.getSalary());
    }

    @Test
    public void hasPayBonus() {
        assertEquals(5000, director.payBonus(), 0.0);
    }
}
