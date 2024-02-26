public class FunWith2DArrays {
    public static int totalElements(int[][] array) {
        int rows = array.length;
        int perRow = array[0].length;
        return rows * perRow;
    }
    public static void fourCorners(String[][] array) {
        int rows = array.length;
        int perRow = array[0].length;
        if (rows > 1 || perRow > 1) {
            String one = array[0][0];
            String two = array[0][perRow - 1];
            String three = array[rows - 1][perRow - 1];
            String four = array[rows - 1][0];
            System.out.println(one + "\n" + two + "\n" + four + "\n" + three);
        } else {
            System.out.println(array[0][0] + "\n" + array[0][0] + "\n" + array[0][0] + "\n" + array[0][0]);
        }
    }
}
