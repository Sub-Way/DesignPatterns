/* 2013112015 ¿”¡¯º∑ */

package MementoType;

import java.util.ArrayList;
import java.util.Map;

import javax.swing.text.Position;

class Adventurer { 
	private int HP;
	private int MP;
	boolean position;
	Map CurrentMap;
	private ArrayList item;
	
	public void setHP(int hp){
		this.HP=hp;
	}
	public int getHP(){
		return HP;
	}
	
	public void setMP(int mp){
		this.MP=mp;
	}
	public int getMP(){
		return MP;
	}
	
	public void setitems(ArrayList item){
		this.item=item;
	}
	public ArrayList getitems(){
		return item;
	}
	
	public void setmap(Map map){
		this.CurrentMap=map;
	}
	public Map getmap(){
		return CurrentMap;
	}
	
	public void setposition(boolean position){
		this.position=position;
	}
	public boolean getposition(){
		return position;
	}
	
	
	public StateSnapshot CreateSnapshot(){
		StateSnapshot snapshot = null;
		snapshot = new StateSnapshot();
		return snapshot;
	}
	
	public void RestoreSnapshot(StateSnapshot snapshot){
		HP = snapshot.getHP();
		MP = snapshot.getMP();
		item = snapshot.getitems();
		position = snapshot.getposition();
		CurrentMap = snapshot.getmap();
	}
	
}
