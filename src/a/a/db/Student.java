package a.a.db;

public class Student extends Person{
    private int stu_id;

    public int getStu_id() {
        return stu_id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stu_id=" + stu_id +
                '}';
    }

    public void setStu_id(int stu_id) {
        this.stu_id = stu_id;
    }

    public Student(String name, String sex, int age, int stu_id) {
        super(name, sex, age);
        this.stu_id = stu_id;
    }

    public void play(){
        System.out.println("___________________");
        System.out.println("学生的信息：");
        System.out.println("姓名"+getName());
        System.out.println("年纪"+getAge());
        System.out.println("性别"+getSex());
        System.out.println("工号"+getStu_id());
        System.out.println(getName()+"爱玩"+"和平精英");
        study();
    }
    public void study(){
        System.out.println("\"我承诺，我会好好学习。\"");
    }
}
//(1) 做一个Student类，Student类有名称（name），性别（sex），年龄（age），学号（stu_id），做合理封装，通过构造器在创建对象时将4个属性赋值。
//(4) 学生需要有学习的方法（study），在方法里写生"我承诺，我会好好学习。"。
//(6) 学生和教师都有玩的方法（play），学生玩的是足球，老师玩的是象棋，此方法是返回字符串的，分别返回"xx爱玩足球"和"xx爱玩象棋"（其中xx分别代表学生和老师的姓名）。
//因为玩的方法名称都一样，所以要求此方法定义在父类中，子类实现重写。
//应当分析出，我们需要打印信息的方法，println()  。