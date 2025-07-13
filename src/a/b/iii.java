package a.b;//随机生成10个整数(1~100的范围)保存到数组，
// 并倒序打印以及求平均值、
// 求最大值和最大值的下标、
// 并查找里面是否有8 Homework05.java
import java.util.Random;
public class iii {
    public static void lal(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(arr[arr.length - 1]);
    }

    public static void main(String[] args) {
        Random lal = new Random();
        int[] arr = new int[10];
        System.out.println("生成的10个整数为：");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = lal.nextInt(100) + 1;
            System.out.print(arr[i] + " ");
        }
        char c='无';
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==8){
                c='有';
            }else{
                continue;
            }
        }
        int max = arr[0];      // 假设第一个是最大
        int maxIndex = 0;      // 假设最大值下标为0
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {		//已有值比定的值大！
                max = arr[i];		//得到最大值
                maxIndex = i;		//得到最大值的下标
            }
        }

        System.out.println("\n倒序的结果为：");
        int[] arrNew = new int[arr.length];
        //令新为i,旧为j
        for (int i = 0, j = arr.length - 1; j >= 0; i++, j--) {
            arrNew[i] = arr[j];
        }
        arr = arrNew;
        for (int i = 0; i < arrNew.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            num += arr[i];
        }
        double cc = (double)num / 10.00;
        System.out.println("相加的值为：\n" + num);
        System.out.println("平均值为\n"+cc);
        System.out.println("最大值为:");
        //外层为i,内层为j
        iii.lal(arr);
        System.out.println("原数组最大值排在第" + (maxIndex+1)+"的位置");
        System.out.println("生成的数组里面"+c+"8");
    }
}