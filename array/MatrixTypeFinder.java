package array;

public class MatrixTypeFinder {

	public static void main(String[] args) {

		int[][] num = { { 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } };

		typeFinder(num);
	}

	public static void typeFinder(int[][] num) {
		int row, col;
		int[] d = new int[3];

		row = num.length;
		col = num[0].length;
		if (row != 3 && col != 3) {
			System.out.println("Not a Specified Matrix");
			return;
		}

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (i == j && num[i][j] != 0) {
					d[i] = num[i][j];
				} else if (num[i][j] != 0) {
					System.out.println("Not a Specified Matrix");
					return;
				}
			}
		}

		boolean flag = true;
		for (int i = 1; i < d.length; i++) {
			if (d[0] != d[i]) {
				flag = false;
			}
		}

		if (flag && d[0] == 1) {
			System.out.println("Identity Matrix");
			
		} else if (flag && d[0] != 1) {
			System.out.println("Scalar Matrix");
			
		} else
			System.out.println("Diagonal Matrix");
	}

}
