import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        String[][] names = {
                {"Abby", "Don", "George", "Kim"},
                {"Brian", "Elenor", "Harry", "Lenny"},
                {"Cathy", "Fred", "Jill", "Matt"},
        };
        names[1][2] = "Paul";
        String temp = names[0][0];
        names[0][0] = names[2][3];
        names[2][3] = temp;
        String[] temp2 = names[0];
        names[0] = names[1];
        names[1] = temp2;
        for (String[] list : names) {
            for (String name: list) {
                System.out.print(name + " ");
            }
            System.out.println();
        }
        int[][] arr1 = new int[2][3];
        String[][] arr2 = new String[4][2];
        for (int[] list : arr1) {
            for (int nums: list) {
                System.out.print(nums + " ");
            }
            System.out.println();
        }
        for (String[] list : arr2) {
            for (String word: list) {
                System.out.print(word + " ");
            }
            System.out.println();
        }
        arr1[0][0] = 1;
        arr1[0][1] = 2;
        arr1[0][2] = 3;
        arr1[1][0] = 4;
        arr1[1][1] = 5;
        arr1[1][2] = 6;
        arr2[0][0] = "a";
        arr2[0][1] = "b";
        arr2[1][0] = "c";
        arr2[1][1] = "d";
        arr2[2][0] = "e";
        arr2[2][1] = "f";
        arr2[3][0] = "g";
        arr2[3][1] = "h";
        for (int[] list : arr1) {
            for (int nums: list) {
                System.out.print(nums + " ");
            }
            System.out.println();
        }
        for (String[] list : arr2) {
            for (String word: list) {
                System.out.print(word + " ");
            }
            System.out.println();
        }
        // TEST CODE FOR totalElements
        int[][] testArr1 = {{5, 2}, {1, 3}, {7, 9}};
        System.out.println(FunWith2DArrays.totalElements(testArr1));
        int[][] testArr2 = {{1, 2, 3}, {6, 5, 4}};
        System.out.println(FunWith2DArrays.totalElements(testArr2));
        int[][] testArr3 = {{1, 2, 3, 4}, {7, 8, 9, 10}};
        System.out.println(FunWith2DArrays.totalElements(testArr3));
        int[][] testArr4 = {{4, 5, 2}, {1, 9, 7}, {8, 10, 13}};
        System.out.println(FunWith2DArrays.totalElements(testArr4));
        int[][] testArr5 = {{4, 5, 2, 4, 1}, {1, 9, 7, 8, 2}, {8, 10, 13, 4, 3}};
        System.out.println(FunWith2DArrays.totalElements(testArr5));
        int[][] testArr6 = {{4, 5, 2, 4, 8, 9, 10}, {1, 9, 7, 8, 6, 1, 2}};
        System.out.println(FunWith2DArrays.totalElements(testArr6));
        int[][] testArr7 = {{4}, {7}, {8}, {2}};
        System.out.println(FunWith2DArrays.totalElements(testArr7));
        int[][] testArr8 = {{4}};
        System.out.println(FunWith2DArrays.totalElements(testArr8));
        int[][] testArr9 = {{}};
        System.out.println(FunWith2DArrays.totalElements(testArr9));
        // TEST CODE FOR fourCorners
        System.out.println("-------TEST 1-------");
        String[][] words = {
                {"hi", "bye", "stuff", "go"},
                {"time", "up", "you", "good"},
                {"map", "low", "bow", "mom"}
        };
        FunWith2DArrays.fourCorners(words);

        System.out.println("-------TEST 2-------");
        String[][] words2 = {
                {"time", "up", "bye"},
                {"hi", "hit", "up"},
                {"map", "bam", "low"},
                {"bow", "mom", "joy"}
        };
        FunWith2DArrays.fourCorners(words2);

        System.out.println("-------TEST 3-------");
        String[][] words3 = {{"phone", "mouse", "keyboard"}};
        FunWith2DArrays.fourCorners(words3);

        System.out.println("-------TEST 4-------");
        String[][] words4 = {
                {"cat"},
                {"dog"},
                {"hamster"},
                {"bird"}
        };
        FunWith2DArrays.fourCorners(words4);

        System.out.println("-------TEST 5-------");
        String[][] words5 = {{"time"}};
        FunWith2DArrays.fourCorners(words5);

    }
}
