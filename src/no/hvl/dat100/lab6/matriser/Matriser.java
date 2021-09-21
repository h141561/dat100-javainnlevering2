package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		
		for(int[] i : matrise)
		{
			for(int j : i)
			{
				System.out.print((char)j + ' ');
			}
			System.out.print('\n');
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) { 
		
		String ret = "";
		for(int[] i : matrise)
		{
			for(int j : i)
			{
				ret += j;
				ret += ' ';
			}
			ret += '\n';
		}
		return ret;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		int[][] ret  = new int[matrise.length][];
		
		for(int i = 0; i < matrise.length ; i++)
		{
			ret[i] = new int[matrise[i].length];
			for(int j = 0; j < matrise[i].length ; j++)
			{
				ret[i][j] = matrise[i][j] * tall;
			}
			
		}
		return ret;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		for(int i = 0; i < a.length; i++)
		{
			for(int k = 0; k < a[i].length; k++)
			{
				if(a[i][k] != b[i][k])
					return false;
			}
		}
		return true;
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		int[][] ret  = new int[matrise.length][];
		for(int i = 0; i < matrise.length ; i++)
			ret[i] = new int[matrise[i].length];
		
		for(int i = 0; i < matrise.length ; i++)
		{
			for(int j = 0; j < matrise[i].length ; j++)
			{
				ret[j][i] = matrise[i][j];
			}
			
		}
		return ret;
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		int[][] ret  = new int[a.length][];
		
		for(int i = 0; i < a.length ; i++)
			ret[i] = new int[a[i].length];
		
		for(int i = 0; i < ret.length ; i++)
		{
			for(int j = 0; j < ret[i].length ; j++)
			{
				for(int k = 0; k < ret[i].length ; k++)
					ret[i][j] += a[i][k] * b[k][j];
			}
		}
		return ret;
	}
}
