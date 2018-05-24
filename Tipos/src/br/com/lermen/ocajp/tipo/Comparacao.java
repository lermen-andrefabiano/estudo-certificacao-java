package br.com.lermen.ocajp.tipo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Comparacao {
	
	public static void main(String[] args) {
		
		// list / LinkedList adiciona na mesma ordem e deixa repetir melhor performance
		List<Integer> linkedList = new LinkedList<>();
		linkedList.add(10);
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(1);
		linkedList.add(3);
		linkedList.add(1);
		
		System.out.println(linkedList);
		
		// list adiciona na mesma ordem e deixa repetir
		List<Integer> arrayList = new ArrayList<>();
		arrayList.add(10);
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(1);
		arrayList.add(3);
		arrayList.add(1);
		
		System.out.println(arrayList);
		
		// set ordena e nao deixa repetir
		Set<Integer> arraySet = new HashSet<>();
		arraySet.add(1);
		arraySet.add(2);
		arraySet.add(1);
		arraySet.add(3);
		arraySet.add(1);
		arraySet.add(0);
		
		System.out.println(arraySet);
		
		
		
	}

}
