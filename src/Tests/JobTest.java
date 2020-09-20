package Tests;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;


public class JobTest {
    Job job1;
    Job job2;

    //initialize job1 and job2 before running any tests
    @Before
    public void createJob() {
        job1 = new Job();
        job2 = new Job();
    }

    //empty test
    @Test
    public void emptyTest() {
        assertEquals(10,10,.001);
    }

    //test setting and getting id of two different jobs
    @Test
    public void testSettingJobId() {
        assertTrue(job1.getId()!= job2.getId());
        assertEquals(job1.getId(), job2.getId(),1);
    }

    //test setting and getting of fields
    @Test
    public void testJobConstructorSetsAllFields() {
        Job job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertTrue(job3.getName() instanceof String);
        assertTrue(job3.getEmployer() instanceof Employer);
        assertTrue(job3.getLocation() instanceof Location);
        assertTrue(job3.getPositionType() instanceof PositionType);
        assertTrue(job3.getCoreCompetency() instanceof CoreCompetency);
    }

    @Test
    public void testJobsForEquality() {
        Job job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertFalse(job3.equals(job4));
    }



}
