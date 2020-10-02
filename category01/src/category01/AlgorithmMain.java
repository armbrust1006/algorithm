package category01;

import java.util.Scanner;

public class AlgorithmMain {

	/**
	 * 牛が選択したケージ番号取得
	 * @param sc
	 * @param N 
	 * @return
	 */
	public static String[][] getCowChoiceRooms(Scanner sc, int N) {
		String[][] result = new String[N][];
		for (int i = 0; i < N; i++) {
			String[] input = sc.nextLine().split("\\s");
			result[i] = input;
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] input = sc.nextLine().split("\\s");
		// 牛数
		Integer N = Integer.parseInt(input[0]);
		// ケージ数
		Integer M = Integer.parseInt(input[1]);

		// 축사 선택 정보
		String[][] choiceInfo = getCowChoiceRooms(sc, N);

		// 축사 배정 정보
		String[] cage = new String[M];
		// 마릿수만큼 루프
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < cage.length; j++) {
				
			}
		}
		System.out.println();
	}

}
