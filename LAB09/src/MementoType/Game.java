/* 2013112015 ÀÓÁø¼· */

package MementoType;

import java.util.ArrayList;
import java.util.List;

public class Game {
	
	private List<StateSnapshot> snapshot = new ArrayList<StateSnapshot>();
	
	public void Play(){
		Adventurer adventurer = new Adventurer();
		
		while(true){
			
			if(adventurer.getposition() == true){
				snapshot.add(adventurer.CreateSnapshot());
			}
			
			if(adventurer.getHP() <= 0){
				int a = snapshot.lastIndexOf(snapshot);
				adventurer.RestoreSnapshot(snapshot.get(snapshot.size() - 1));
			}
		}
	}
	
}