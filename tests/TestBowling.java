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
	public void testAll(){
		BowlingGame bg= new BowlingGame();
		Frame fr= new Frame(1,4);
		bg.addFrame(fr);
		Frame fr2=new Frame(4,5);
		bg.addFrame(fr2);
		Frame fr3=new Frame(6,4);
		bg.addFrame(fr3);
		Frame fr4=new Frame(5,5);
		bg.addFrame(fr4);
		Frame fr5=new Frame(10,0);
		bg.addFrame(fr5);
		Frame fr6=new Frame(0,1);
		bg.addFrame(fr6);
		Frame fr7=new Frame(7,3);
		bg.addFrame(fr7);
		Frame fr8=new Frame(6,4);
		bg.addFrame(fr8);
		Frame fr9=new Frame(10,0);
		bg.addFrame(fr9);
		Frame fr10=new Frame(2,8);
		bg.addFrame(fr10);
		
		
		bg.setBonus(6, 0);
  
	    assertEquals(133, bg.score());
		
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
