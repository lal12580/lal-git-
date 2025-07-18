package com.lal.housework.view;
import com.lal.housework.domain.house;
import com.lal.housework.utils.Utility;
import com.lal.housework.service.house_arr;
public class house_view {
    private static boolean loop=true;
    private static char key=' ';
    private house_arr ll = new house_arr(10);
    public void update(){
        //更新数据
        System.out.println("选择你要更改的数据的id");
        int id_seek=Utility.readInt();
        ll.choice_house(id_seek);
    }
    public void seek(){
        //根据id查找房屋信息
        System.out.println("输入你想查找的房屋的id");
        int id_seek=Utility.readInt();
        ll.seekhouse(id_seek);
    }
    public void exit(){
        System.out.println("填Y退出");
        char ch2=Utility.readConfirmSelection();
        if(ch2=='Y'){
            loop=false;
            System.out.println("退出成功！");
        }
    }
    public void addhouse(){
        //录入信息
        System.out.println("名字：");
        String name=Utility.readString(8);
        System.out.println("电话：");
        String tele=Utility.readString(12);
        System.out.println("位置");
        String site=Utility.readString(16);
        System.out.println("租金");
        int rent=Utility.readInt();
        System.out.println("状态");
        String status=Utility.readString(3);
        house newhouse=new house(1,name,tele,site,rent,status);//存入用户录入的信息
        //判断是否继续录入信息
        if(ll.informantion(newhouse)){
            System.out.println("添加成功！");
        }else{
            System.out.println("添加失败......");
        }
    }
    public void houselist(){
        System.out.println("编号\t\t房主名字\t\t电话\t\t\t地址\t\t\t月租\t\t\t状态");
        house[] lal=ll.list();
        for (int i = 0; i < lal.length; i++) {
            if(lal[i]==null){break;}
            System.out.println(lal[i]);
        }
    }

    public void delhouse(){
        System.out.println("删除功能开始！");
        System.out.println("如果进入错误就按-1退出");
        //输入-1就退出——输入要删除的房屋编号,具体代码实现在操作类里面
        System.out.println("你可以选择你要删除的房屋编号");
        int delid=Utility.readInt();
        char ch=Utility.readConfirmSelection();
        if(delid==-1){
            //得到用户数据的delid在后端删除方法里面实现
            //输入-1就退出——输入要删除的房屋编号
            System.out.println("退出程序咯~");
            return;
        }else{
            //如果Y就删，N就继续确认删掉
            System.out.println("这样做真的会删除它，你真的要删除吗？");
            System.out.println("继续删除就按Y");
            if(ch=='Y'){
                if(ll.delhouse(delid)){
                    System.out.println("删除成功！");
                }else{
                    System.out.println("无该房屋编号，删除失败");
                }
            }else{
                System.out.println("放弃删除");
                return;
            }
        }
    }


    public  static void mainMenu(){
        house_view hv=new house_view();
        do{
            System.out.println("========欢迎来到房屋出租系统！========");
            System.out.println("\t\t\t1新增房源");
            System.out.println("\t\t\t2查找房屋");
            System.out.println("\t\t\t3删除房屋");
            System.out.println("\t\t\t4修改房屋信息");
            System.out.println("\t\t\t5房屋列表");
            System.out.println("\t\t\t6退出");
            System.out.println("========选择你要进行的操作========");
            key=Utility.readChar();
            switch(key){
                case '1':System.out.println("增加");hv.addhouse(); break;
                case '2':System.out.println("查找");hv.seek();break;
                case '3':System.out.println("删除");hv.delhouse();break;
                case '4':System.out.println("修改");hv.update();break;
                case '5':System.out.println("列表");hv.houselist();break;
                case '6':hv.exit();break;
            }
        }while(loop);
    }
}
