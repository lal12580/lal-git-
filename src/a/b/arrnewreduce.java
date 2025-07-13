package a.b;

import java.util.Scanner;
//有一个数组{1,2,3,4,5}，可以将该数组进行缩减，
// 提示用户是否继续缩减，每次缩减最后那个元素
// 当只剩下最后一个元素，提示，不能再缩减。
public class arrnewreduce {
    public static void main(String[] args) {
        System.out.println("现在有12345共5个数字，每次输入Y就减少最后一个数字");
        int j=0;
        int[] a={1,2,3,4,5};
        do{
            int[] anew=new int[a.length-1];
            for (int i = 0; i < a.length-1; i++) {
                anew[i]=a[i];
            }
            a=anew;
            j++;
            System.out.println("缩减了"+j+"次");
            System.out.println("缩减后的数组是");
            for (int k = 0; k < a.length; k++) {
                System.out.println( a[k]);
            }
            int len=a.length;
            if(len==1){
                System.out.println("只有1了，程序结束");
                break;}
            System.out.println("要继续缩减就填Y,反之填N");
            Scanner sc=new Scanner(System.in);
            char b=sc.next().charAt(0);
            if(b=='N'){break;}
            else if(b=='Y'){continue;}
            else{
                System.out.println("输入错误终止缩减");
                break;
            }
        }while(true);
    }
}
