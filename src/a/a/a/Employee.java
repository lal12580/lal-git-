package a.a.a;

public class Employee {
    private String name;
    private double salary;
    private int day;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", day=" + day +
                '}';
    }


    public Employee(String name,double salary,int day) {
        this.name = name;
        this.salary = salary;
        this.day = day;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void lal(){
        System.out.println(salary);
    }

    public static void main(String[] args) {
        Employee em = new Employee("hasdfl", 309, 23);
        em.lal();
    }
}
//通过继承实现员工工资核算打印功能
//父类：员工类(Employee)
//子类：部门经理类(Manager)、普通员工类(Worker)
//(3) 员工属性：姓名，单日工资，工作天数

//(4) 员工方法(打印工资)
//(5) 普遍员工及部门经理都是员工子类，需要重写打印工资方法。

