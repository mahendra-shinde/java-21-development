package demo10;

import java.util.LinkedList;
import java.util.List;

public class DataManager<T>{
	private List<T> data = new LinkedList<>();
	
	public void save(T record) {
		data.add(record);
	}
	
	public void printAll() {
		for(T obj: data) {
			System.out.println(obj);
		}
	}
}