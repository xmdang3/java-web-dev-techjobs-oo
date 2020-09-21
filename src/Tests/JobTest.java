package Tests;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;


public class JobTest {
    private static Job job1;
    private static Job job2;
    private static Job givenJob;
    private static Job givenJobCopy;
    private static Job emptyJob;

    //initialize job1 and job2 before running any tests
    @BeforeClass
    public static void createJob() {
        job1 = new Job();
        job2 = new Job();
        givenJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        givenJobCopy = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        emptyJob = new Job ("", new Employer(""), new Location (""), new PositionType(""), new CoreCompetency(""));
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
        //assertEquals(emptyJob.getId(), 5);
        //System.out.println(givenJob.getId());
    }

    //test setting and getting of fields
    @Test
    public void testJobConstructorSetsAllFields() {
        assertTrue(givenJob.getName() instanceof String);

        assertTrue(givenJob.getEmployer() instanceof Employer);

        assertTrue(givenJob.getLocation() instanceof Location);

        assertTrue(givenJob.getPositionType() instanceof PositionType);

        assertTrue(givenJob.getCoreCompetency() instanceof CoreCompetency);

    }

    @Test
    public void testJobsForEquality() {
        assertFalse(givenJob.equals(givenJobCopy));
    }

    @Test
    public void testToStringMethod() {
        assertEquals(givenJob.toString(), "\nID: 3\nName: Product tester\nEmployer: ACME\nLocation: Desert\nPosition Type: Quality control\nCore Competency: Persistence\n");
    }

    @Test
    public void testEmptyJobToStringMethod() {
        assertEquals(emptyJob.toString(), "\nID: 5\nName: Data not available.\nEmployer: Data not available.\nLocation: Data not available.\nPosition Type: Data not available.\nCore Competency: Data not available.\n");
    }







}
