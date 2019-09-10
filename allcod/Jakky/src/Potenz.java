

import java.util.ArrayList;

public class Potenz
{

	public static void PotenzFunktion(int[] Zahlen , int index, ArrayList<Integer> Genommen, ArrayList<ArrayList<Integer>> Ergebnis) {
		if (index == Zahlen.length)
			Ergebnis.add(Genommen);
		else {
			PotenzFunktion(Zahlen, index + 1, Genommen, Ergebnis); 
			ArrayList<Integer> copy = new ArrayList<>(Genommen);
			copy.add(Zahlen[index]);
			PotenzFunktion(Zahlen, index + 1, copy, Ergebnis); 
		}
	}


public static void main(String[] args)
{
	ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
	PotenzFunktion(new int[] { 1, 2, 3, 4, 5 }, 0, new ArrayList<Integer>(), result);
	for (ArrayList<Integer> list : result) {
		System.out.println(list.toString());
	}
	}
}

