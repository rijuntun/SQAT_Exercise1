import static org.junit.Assert.*;

import org.junit.Test;

public class TestBowling {
	
	@Test
	public void testAddFrame(){
		BowlingGame bg= new BowlingGame();
		Frame fr= new Frame(1,4);
		bg.addFrame(fr);
		assertEquals(5, bg.score());
		
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}