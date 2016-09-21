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
	public void testAdd2Frames(){
		BowlingGame bg= new BowlingGame();
		Frame fr= new Frame(1,4);
		bg.addFrame(fr);
		Frame fr2=new Frame(4,5);
		bg.addFrame(fr2);
		assertEquals(14, bg.score());
		
	}
	
	@Test 
	public void testAddSpare(){
		BowlingGame bg= new BowlingGame();
		Frame fr= new Frame(1,4);
		bg.addFrame(fr);
		Frame fr2=new Frame(4,5);
		bg.addFrame(fr2);
		Frame fr3=new Frame(6,4);
		bg.addFrame(fr3);
		assertEquals(14, bg.score());
		
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
