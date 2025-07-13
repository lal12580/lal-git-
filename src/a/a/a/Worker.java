package a.a.a;

public class Worker extends Employee{
    public Worker(String name, double salary, int day) {
        super(name, salary, day);
    }

    @Override
    public void lal() {
        super.lal();
    }

    public static void main(String[] args) {
        Employee em = new Employee("hasdfl", 309, 23);
        em.setSalary(1000+em.getSalary()*em.getDay()*1);
        em.lal();
    }
}
//普通员工工资=单日工资 * 天数 * 等级(1.0)；=> 基本工资
//普遍员工及部门经理都是员工子类，需要重写打印工资方法。
//定义并初始化普通员工对象，调用打印工资方法输出工资，



