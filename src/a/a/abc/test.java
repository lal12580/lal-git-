package a.a.abc;

public class test {
    public static void main(String[] args) {
        fa f = new fa(123);
        Waiter wa = new Waiter(12);
        Scientist sc = new Scientist(23,444);
        Teacher te = new Teacher(13,4523,63);
        Peasant pe = new Peasant(1234);
        Worker wo = new Worker(745);
        System.out.println(f.getSal()+"\n");
        System.out.println(wa.getSal()+"\n");
        System.out.println(sc.getSal()+"\n");
        System.out.println(te.getSal()+"\n");
        System.out.println(pe.getSal()+"\n");
        System.out.println(wo.getSal()+"\n");
    }
}
