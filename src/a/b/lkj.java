package a.b;//已知有个升序的数组，要求插入一个元素，该数组顺序依然是升序
import java.util.Scanner;
//比如：[10, 12, 45, 90]，添加23后，数组为[10, 12, 23, 45, 90]
public class lkj {
    int[] a={10, 12, 45, 90};
    Scanner sc=new Scanner(System.in);
    public void lal(){
        System.out.println("请输入数据！");
        int[] b=new int[1];
        b[0]=sc.nextInt();
        System.out.println("数据成功上传");
        for(int i=0;i<3;i++){
            if (a[i] > b[0]) {
                System.out.println("");
                continue;
            }else{
                System.out.println("你输入的数据有问题");
                break;
            }
        }
    }

    public static void main(String[] args) {
        lkj lkj=new lkj();
        lkj.lal();
    }
}
