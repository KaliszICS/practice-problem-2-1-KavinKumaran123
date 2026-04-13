public class PracticeProblem {

    public static void main(String args[]) {

    }

    // 1. Find first occurrence of an int
    public static int find(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                return i;
            }
        }
        return -1;
    }

    // 2. Find last occurrence of a String
    public static int findLast(String[] array, String string) {
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i].equals(string)) {
                return i;
            }
        }
        return -1;
    }

    // 3. Find second occurrence of a char
    public static int findSecond(char[] array, char character) {
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == character) {
                count++;
                if (count == 2) {
                    return i;
                }
            }
        }

        // If only one occurrence, return its index
        if (count == 1) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == character) {
                    return i;
                }
            }
        }

        return -1;
    }

    // 4. Find all occurrences of a double
    public static int[] findAll(double[] array, double number) {
        int count = 0;

        // Count occurrences
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                count++;
            }
        }

        // Create result array
        int[] result = new int[count];
        int index = 0;

        // Store indexes
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                result[index] = i;
                index++;
            }
        }

        return result;
    }

}