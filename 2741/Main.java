/* 
 * Author: Kim Min-Ho (ISKU)
 * Date: 2016.07.19
 * email: minho1a@hanmail.net
 * 
 * https://github.com/ISKU/Algorithm
 * https://www.acmicpc.net/problem/2741
 */

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		for (int limit = input.nextInt(), naturalNumber = 1; naturalNumber <= limit; naturalNumber++)
			System.out.println(naturalNumber);
	}
}