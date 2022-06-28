import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class run {

    public static void main(String[] args) {

        // list Category
        ArrayList<Category> listCategory = new ArrayList<>();
        listCategory.add(new Category(1, "Comuter"));
        listCategory.add(new Category(2, "Memory"));
        listCategory.add(new Category(3, "Card"));
        listCategory.add(new Category(4, "Acsesory"));

        // list Product
        ArrayList<Product> listProduct = new ArrayList<>();
        listProduct.add(new Product("CPU", 750, 10, 1));
        listProduct.add(new Product("RAM", 50, 2, 2));
        listProduct.add(new Product("HDD", 70, 1, 2));
        listProduct.add(new Product("Main", 400, 3, 1));
        listProduct.add(new Product("Keyboard", 30, 8, 4));
        listProduct.add(new Product("Mouse", 25, 50, 4));
        listProduct.add(new Product("VGA", 60, 35, 3));
        listProduct.add(new Product("Monitor", 120, 28, 2));
        listProduct.add(new Product("Case", 120, 28, 5));

        Scanner scanner = new Scanner(System.in);

        System.out.println("Trước khi sắp xếp");
        for (Product product: listProduct
             ) {
            System.out.println(product.getName()+"\t"+product.getPrice()+"\t"+product.getQuality()+"\t"+product.getCategoryId());
        }
        System.out.println("Sau khi sắp xếp");
        //sortByPrice(listProduct);
        sortByName(listProduct);
        for (Product product: listProduct
        ) {
            System.out.println(product.getName()+"\t"+product.getPrice()+"\t"+product.getQuality()+"\t"+product.getCategoryId());
        }

        /*do {
            switch (Chon()) {
                case 1: {
                    // 4. Hãy viết function findProduct(listProduct, nameProduct)
                    // trả về product có tên = nameProduct truyền vào
                    System.out.print("Nhập sản phẩm cần tìm: ");
                    String nameProduct = scanner.next();
                    if (findProduct(listProduct, nameProduct) == null) {
                        System.out.println("\nSản phẩm cần tìm không tồn tại");
                    } else {
                        System.out.println(("\nSản phẩm cần tìm là: "
                                + "\nName:" + findProduct(listProduct, nameProduct).getName()
                                + "\nPrice: " + findProduct(listProduct, nameProduct).getPrice()
                                + "\nQuality: " + findProduct(listProduct, nameProduct).getQuality()
                                + "\nCategoryId: " + findProduct(listProduct, nameProduct).getCategoryId()
                        ));
                    }
                    break;
                }
                case 2: {
                    // 5. Hãy viết function findProductByCategory(listProduct, categoryId)
                    // trả về danh sách product có categoryId = categoryId truyền vào
                    ArrayList<Product> listcategoryId = new ArrayList<>();
                    //System.out.print("Nhập Id loại sản phẩm cần tìm: ");
                    Random random = new Random();
                    int categoryIdProduct = 0;
                    do {
                        categoryIdProduct = random.nextInt(10);
                    }while (!(categoryIdProduct >= 0));
                    *//*int categoryIdProduct = 0;
                    do {
                        try {
                            categoryIdProduct = Integer.parseInt(scanner.next());
                        } catch (Exception ex) {
                            System.out.println("\n" + ex.getMessage());
                        }
                        if (categoryIdProduct < 0)
                            System.out.print("\t\tChọn lại: ");
                    } while (!(categoryIdProduct >= 0));*//*
                    if (findProductByCategory(listProduct, categoryIdProduct).size() == 0) {
                        System.out.println("Không có sản phẩm nào có Id trên");
                    } else {
                        listcategoryId = findProductByCategory(listProduct, categoryIdProduct);
                        System.out.println("\nSố lượng sản phẩm có Id trên là: " + listcategoryId.size());
                        System.out.println("\nDanh sách sản phẩm có Id trên:");
                        for (int i = 0; i < listcategoryId.size(); i++) {
                            System.out.println("\nSản phẩm " + (i + 1));
                            System.out.println("Name:" + listcategoryId.get(i).getName());
                            System.out.println("Price:" + listcategoryId.get(i).getPrice());
                            System.out.println("Quality:" + listcategoryId.get(i).getQuality());
                            System.out.println("CategoryId:" + listcategoryId.get(i).getCategoryId());
                        }
                    }
                    break;
                }
                case 3: {
                    // 6 Hãy viết function findProductByPrice(listProduct, price)
                    // trả về danh sách tên product có giá <= price truyền vào
                    ArrayList<String> listcategoryPrice = new ArrayList<>();
                    System.out.print("Nhập giá sản phẩm max: ");
                    double maxPrice = 0;
                    do {
                        try {
                            maxPrice = Double.parseDouble(scanner.next());
                        } catch (Exception ex) {
                            System.out.println("\n" + ex.getMessage());
                        }
                        if (maxPrice < 0)
                            System.out.print("\t\tChọn lại: ");
                    } while (!(maxPrice >= 0));
                    if (findProductByPrice(listProduct, maxPrice).size() == 0) {
                        System.out.println("Không có sản phẩm nào phù hợp với giá tiền");
                    } else {
                        listcategoryPrice = findProductByPrice(listProduct, maxPrice);
                        System.out.println("\nSố lượng sản phẩm phù hợp với giá trên là: " + listcategoryPrice.size());
                        System.out.println("\nDanh sách tên sản phẩm phù hợp với giá trên:");
                        for (int i = 0; i < listcategoryPrice.size(); i++) {
                            System.out.println((i + 1) + ": " + listcategoryPrice.get(i));
                        }
                    }
                    break;
                }

                case 4:{
                    System.exit(0);
                    break;
                }

                default: {
                    System.out.println("\nNhập lại !!!");
                    break;
                }
            }
        } while (true);*/
    }

    // 4
    public static Product findProduct(ArrayList<Product> list, String name) {
        for (Product product : list
        ) {
            if ((name.equalsIgnoreCase(product.getName()))) {
                return product;
            }
        }
        return null;
    }

    // 5
    public static ArrayList<Product> findProductByCategory(ArrayList<Product> list, int categoryId) {
        ArrayList<Product> listProduct = new ArrayList<>();
        for (Product product: list
             ) {
            if (product.getCategoryId() == categoryId) {
                listProduct.add(product);
            }
        }

        return listProduct;
    }

    // 6
    public static ArrayList<String> findProductByPrice(ArrayList<Product> list, double price) {
        ArrayList<String> listName = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getPrice() <= price) {
                listName.add(list.get(i).getName());
            }
        }
        return listName;
    }


    // 11. "Hãy viết function sortByPrice(listProduct)
    //  trả về danh sách product sắp xếp theo giá từ thấp đến cao. Làm theo thuật toán buble."
    public static void sortByPrice(ArrayList<Product> list){
        for (int i =0; i < list.size() - 1; i++){
            boolean kt = false;
            for (int j = 0; j < list.size() - i -1 ; j++){
                if(list.get(j).getPrice() > list.get(j+1).getPrice()){
                    Product tg = list.get(j);
                    list.set(j,list.get(j+1));
                    list.set(j+1,tg);
                }
            }
        }
    }

    // 12. "Hãy viết function sortByName(listProduct)
    //trả về danh sách product sắp xếp độ dài của tên từ cao đến thấp.
    //Làm theo thuật toán insertion."
    public static void sortByName(ArrayList<Product> list){
        int holePosition;
        Product valueToInsert;

        for(int i = 1; i < list.size(); i++){
            valueToInsert = list.get(i);
            holePosition = i;
            while (holePosition > 0 && list.get(holePosition-1).getName().length() > valueToInsert.getName().length()){
                list.set(holePosition, list.get(holePosition-1));
                holePosition = holePosition -1 ;
            }
            list.set(holePosition, valueToInsert);
        }
    }

    // 13. "Hãy viết function sortByCategoryName(listProduct, listCategory)
    //trả về danh sách product sắp xếp theo category name theo thứ tự abc. .
    //Làm theo thuật toán của bài 12."
    public static void sortByCategoryName(ArrayList<Product> listProduct, ArrayList<Category> listCategory){

    }



    public static int Chon() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\t\t╔==========================================================╗");
        System.out.println("\t\t║                           MENU                           ║");
        System.out.println("\t\t╟==========================================================╢");
        System.out.println("\t\t║  1  ║  Tìm sản phẩm theo tên                             ║");
        System.out.println("\t\t║  2  ║  Tìm sản phẩm theo loại sản phẩm                   ║");
        System.out.println("\t\t║  3  ║  Tìm sản phẩm theo giá                             ║");
        System.out.println("\t\t║  4  ║  Kết thúc                                          ║");
        System.out.println("\t\t╚==========================================================╝");
        System.out.print("\t\tChọn: ");
        int x = 0;
        do {
            try {
                x = Integer.parseInt(sc.nextLine());
            } catch (Exception ex) {
                System.out.println("\n\t\t" + ex.getMessage());
            }
            if (x <= 0 || x > 4)
                System.out.print("\t\tChọn lại: ");
        } while (!(x > 0 && x <= 4));
        return x;
    }


}


