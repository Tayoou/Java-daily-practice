package HouseApp.view;

import HouseApp.model.House;
import HouseApp.serve.HouseServe;
import HouseApp.utility.Utility;

public class HouseView {
    private HouseServe houseServe = new HouseServe(10);
    private boolean exit_flag = true;

    public boolean isExit_flag() {
        return exit_flag;
    }

    public void setExit_flag(boolean exit_flag) {
        this.exit_flag = exit_flag;
    }

    /**
     * 功能：显示系统主页面
     */
    public void mainMenu() {
        System.out.println("-----------房屋出租系统-----------");
        System.out.println("\t\t1 新 增 房 源");
        System.out.println("\t\t2 查 找 房 屋");
        System.out.println("\t\t3 删 除 房 屋");
        System.out.println("\t\t4 修 改 房 屋 信 息");
        System.out.println("\t\t5 房 屋 列 表");
        System.out.println("\t\t6 退       出");

        System.out.print("请选择(1-6):");
        int choice = Utility.readInt(0);

        switch (choice) {
            case 1:
                addView();
                break;
            case 2:
                findView();
                break;
            case 3:
                delView();
                break;
            case 4:
                editView();
                break;
            case 5:
                listView();
                break;
            case 6:
                exitView();
                break;
        }
    }

    /**
     * 功能：添加房源
     */
    public void addView() {
        System.out.println("-----------添加房屋-----------");
        System.out.print("姓名：");
        String name = Utility.readString(10,"错误姓名");
        System.out.print("电话：");
        String phone = Utility.readString(10,"错误号码");
        System.out.print("地址：");
        String address = Utility.readString(10,"错误地址");
        System.out.print("月租：");
        int cost = Utility.readInt(10);
        System.out.println("状态(未出租/已出租)：");
        String tender = Utility.readString(10,"错误金额");
        House house = new House(name, phone, address, cost, tender);
        houseServe.add(house);
    }

    /**
     * 功能：显示房屋列表
     */
    public void listView() {
        System.out.println("-----------房屋列表-----------");
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态(未出租/已出租)");
        House[] houses = houseServe.list();
        for (int i = 0; i < houses.length; i++) {
            if(houses[i] == null) {
                return;
            }
            System.out.println(houses[i]);
        }
        System.out.println("-----------显示完成-----------");
    }

    /**
     * 功能：查找房源
     */
    public void findView() {
        System.out.println("-----------查找房源-----------");
        System.out.println("请输入你要查找的id：");
        int find_num = Utility.readInt();
        House house = houseServe.find(find_num);
        if(house != null) {
            System.out.println(house);
        }else {
            System.out.println("没有找到该条房源");
        }
    }

    /**
     * 功能：删除房源
     */
    public void delView() {
        System.out.println("-----------删除房屋-----------");
        System.out.print("请选择待删除房屋编号(-1退出)：");
        int del_num = Utility.readInt();
        char confirm = Utility.readConfirmSelection();
        if(confirm == 'Y'){
            boolean result = houseServe.del(del_num);
            if(result) {
                System.out.println("删除成功！");
            }else {
                System.out.println("删除失败，没有找到该房源");
            }
        }
    }

    /**
     * 功能：修改房源信息
     */
    public void editView() {
        System.out.println("-----------修改房屋-----------");
        System.out.print("请选择待修改房屋编号(-1退出):");
        int edit_num = Utility.readInt();
        if(houseServe.edit(edit_num)) {
            System.out.println("修改成功");
        }else {
            System.out.println("修改失败");
        }
    }

    public void exitView() {
        char exit = Utility.readConfirmSelection();
        if(houseServe.exit(exit)) {
            exit_flag = false;
            System.out.println("你退出了程序....");
        }
    }
}
