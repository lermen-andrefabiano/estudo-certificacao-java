package br.com.lermen.acajp.tipo.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayMain {
	
	static List<String> list = new ArrayList<String>();

	public static void main(String[] args) {
		
		list();
		
		mostra();
		
		putList(0, "index zero");
		
		mostra();
		
		setList(1, "andre");
		
		mostra();
	}
	
	private static void putList(int index, String element){
		list.add(index, element);
	}

	private static void setList(int index, String element){
		list.set(index, element);
	}
	
	private static void list() {		
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");		
	}
	
	private static void mostra(){
		for(String s : list){
			System.out.println(s);
		}
		
		Iterator<String> in = list.iterator();
		
		System.out.println("while");
		while(in.hasNext()){
			System.out.println(in.next());
		}		
			
	}
}
