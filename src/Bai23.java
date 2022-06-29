import java.util.ArrayList;

public class Bai23 {
    public static void main(String[] args) {
        ArrayList<Menu> listMenu = new ArrayList<>();
        listMenu.add(new Menu(1,"Thể thao",0));
        listMenu.add(new Menu(2,"Xã hội",0));
        listMenu.add(new Menu(3,"Thể thao trong nước",1));
        listMenu.add(new Menu(4,"Giao thông",2));
        listMenu.add(new Menu(5,"Môi trường",2));
        listMenu.add(new Menu(6,"Thể thao quốc tế",1));
        listMenu.add(new Menu(7,"Môi trường đô thị",5));
        listMenu.add(new Menu(8,"Giao thông ùn tắc",4));

        printMenu(listMenu);


    }

    // 23. "Hãy viết function printMenu(menus), đầu vào là mảng menu, in ra menu phân cấp cha con,
    //mỗi menu con thụt vào hai '--' so với menu cha của nó."

    public static void printMenu(ArrayList<Menu> list){
        for (Menu menu: list
             ) {
            if (menu.getParent_id() == 0) {
                System.out.println(menu.getTitle());
                for (Menu menu1 : list
                ) {
                    if (menu.getId() == menu1.getParent_id()){
                        System.out.println("--"+menu1.getTitle());
                        for (Menu menu2: list
                        ) {
                            if(menu1.getId()== menu2.getParent_id()){
                                System.out.println("----"+menu2.getTitle());
                            }
                        }
                    }
                }
            }

        }
    }
}
