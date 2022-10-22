import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] array = {"map","Pineapple", "DragonFruit", "Orange", "Lime", "Cherry"};
        Arrays.sort(array, new ComparatorByLength());
        System.out.println(Arrays.toString(array));
    }
}