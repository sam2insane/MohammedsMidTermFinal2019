package math.problems;

public class PrimeNumber {

	public static void main(String[] args) {
		/*
		 * Find list of Prime numbers from number 2 to 1 million.
		 * Try the best solution as possible.Which will take less CPU life cycle.
		 * Out put number of Prime numbers on the given range.
		 *
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */
		String primeNum = " ";
		for(int x =2; x<=10000; x++){   //doing with 10000, to get less CPU life cycle
			int count = 0;
			for (int num = x; num>=1;num--){
				if(x%num == 0){
					count = count+1;
				}
			}
			if (count ==2){
				primeNum = primeNum+ x +" ";

			}


		}

		System.out.println("prime number for 2 to 10 thousands are : ");
		System.out.println(primeNum);








	}

}
