package com.lal.housework.service;
import com.lal.housework.domain.house;
import com.lal.housework.utils.Utility;
public class house_arr {
    private house[] houses;
    private int idhouse=1;    //当前新房子到第几个
    private int houseNumber=1;    //当前共多少个房子
    public house_arr() {}
    //更改房屋信息
    public void choice_house(int id_seek){
        if(id_seek>houseNumber||id_seek<1){
            System.out.println("没有这个id编号，你个贱东西！");
        }else{
            System.out.println("选择你要更改的信息:");
            System.out.println("1.房主名字\n2.电话\n3.地址\n4.月租\n5.状态");
            String choice=Utility.readString(16);
            switch (choice){
                case "1":
                    System.out.println("填写更改后的房主名字");
                    String name=Utility.readString(8);
                    houses[id_seek-1].setName(name);
                    System.out.println("更新成功！");
                    break;
                case "2":
                    System.out.println("填写更改后的电话");
                    String tele=Utility.readString(12);
                    houses[id_seek-1].setTele(tele);
                    System.out.println("更新成功！");
                    break;
                case "3":
                    System.out.println("填写更改后的地址");
                    String site=Utility.readString(16);
                    houses[id_seek-1].setSite(site);
                    System.out.println("更新成功！");
                    break;
                case "4":
                    System.out.println("填写更改后的月租");
                    int rent=Utility.readInt();
                    houses[id_seek-1].setRent(rent);
                    System.out.println("更新成功！");
                    break;
                case "5":
                    System.out.println("填写更改后的状态");
                    String status=Utility.readString(3);
                    houses[id_seek-1].setStatus(status);
                    System.out.println("更新成功！");
                    break;
            }
        }
    }


    //查找的房屋id的地址
    public void seekhouse(int id_seek){
        if(id_seek>houseNumber||id_seek<1){
            System.out.println("暂无此房屋，请重新输入！");
        }else{
            for (int i = 0; i<=id_seek; i++) {
                if(i==id_seek) {
                    System.out.println(houses[i-1]);
                }else{
                    continue;
                }
            }
        }
    }


    //索引寻找——找到执行/没找到退出
    public boolean delhouse(int delid){
        //内部del方法：
        int index=0;
        for (int i = 0; i < houseNumber; i++) {
            if(houses[i].getId()==index){
                index=i;
            }
        }
        if(index==-1){return false;}
        for(int i=index;i<houseNumber-1;i++){
            houses[i]=houses[i+1];
        }
        houses[--houseNumber]=null;
        return true;
    }
    public house_arr(int size) {
        houses = new house[size];
        houses[0] = new house(1, "alfba", "23432", "afs;nlcas", 6545, "未出租");

    }

    //判断是否还能继续添加信息
    public boolean informantion(house newhouse){
        if(idhouse==houses.length){
            System.out.println("达到了录入上限，不能再录入了");
            return false;
        }
        //添加的信息放在数组 houses最后一个位置
        houses[houseNumber]=newhouse;
        houseNumber++;
        System.out.println("当前共有房子"+houseNumber+"个");

        // id编号的编号+给新房子分配编号
        newhouse.setId(++idhouse);
        return true;
    }
    public house[] list(){
        return houses;
    }

}
