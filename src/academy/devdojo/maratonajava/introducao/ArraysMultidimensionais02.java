package academy.devdojo.maratonajava.introducao;

public class ArraysMultidimensionais02 {
    public static void main(String[] args) {

        int[] array = {1, 2, 3};

        int[][] arrayInt = new int[3][];

        arrayInt[0] = new int[2];
        arrayInt[1] = array;
        arrayInt[2] = new int[]{1, 2, 3, 4, 5, 6};

        int[][] arrayInt2 = {{0, 0}, {1, 2, 3}, {1, 2, 3, 4, 5, 6}};

        for (int[] nums : arrayInt2) {
            for (int num : nums) {
                System.out.print(num + " ");
            }
            System.out.println("\n-------");
        }

    }
}
