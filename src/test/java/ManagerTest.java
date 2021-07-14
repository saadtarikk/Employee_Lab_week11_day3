import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
    private Manager manager;

    @Before
    public void before() {
        manager = new Manager("Saad", "SP123021D", 50000, "Development");
    }

    @Test
    public void hasName() {
        assertEquals("Saad", manager.getName());
    }

    @Test
    public void hasNI() {
        assertEquals("SP123021D", manager.getNiNumber());
    }

    @Test
    public void hasDepartment() {
        assertEquals(50000, manager.getSalary());
    }

    @Test
    public void hasDepartmentName() {
        assertEquals("Development", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary() {
        manager.raiseSalary(0.1);
        assertEquals(55000, manager.getSalary());
    }

    @Test
    public void hasPayBonus() {
        assertEquals(5000, manager.payBonus(), 0.0);
    }
}
