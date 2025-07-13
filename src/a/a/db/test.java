package a.a.db;

public class test {
    @Override
    public String toString() {
        return "test{}";
    }

    public static void main(String[] args) {
        Person[] pe=new Person[4];
        pe[0]=new Student("asdfjh","男",98,0124);
        pe[1]=new Student("jh","男",93338,01234);
        pe[2]=new Teacher("asjh","男",338,04434);
        pe[3]=new Teacher("a","nv",8,01774);
        for (int i = 0; i < pe.length-1; i++) {
            for (int j = 0; j < pe.length - 1 - i; j++) {
                if (pe[j].getAge() < pe[j + 1].getAge()) {
                    Person temp = pe[j];
                    pe[j] = pe[j + 1];
                    pe[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < pe.length; i++) {
            pe[i].play();

        }

    }
}

//(7) 定义多态数组，里面保存2个学生和2个教师，要求按年龄从高到低排序
//(8) 定义方法，形参为Person类型，功能：调用学生的study或教师的