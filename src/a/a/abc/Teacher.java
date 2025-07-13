package a.a.abc;

public class Teacher extends fa{

    int classDay;
    double classSal;

    public Teacher(double sal, int classDay,double classSal) {
        super(sal);
        this.classDay = classDay;
        this.classSal=classSal;
    }

    @Override
    public double getSal() {
        System.out.println(sal+classSal+classDay);
        return sal;
    }

    @Override
    public void setSal(double sal) {
        this.sal = sal;
    }
}
//(2) 教师除基本工资外,还有课酬(元/天) classDay, classSal