package test.test01;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class AssessmentTest {
  
  private Assessment myAssessment;

  @Before
    public void setUp() throws Exception {
    myAssessment = new Assessment();
  }

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetGrade() {
		int input = 100;
		String expectedOutput = "A";
		
		String actualOutput = myAssessment.getGrade(input);
		Assert.assertEquals(expectedOutput, actualOutput);
	}
	
	@Test
	public void testGetGrade2() {
		int input = 80;
		String expectedOutput = "B";
		
		String actualOutput = myAssessment.getGrade(input);
		Assert.assertEquals(expectedOutput, actualOutput);
	}
	
	@Test
	public void testGetGrade3() {
		int input = 60;
		String expectedOutput = "D";
		
		String actualOutput = myAssessment.getGrade(input);
		Assert.assertEquals(expectedOutput, actualOutput);
	}

}
