package a.a.abc;

public class Peasant extends fa{

    public Peasant(double sal) {
        super(sal);

    }

    @Override
    public double getSal() {
        System.out.println(sal);
        return sal;
    }

    @Override
    public void setSal(double sal) {
        this.sal = sal;
    }
}
//(1) 其中工人,农民,服务生只有基本工资 sal