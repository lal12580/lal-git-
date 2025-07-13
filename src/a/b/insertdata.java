package a.b;

public class insertdata {
    public static void main(String[] args) {
        int[ ] arr = {10, 12, 45, 90};
        int insertNum = 23;	//要插入的数据
        int index = -1; 		//index指定插入的位置
        for(int i = 0; i < arr.length; i++) {
            if(insertNum <= arr[i]) {	//插入数据小于某个数字确定插入的地方
                index = i;
                break;
            }
        }
        if(index == -1) {
            index = arr.length;
//若没找到的可插入的位置，则放到数组最后面
        }
//用扩容的办法 将原数组 换成插入后的数组
        int[ ] arrNew = new int[arr.length + 1];
//i 为新的数组下标，j为旧的数组下标
        for(int i = 0, j = 0; i < arrNew.length; i++) {	//新的位置不断腾出来，条件围绕着新的！
            if( i != index ) {
                arrNew[i] = arr[j];	//非插入位置复制数据
//旧赋给新
                j++;
//旧的数据不断 呈现
            } else {
                arrNew[i] = insertNum;  //插入位置替换数据
            }
        }
        arr = arrNew;
        for(int k=0;k<arrNew.length;k++){
            System.out.println(arrNew[k]);
        }
    }
}
