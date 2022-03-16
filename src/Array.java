public class Array {
    private int[] array;

    public Array(int size) {
        this.array = new int[size];
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public void addValue(int index, int value) {
        array[index] = value;
    }

    public int sumOfArray() {
        int sum = 0;
        for (int index = 0; index < array.length; index++)
            sum += array[index];
        return sum;
    }

    public int maxOfArray() {
        int max = array[0];
        for (int index = 1; index < array.length; index++)
            if (array[index] > max)
                max = array[index];
        return max;
    }

    public int minOfArray() {
        int min = array[0];
        for (int index = 1; index < array.length; index++)
            if (array[index] < min)
                min = array[index];
        return min;
    }

    public int noOfOdd() {
        int odds = 0;
        for (int index = 0; index < array.length; index++)
            if (array[index] % 2 == 1)
                ++odds;
        return odds;
    }

    public int numFrequency(int number) {
        int frequency = 0;
        for (int index = 0; index < array.length; index++)
            if (array[index] == number)
                ++frequency;
        return frequency;
    }
}
