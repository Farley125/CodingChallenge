import java.util.Arrays;
public class ArrayContains {
    public static void main(String[] args) {
        int[][] test = new int[3][2];
        test[][] = ;

    }
    public boolean containsDuplicates(int[][] list) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < list.length;i++) {
            for (int j = 0; j < list[0].length;j++) {
                if (x != j && rowContains(list[j], list[y][x])) {
                    return true;
                }
                if (x < list[0].length-1) {
                    x++;
                } else x = 0;
            }
            if (y < list.length-1) {
                y++;
            } else y = 0;
        }
        return false;
    }
    public boolean rowContains(int[] list, int search) {
        for (int i : list) {
            if (i == search) {
                return true;
            }
        }
        return false;
    }
}
