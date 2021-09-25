package HouseApp;

import HouseApp.model.House;
import HouseApp.serve.HouseServe;
import HouseApp.view.HouseView;

public class HouseApp {
    public static void main(String[] args) {
        HouseView view = new HouseView();
        while(view.isExit_flag()) {
            view.mainMenu();
        }
    }
}
