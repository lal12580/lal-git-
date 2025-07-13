package a.a.abc;

public class fa {
    double sal;

    public fa(double sal) {
        this.sal = sal;
    }

    public double getSal() {
        System.out.println(sal);
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

}

//父类一员工类
//子类：工人类(Worker),农民类(Peasant),教师类(Teacher),科学家类(Scientist),服务生类(Waiter)。
//(1) 其中工人,农民,服务生只有基本工资 sal
//(2) 教师除基本工资外,还有课酬(元/天) classDay, classSal
//(3) 科学家除基本工资外,还有年终奖 bonus
//(4) 编写一个测试类,将各种类型的员工的全年工资打印出来