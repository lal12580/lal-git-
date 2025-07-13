package a.b;

//定义方法max，
// 实现求某个double数组的最大值，
// 并返回 a.b.Homework01.java
public class A01 {

    public static double Max(double[] arr){
        double max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }else{continue;}

        }
        System.out.println("最大值是："+max);
        return max;
    }
    double[] arr={2,323.4,323.4,111,3312,};
    public static void main(String[] args) {
        A01 a01 = new A01();
        A01.Max(a01.arr);
    }
}
