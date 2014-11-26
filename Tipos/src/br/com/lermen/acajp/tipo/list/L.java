package br.com.lermen.acajp.tipo.list;

import java.util.ArrayList;
import java.util.List;
import java.util.NavigableSet;
import java.util.TreeSet;

class L {

	public static void main(String[] args) {
		List<Integer> lst = new ArrayList<>();
		lst.add(34);
		lst.add(6);
		lst.add(2);
		lst.add(0);
		lst.add(8);
		lst.add(7);
		lst.add(10);

		NavigableSet<Integer> nvset = new TreeSet<>(lst);
		System.out.println(nvset.lower(6) + " " + nvset.higher(10) + " "
				+ nvset.lower(2));
	}

}
