package chapter6_5;

import java.util.ArrayList;

/**
 * 배열의 크기는 length, ArrayList의 크기는 size
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
