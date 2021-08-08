package academy.devdojo.jiraya.introducao;

public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int[][] matrix = new int[3][];

        matrix[0] = new int[] {1, 2};
        matrix[1] = new int[] {3, 4, 5, 6};
        matrix[2] = new int[] {7, 8, 9, 10, 11, 12};


        for (int[] line: matrix) {
            for (int col: line) {
                System.out.print(col + " ");
            }
            System.out.println("");
        }

        int[][] anotherMatrix = new int[][] {{1, 2, 3}, {3, 2, 1}};

        for (int[] line: anotherMatrix) {
            for (int col: line) {
                System.out.print(col + " ");
            }
            System.out.println("");
        }
    }
}
