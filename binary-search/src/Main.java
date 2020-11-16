public class Main {

    public static void main(String[] args) {
	    int[] array = {-16, -9, -5, 0, 3, 7, 12, 18, 20, 24, 30, 32, 38, 47, 50};
        System.out.println(search(array, 20));
    }

    public static int search(int[] array, int element) {
        return bis(array, 0, array.length - 1, element);
    }

    private static int bis(int[] array, int start, int end, int element) {

        if (start < 0 || end < 0) return -1;
        if (array[start] == element) return start;
        if (array[end] == element) return end;

        int middlePos = (end - start) >>> 1;
        int middleElement = array[middlePos];

        if (element > middleElement) {
            return bis(array, middlePos, end - 1, element);
        } else if (element < middleElement) {
            return bis(array, start, middlePos - 1, element);
        } else if (array[middlePos] == element) {
            return middlePos;
        } else return -1;
    }
}
