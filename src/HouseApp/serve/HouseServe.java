package HouseApp.serve;

import HouseApp.model.House;
import HouseApp.utility.Utility;

import java.util.Date;

public class HouseServe {
    private House[] houses;
    private int houseNum = 0;
    private int houseId = 0;

    public HouseServe(int size) {
        houses = new House[size];
    }

    /**
     * 功能：添加房源信息到数组
     * @param house:用户输入房源信息
     */
    public void add(House house) {
        if(houseNum >= houses.length){
            System.out.println("系统房源已满");
            return;
        }
        houses[houseNum++] = house;
        houses[houseNum-1].setId(++houseId);
        System.out.println("-----------房屋添加完毕-----------");
    }

    /**
     * 功能：调用House类的toString方法
     */
    public House[] list() {
        return houses;
    }

    /**
     * 功能：寻找序号相同的House类并返回
     * @param find_num:需要寻找的类的序号
     * @return 找到该条信息返回House类，否则返回null
     */
    public House find(int find_num) {
        for (int i = 0; i < houseNum; i++) {
            if(find_num == houses[i].getId()) {
                return houses[i];
            }
        }
        return null;
    }

    /**
     * 功能：删除房源信息
     * @param del_num:需要删除的序号
     * @return 判断是否查找到该房源
     */
    public boolean del(int del_num) {
        for (int i = 0; i < houseNum; i++) {
            if (del_num == houses[i].getId()) {
                for (int j = i; j < houseNum -1; j++) {
                    houses[j] = houses[j+1];
                }
                houses[--houseNum] = null;
                return true;
            }
        }
        return false;
    }

    /**
     * 功能：编辑指定房源
     * @param edit_num:需要编辑的房源序号
     * @return 判断是否成功修改该房源
     */
    public boolean edit(int edit_num) {
        for (int i = 0; i < houseNum; i++) {
            if(edit_num == houses[i].getId()) {
                System.out.print("姓名(" + houses[i].getName() + ")：");
                houses[i].setName(Utility.readString(10));
                System.out.print("电话(" + houses[i].getPhone() + ")：");
                houses[i].setPhone(Utility.readString(10));
                System.out.print("地址(" + houses[i].getAddress() + ")：");
                houses[i].setAddress(Utility.readString(10));
                System.out.print("租金(" + houses[i].getCost() + ")：");
                houses[i].setCost(Utility.readInt(10));
                System.out.print("状态(" + houses[i].getTender() + ")：");
                houses[i].setTender(Utility.readString(10));
                return true;
            }
        }
        return false;
    }

    public boolean exit(char confirm) {
        if(confirm == 'Y') {
            return true;
        }else {
            return false;
        }
    }
}
