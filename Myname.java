package PatternCode;

public class Myname {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 50; j++) {
				if (i == 0
						&& (j == 0 || j == 1 || j == 2 || j == 3 || j == 4 || j == 7 || j == 8 || j == 9 || j == 10
								|| j == 11 || j == 14 || j == 15 || j == 16 || j == 17 || j == 18 || j == 21 || j == 22
								|| j == 23 || j == 24 || j == 25 || j == 28 || j == 32 || j == 34 || j == 38 || j == 41
								|| j == 45)
						|| i == 1 && (j == 0 || j == 4 || j == 7 || j == 11 || j == 14 || j == 18 || j == 22 || j == 25
								|| j == 28 || j == 32 || j == 34 || j == 35 || j == 38 || j == 42 || j == 44)
						|| i == 2 && (j == 0 || j == 1 || j == 2 || j == 3 || j == 4 || j == 4 || j == 7 || j == 8
								|| j == 9 || j == 10 || j == 11 || j == 14 || j == 15 || j == 16 || j == 17 || j == 18
								|| j == 22 || j == 25 || j == 28 || j == 32 || j == 34 || j == 36 || j == 38 || j == 43)
						|| i == 3 && (j == 0 || j == 7 || j == 9 || j == 14 || j == 18 || j == 22 || j == 25 || j == 28
								|| j == 32 || j == 34 || j == 37 || j == 38 || j == 43)
						|| i == 4 && (j == 0 || j == 7 || j == 11 || j == 14 || j == 18 || j == 21 || j == 22 || j == 23
								|| j == 24 || j == 25 || j == 28 || j == 29 || j == 30 || j == 31 || j == 32 || j == 34
								|| j == 38 || j == 43)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}






//*****  *****  *****  *****  *   * *   *  *   *    
//*   *  *   *  *   *   *  *  *   * **  *   * *     
//*****  *****  *****   *  *  *   * * * *    *      
//*      * *    *   *   *  *  *   * *  **    *      
//*      *   *  *   *  *****  ***** *   *    *      

