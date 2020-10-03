package category01;

import java.util.Scanner;

public class AlgorithmMain {
	
	static String[][] choiceInfo = null;
	static String[] cage = null;

	/**
	 * 牛が選択したケージ番号取得
	 * 
	 * @param sc
	 * @param N
	 * @return
	 */
	public static String getRoomNumber(String select) {
		for (int i = 0; i < cage.length; i++) {
			if (select.equals(cage[i])) {
				return String.valueOf(i);
			}
		}
		return null;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] input = sc.nextLine().split("\\s");
		// 牛数
		Integer N = Integer.parseInt(input[0]);
		// ケージ数
		Integer M = Integer.parseInt(input[1]);

		// 축사 선택 정보
		choiceInfo = new String[N][];
		for (int i = 0; i < N; i++) {
			choiceInfo[i] = sc.nextLine().split("\\s");
		}

		// 축사 배정 정보
		cage = new String[M];
		// 마릿수만큼 루프
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < choiceInfo[i].length; j++) {
				String select = choiceInfo[i][j];
				String roomInfo = getRoomNumber(select);
				if (roomInfo != null) {
					
					break;
				}
				cage[i] = select;
				break;
			}
		}
		System.out.println();
	}

}
