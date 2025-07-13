package a.b;
//创建一个Employee类，属性有(名字，性别，年龄，职位，薪水)，提供3个构造方法，可以初始化：
//        （1）(名字，性别，年龄，职位，薪水)
//        （2）(名字，性别，年龄)
//        （3）(职位，薪水)，要求充分复用构造器Homework12.java
public class Employee {
    String name="jfa";
    String gender ="jfa";
    int age=0;
    String position="jfa";
    double salary=0.0;
    public Employee(String position,double salary){
        this.position=position;
        this.salary=salary;
        System.out.println("1");
    }
    public Employee(String name,String gender,int age){
        this.name=name;
        this.gender=gender;
        this.age=age;
        System.out.println("2");
    }
    public Employee(String position,double salary,String name,String gender,int age){
        this(position,salary);
        this.name=name;
        this.gender=gender;
        this.age=age;
        System.out.println("3");
    }

    public static void main(String[] args) {
        Employee e = new Employee("hsdfakh",9.9);
        Employee w = new Employee("hsdfakh","fsdha",99);
        Employee ew = new Employee("hsdfakh",2.3,"fsdha","jfadsk",8);
    }
}
