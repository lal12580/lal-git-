package a.a.db;

public class Teacher extends Person{
    private int work_age;

    @Override
    public String toString() {
        return "Teacher{" +
                "work_age=" + work_age +
                '}';
    }

    public Teacher(String name, String sex, int age, int work_age) {
        super(name, sex, age);
        this.work_age = work_age;
    }

    public int getWork_age() {
        return work_age;
    }

    public void setWork_age(int work_age) {
        this.work_age = work_age;
    }

    public void play(){
        System.out.println("___________________");
        System.out.println("老师的信息：");
        System.out.println("姓名"+getName());
        System.out.println("年纪"+getAge());
        System.out.println("性别"+getSex());
        System.out.println("工长"+getWork_age());
        System.out.println(getName()+"爱玩"+"象棋");
        teach();
    }
    public void teach(){
        System.out.println("\"我承诺，我会认真教学。\"");
    }
}
//(2) 写一个Teacher类，Teacher类有名称（name），性别（sex），年龄（age），工龄（work_age），做合理封装，通过构造器在创建对象时将4个属性赋值。
//(5) 教师需要有教学的方法（teach），在方法里写上"我承诺，我会认真教学。"。
//(6) 学生和教师都有玩的方法（play），学生玩的是足球，老师玩的是象棋，此方法是返回字符串的，分别返回"xx爱玩足球"和"xx爱玩象棋"（其中xx分别代表学生和老师的姓名）。
//因为玩的方法名称都一样，所以要求此方法定义在父类中，子类实现重写。
//应当分析出，我们需要打印信息的方法，println()  。