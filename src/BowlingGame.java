import java.util.ArrayList;
import java.util.List;

//Finish time:16:35
//ID:108

public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>();
	private Frame bonus;
	
	public BowlingGame(){}
	
	// adds a frame to the game
	public void addFrame(Frame frame){
		//to be implemented
		frames.add(frame);
	}
	
	// Sets the bonus throws at the end of the game
	public void setBonus(int firstThrow, int secondThrow) {
		bonus= new Frame(firstThrow,secondThrow);
		//to be implemented
	}
	
	// Returns the game score
	public int score(){
		//to be implemented: should return game score
		int score=0;
		int i=0;
		
	   //ListIterator<Frame> fr = frames.listIterator(i);
			
		for(Frame fr: frames)
		{
			score+=fr.score();
			if (fr.isSpare() )
			{
			    if (i<9)
			    {
			    	Frame nf=frames.get(i+1);
					score+=nf.getFirstThrow();
			    }
			    else 
			    	score+=bonus.getFirstThrow();
			}	
			if(fr.isStrike()){
				if (i<9)
				{
					Frame nf=frames.get(i+1);
					score+=nf.score();
				}
				else
					score+=bonus.score();				
				
			}
				
			i++;
		}
		return score;
	}
}
