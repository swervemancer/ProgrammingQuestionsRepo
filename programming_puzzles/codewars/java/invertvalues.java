public class invertvalues {
    public static int[] invert(int[] array) {
        for (int i = 0; i < array.length; i++) array[i] *= -1;
        return array;
     }
}
