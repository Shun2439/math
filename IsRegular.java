import java.util.Scanner;

public class IsRegular {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[][] matrix = new int[3][3];

		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				System.out.print((i + 1) + ", " + (j + 1) + ": ");

				matrix[i][j] = sc.nextInt();
			}
		}

		System.out.println();

		for(int i = 0; i < 3; i++){
			System.out.print("|");
			for(int j = 0; j < 3; j++){
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println("|");
		}

		int result = (
				(matrix[0][0] * matrix[1][1] *matrix[2][2])
				+ (matrix[0][2] * matrix[1][0] * matrix[2][1])
				+ (matrix[0][1] * matrix[1][2] * matrix[2][0])
				)
			+(
					- (matrix[0][2] * matrix[1][1] *matrix[2][0])
					- (matrix[0][0] * matrix[1][2] * matrix[2][1])
					- (matrix[0][1] * matrix[1][0] * matrix[2][2])
			 );

		System.out.println();
		System.out.println("result: " + result);
		System.out.println();

		if(result != 0){
			System.out.println("Regular");
		}
		else {
			System.out.println("Not regular");
		}
	}
}
