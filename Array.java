public class Array {
    public static void changeElement(int n) {
        n += 3;
    }

    public static void changeArrayElement(int[] n) {
        n[0] += 3;
    }

    public static void main(String[] args) {
        int[] list = { 1, 2, 3, 4 };
        changeElement(list[0]);
        System.out.println(list[0]); // 1
        changeArrayElement(list);
        System.out.println(list[0]); // 4
    }
}
