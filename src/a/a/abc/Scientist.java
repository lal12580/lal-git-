package a.a.abc;

public class Scientist extends fa{
    double bonus;
    public Scientist(double sal,  double bonus) {
        super(sal);
        this.bonus = bonus;
    }

    @Override
    public double getSal() {
        System.out.println(sal+bonus);
        return sal;
    }

    @Override
    public void setSal(double sal) {
        this.sal = sal;
    }

}
//(3) 科学家除基本工资外,还有年终奖 bonus