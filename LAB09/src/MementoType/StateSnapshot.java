/* 2013112015 ¿”¡¯º∑ */

package MementoType;

import java.util.ArrayList;
import java.util.Map;

import javax.swing.text.Position;

public class StateSnapshot { 
	private int HP;
	private int MP;
	boolean position;
	ArrayList items;
	Map CurrentMap;

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
		this.items=item;
	}
	public ArrayList getitems(){
		return items;
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
} 
