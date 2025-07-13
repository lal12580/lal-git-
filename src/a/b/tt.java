package a.b;

public class tt {
//    6. 试写出以下代码的打印结果 Homework06.java
    public static void main(String[] args) {
        char[] arr1 = {'a', 'z', 'b', 'c'};
        char[] arr2 = arr1;
        arr1[2] = '韩';

        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr1[i] + "," + arr2[i]);
        }
    }
}
