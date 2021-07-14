import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DataBaseAdmin;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DataBaseAdminTest {
    private DataBaseAdmin dataBaseAdmin;

    @Before
    public void before(){
        dataBaseAdmin = new DataBaseAdmin("John", "Sp1231D2", 30000);
    }

    @Test
    public void hasName() {
        assertEquals("John", dataBaseAdmin.getName());
    }

    @Test
    public void hasNI() {
        assertEquals("Sp1231D2", dataBaseAdmin.getNiNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(30000, dataBaseAdmin.getSalary());
    }

    @Test
    public void canRaiseSalary() {
        dataBaseAdmin.raiseSalary(0.1);
        assertEquals(33000, dataBaseAdmin.getSalary());
    }

    @Test
    public void hasPayBonus() {
        assertEquals(3000, dataBaseAdmin.payBonus(), 0.0);
    }
}
