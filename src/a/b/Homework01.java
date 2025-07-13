package a.b;

//编程实现如下功能 a.b.Homework01.java
//先自己做，再听老师评讲，这样学习有效果。
//某人有100,000元，每经过一次路口，需要交费，规则如下：
//当现金>50000时，每次交5%
//当现金<=50000时，每次交1000
//编程计算该人可以经过多少次路口，要求：使用 while + break方式完成
public class Homework01 {
    static double a=100000;
    static double k=12333;
    public static void main(String[] args) {
        for(double n=0;a>0;n++){
            if(a>50000){a=0.95*a;}
            else if (a <= 50000 && a > 0){a = a - 1000;}
            else{k = n;break;}
        }
        System.out.println("该人可以经过"+k+"次路口");
    }
}
