import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(5);
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(25);
        System.out.println(arrayList);
        arrayList.remove(2);
        System.out.println(arrayList);
        arrayList.add(3, 100);
        System.out.println(arrayList);
        System.out.println(arrayList.contains(25));
    }
}