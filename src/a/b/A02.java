package a.b;
//定义方法find，
// 实现查找某字符串是否在字符串数组中，
// 并返回索引如果找不到，返回-1
//public class A02 {
//    String[] arr={"hafisdfh","ahjf","aksdhjf","dd"};
//    int index=0;
//    static String b="dd";
//    static String c="afisdjidjfidjfdijfisdjfisdjf";
//    public static int seak(String[] arr) {
//        for (int i = 0; i < arr.length; i++) {
////            if(b.equals(arr[i])){
////                System.out.println("第一个字符串在数组里面");
////            }else{
////                return -1;
////            }
//            if(b.equals(arr[i])){
//                System.out.println("第二个字符串在数组里面");
//            }else{
//                System.out.println("第二个字符串不在数组里面");
//                return -1;
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        A02 ll = new A02( );
//        ll.seak(ll.arr);
//    }
//}

public class A02 {
    public static int find(String[] arr, String target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(target)) {
                return i; // 找到就返回索引
            }
        }
        return -1; // 没找到返回 -1
    }

    public static void main(String[] args) {
        String[] arr = {"apple", "banana", "orange"};   //香蕉的索引是1
        int index = find(arr, "banana");        //应该输出1
        System.out.println(index); // 输出 1

        int index2 = find(arr, "watermelon");
        System.out.println(index2); // 输出 -1
    }
}