package a.a.a;
//部门经理工资=1000 + 单日工资 * 天数 * 等级(1.2)。=> 奖金 + 基本工资
public class Manager extends Employee{

    public Manager(String name, double salary, int day) {
        super(name, salary, day);
    }
    @Override
    public void lal() {
        super.lal();
    }

    public static void main(String[] args) {
        Employee em = new Employee("hasdfl", 309, 23);
        em.setSalary(1000+em.getSalary()*em.getDay()*1.2);
        em.lal();
    }
}
//普遍员工及部门经理都是员工子类，需要重写打印工资方法。
// 定义并初始化部门经理对象，调用打印工资方法输出工资