import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        String[][] matrix = new String[len][len];
        int y = 0;
        for (int i = 0; i < len; i++) {
            y++;
            for (int j = 0; j < len; j++) {
                if (i == j || i == len / 2 || j == len - y) {
                    matrix[i][j] = "*";
                } else if (j == len / 2) {
                    for (int k = 0; k < len; k++) {
                        matrix[k][len / 2] = "*";
                    }
                } else {
                    matrix[i][j] = ".";
                }
            }
        }
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
