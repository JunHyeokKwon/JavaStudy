package chapter6_5;

import java.util.ArrayList;

/**
 * �迭�� ũ��� length, ArrayList�� ũ��� size
 *
 */
public class Shelf {
	public ArrayList<String> shelf;
	
	
	public Shelf() {
		shelf = new ArrayList<String>();
	}
	
	public ArrayList<String> getShelf(){
		return shelf;
	}
	
	public int getCount() {
		return shelf.size();
	}
}
