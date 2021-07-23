package desafioRecursividade;

public class Recursividade {

	public static void main(String[] args) {
		System.out.println(calcula(2, 4));

	}

	public static int calcula(int n, int expo) {

		if (expo == 0) 
			return 1;
		 else {
			int aux = calcula(n, expo/2);
			if (expo % 2 == 0)
				return aux * aux;
			else
				return aux * aux * n;

		}

	}

}
