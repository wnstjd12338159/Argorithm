
package sweaD2;

import java.util.Scanner;
import java.io.FileInputStream;
public class swea_1940 {

	public static void main(String[] args) {
		
		// [?] 가랏! RC카!  //  개더러운 문제 다신 풀고싶지않음
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		int N, nowSpeed, distance;
		for (int t = 1; t <= T; t++) {
			nowSpeed = 0;  distance = 0;
			N = sc.nextInt();
			for (int i = 0; i < N; i++) {
				switch (sc.nextInt()) {
				case 1:
					nowSpeed += sc.nextInt();
					break;
				case 2:
					nowSpeed -= sc.nextInt();
					if (nowSpeed < 0)
						nowSpeed = 0;
					break;
				}
				distance += nowSpeed;
			}

			System.out.printf("#%d %d\n", t, distance);
		}
	}
}


