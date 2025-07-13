package a.b;
import java.util.Random;
public class Book {
    static Random m=new Random();
    static double mm=m.nextDouble()*199+1;
    public static double updatePrice(double k){
        System.out.println("书原价是"+k);
        if(k>150){
            return 150;
        }else if(k>100&&k<=150){
            return 100;
        }else{
            return k;
        }
    }
    public static void main(String[] args) {
        Book kk=new Book( );
        System.out.println("改后的价格是"+kk.updatePrice(mm));
    }
}
//书的原价在1~200
//定义方法updatePrice，
//实现更改某本书的价格，具体：如果价格>150，则更改为150，
//如果价格>100，更改为100，否则不变


