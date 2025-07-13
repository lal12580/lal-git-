package a.b;
//有名字、颜色和年龄属性，
// 定义输出方法show()显示其信息
// 并创建对象，进行测试。【提示this.属性，自己做】
import java.util.Scanner;
public class Dog {
    String name=" ";
    String color=" ";
    int age=0;
    public  void insert(){
        Scanner sc = new Scanner(System.in);
        System.out.println("输入名字");
        name=sc.nextLine();
        System.out.println("输入颜色");
        color=sc.nextLine();
        System.out.println("输入年龄");
        age=sc.nextInt();
    }
    public static void show(){
        Dog dog = new Dog();
        dog.insert();
        System.out.println("依次输入后的内容是：");
        System.out.println(dog.name+dog.color+ dog.age);
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.show();
    }
}
