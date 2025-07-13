package a.a.ab;
//3. 编写老师类
//        (1) 要求有属性“姓名name”，“年龄age”，“职称post”，“基本工资salary”
//        (2) 编写业务方法，introduce（），实现输出一个教师的信息。
//        (3) 编写教师类的三个子类：教授类（Professor）、副教授类、讲师类。工资级别分别为：教授为1.3、副教授为1.2、讲师类1.1。在三个子类里面都重写父类的introduce（）方法。
//        (4) 定义并初始化一个老师对象，调用业务方法，实现对象基本信息的后台打印。
import java.util.Scanner;
public class teacher {
    String name=" ";
    int age=0;
    String post=" ";
    double salary=0.0;

    public teacher(String name,int age,String post,double salary) {
        this.name = name;
        this.age = age;
        this.post = post;
        this.salary= salary;
    }

    public teacher() {
    }

    @Override
    public String toString() {
        return "teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", post='" + post + '\'' +
                ", salary=" + salary +
                '}';
    }
    public teacher[] insert(){
        Scanner sc=new Scanner(System.in);
        System.out.println("输入要录入多少个教师的数据");
        int jj=sc.nextInt();
        teacher[] te=new teacher[jj];
        for(int i=0;i<jj;i++){
            te[i]=new teacher("名字", 0, "职位", 0.0);
        }
        //录入数据
        System.out.println("依次输入姓名name”，“年龄age”，“职称post”，“基本工资salary");
        for (int i = 0; i < te.length; i++) {
            System.out.println("输入姓名");
            te[i].name= sc.next();
            System.out.println("输入年龄");
            te[i].age= sc.nextInt();
            System.out.println("输入职称");
            te[i].post=sc.next();
            System.out.println("输入基本工资");
            te[i].salary=sc.nextDouble();
            System.out.println("共录入完了"+i+"个");
            System.out.println("还要继续的话就输入Y,输入其他视为退出录入");
            char c=sc.next().charAt(0);
            if(c=='Y'){
                System.out.println("继续输入");
                continue;
            }else{
                System.out.println("那就退出咯");
                break;
            }
        }
        //输出数据
        for (int i = 0; i < te.length; i++) {
            System.out.println(te[i]);
        }
        return te;
    }
    //执行方法
    public static void main(String[] args) {
        teacher tee = new teacher();
        tee.insert();
    }
}
