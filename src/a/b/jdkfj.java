package a.b;

public class jdkfj {
    public static void main(String[] args) {
        int[][] arr = new int[3][];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = new int[i + 1];
            //遍历一维数组，并给一维数组的每个元素赋值
            for(int j = 0; j < arr[i].length; j++) {
                arr[i][j] = i + 1;//赋值
            }
        }
        System.out.println("=====arr 元素=====");
        for(int i = 0; i < arr.length; i++) {
            //输出 arr 的每个一维数组
            for(int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();//换行
        }
    }
}
