package no.hvl.dat100.lab5.tabeller;

public class Tabeller {
	// a)
	public static void skrivUt(int[] tabell) {

		for(int i : tabell)
		{
			System.out.println(i);
		}

	}

	// b)
	public static String tilStreng(int[] tabell) {
		
		String outp = "[";
		for(int i : tabell)
		{
			outp += i;
			outp += ",";
		}
		if(outp.endsWith(","))
				outp = outp.substring(0, outp.length() - 1);
		outp += "]";
		return outp;
	}

	// c)
	public static int summer(int[] tabell) {
		
		int outp = 0;
		for(int i : tabell)
			outp += i;
		return outp;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		for (int i : tabell)
			if(i == tall)
				return true;
		
		return false;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		
		int outp = 0;
		for(int i : tabell)
		{
			
			if( i == tall)
			{
				return outp;
			}
			outp++;
		}
		return -1;
	}

	// f)
	public static int[] reverser(int[] tabell) {

		int[] reversert = new int[tabell.length];
		int counter = tabell.length - 1;
		for(int i : tabell)
		{
			reversert[counter--] = i;
		}
		return reversert;
	}

	// g)
	public static boolean erSortert(int[] tabell) {
		
		if(tabell.length == 0)
			return true;
		
		int siste = tabell[0];
		
		for(int i : tabell)
			if(i < siste)
				return false;
			else
				siste = i;
		return true;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		int[] outp = new int[tabell1.length + tabell2.length];
		int counter = 0;
		for(int i : tabell1)
		{
			outp[counter++] = i;
		}
		
		for(int i : tabell2)
		{
			outp[counter++] = i;
		}
		return outp;
	}
}
