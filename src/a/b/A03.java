package a.b;
//实现数组的复制功能 copyArr，
//输入旧数组，返回一个新数组，元素和旧数组一样
import java.util.Scanner;
public class A03 {
    public static int[] copyArr(int[] arr){
        int[] arrNew=new int[arr.length];
        for (int i = 0,j=0; i < arr.length; i++,j++) {
            arrNew[j]=arr[i];
        }
        arr=arrNew;
        System.out.println("复制的数组为：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" "+arr[i]);
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println("输入你想建立的数组的大小");
        Scanner sc = new Scanner(System.in);
        int[] aa=new int[sc.nextInt()];
        System.out.println("现在来插入数据");
        Scanner sc2 = new Scanner(System.in);
        for (int i = 0; i < aa.length; i++) {
            aa[i]=sc2.nextInt();
        }
        System.out.println("插入后的数组为:");
        for (int i = 0; i < aa.length; i++) {
            System.out.print(aa[i]+" ");
        }
        System.out.println("现在开始复制新数组......");
        A03 a03 = new A03();
        a03.copyArr(aa);


    }
}
