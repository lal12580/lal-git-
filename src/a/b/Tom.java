package a.b;
//有个人Tom设计他的成员变量和成员方法，实现电脑猜拳功能。规则如下：
//电脑每次随机生成 0、1、2，分别代表：
//0：石头
//1：剪刀
//2：布
//程序需记录并显示Tom的输赢次数清单。
import java.util.Random;
import java.util.Scanner;
public class Tom {
    Random ra=new Random(3);
    Scanner sc=new Scanner(System.in);
    public void lal(){
        int i=0;
        do {
            System.out.println("输入1~3");
            int b=sc.nextInt();
            int a=ra.nextInt();
            if ((a == 0 && b == 2) || (a == 1 && b == 0) || (a == 2 && b == 1)) {
                System.out.println("人赢了");
            } else if (a == b) {
                System.out.println("平局");
            } else {
                System.out.println("电脑赢了");
            }
            System.out.println("不比的话按Y");
            char c = sc.next().charAt(0);
            if (c == 'Y') {
                System.out.println("游戏结束");
                break;
            } else {
                System.out.println("默认继续游戏");
                i++;
                System.out.println("当前比赛共对局" + i);
            }
        }while(true);
    }
    public static void main(String[] args) {
        Tom t = new Tom();
        t.lal();
        "jsadfkj".equals("asfhj");

    }
}

