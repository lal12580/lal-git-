package a.a.d;

public class LabeledPoint extends Point{
    String s;

    public LabeledPoint(double x, double y, String s) {
        super(x, y);
        this.s = s;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return "LabeledPoint{" +
                "s='" + s + '\'' +
                '}';
    }

}
//设计一个Point类，其x和y坐标可以通过构造器提供。
//提供一个子类LabeledPoint，其构造器接受一个标签值和x,y坐标，
//比如：new LabeledPoint("Black",1929,230.07)，写出对应的构造器即可
