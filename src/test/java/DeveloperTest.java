import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {
    private Developer developer;

    @Before
    public void before(){
        developer = new Developer("John", "Sp1231D2", 30000);
    }

    @Test
    public void hasName() {
        assertEquals("John", developer.getName());
    }

    @Test
    public void hasNI() {
        assertEquals("Sp1231D2", developer.getNiNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(30000, developer.getSalary());
    }

    @Test
    public void canRaiseSalary() {
        developer.raiseSalary(0.1);
        assertEquals(33000, developer.getSalary());
    }

    @Test
    public void hasPayBonus() {
        assertEquals(3000, developer.payBonus(), 0.0);
    }

    @Test
    public void canChangeName() {
        developer.setName("saad");
        assertEquals("saad", developer.getName());
    }
}
