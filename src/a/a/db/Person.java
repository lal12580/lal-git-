package a.a.db;

public class Person {
    private String name;
    private String sex;
    private int age;
    public void play(){
        System.out.println(name+"爱玩"+"球类");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }

    public Person(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
//(3) 抽取一个父类Person类，将共同属性和方法放到Person类
//(6) 学生和教师都有玩的方法（play），学生玩的是足球，老师玩的是象棋，此方法是返回字符串的，分别返回"xx爱玩足球"和"xx爱玩象棋"（其中xx分别代表学生和老师的姓名）。
//因为玩的方法名称都一样，所以要求此方法定义在父类中，子类实现重写。
//应当分析出，我们需要打印信息的方法，println()  。