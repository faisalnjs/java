import java.util.ArrayList;

public class Array {
    public static void changeElement(int n) {
        n += 3;
    }

    public static void changeArrayElement(int[] n) {
        n[0] += 3;
    }

    public static int getProductSum(ArrayList<Integer> list, int[] arr) {
        int fin = 0;
        int index = 0;
        for (int num : list) {
            if (index < arr.length) {
                fin += num * arr[index];
                index++;
            }
        }
        return fin;
    }

    public static int[] getProducts(ArrayList<Integer> list, int[] arr) {
        int num = list.size();
        if (list.size() < arr.length) {
            num = arr.length;
        }
        int[] fin = new int[num];
        int index = 0;
        if (num == list.size()) {
            for (int n : list) {
                if (index < arr.length) {
                    fin[index] = n * arr[index];
                } else {
                    fin[index] = arr[index];
                }
                index++;
            }
        } else {
            for (int n : arr) {
                if (index < list.size()) {
                    fin[index] = n * list.get(index);
                } else {
                    fin[index] = list.get(index);
                }
                index++;
            }
        }
        return fin;
    }

    public static void main(String[] args) {
        int[] list = { 1, 2, 3, 4 };
        changeElement(list[0]);
        System.out.println(list[0]); // 1
        changeArrayElement(list);
        System.out.println(list[0]); // 4
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(2);
        list1.add(1);
        list1.add(4);
        int[] arr = { 5, 0, 3 };
        for (int product : getProducts(list1, arr))
            System.out.println(product); // { 10, 0, 12 }
        System.out.println(getProductSum(list1, arr)); // 22
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        int[] arr2 = { 2, 3, 7 };
        for (int product : getProducts(list2, arr2))
            System.out.println(product); // { 10, 0, 12 }
        System.out.println(getProductSum(list2, arr2)); // 22
    }
}
