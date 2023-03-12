/*
 * Class: CMSC203 
 * Instructor: Grinery Grinberg
 * Description: : In this lab I will  work will be creating a JUnit Test Class for Gradebook.java. 
 * Due: 03/11/2023
 * Platform/compiler: Windows/ eclipse 2022
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Chimaobi Okoro
*/

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest3 {
	private GradeBook g1;
	private GradeBook g2;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		//Creating two new object of GradeBook.
		g1 = new GradeBook(5);
		g2 = new GradeBook(5);
		
		//Adding the score to each object.
		g1.addScore(50);
		g1.addScore(75);
		g2.addScore(80);
		g2.addScore(90);
}
	void tearDown() throws Exception {
		
		//Setting the both object to null.
		g1 = null;
		g2 = null;
	}
 
	@Test
	public void testFinalScore()
	{
  
		//Since there are two scores in both g1 and g2 the finalScore will return sum of all scores - minimum score.
		assertEquals(75.0,g1.finalScore(),0.001);
		assertEquals(90.0,g2.finalScore(),0.001);
	}
	@Test
	public void testAddScore()
	{
		String testString = "75.0, 82.4,99.0,94.2";
		assertTrue(g1.getScoreSize()==2);
		assertTrue(g1.getScoreSize()==2);
		//assertTrue(g2.addScore("50"));
		//assertTrue(toString().assertEquals);
	}
	@Test 
	public  void testToString() {
		assertEquals(g1.toString(),"50 75 ");
		
	}	
	@Test
	public void finalScore()
	{
		assertEquals(75.0,g1.finalScore(),.001);
	}
	
	@Test
	public void testminimum ()
	{
		assertEquals(50.0,g1.minimum());
	}
	
	@Test
	public void sum()
	{
		assertEquals(125.0,g1.sum(),.001);
		
	}

}
