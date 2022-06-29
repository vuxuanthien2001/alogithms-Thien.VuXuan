public class Bai21 {
    public static void main(String[] args) {
        System.out.println(calSalaryDeQuy(100,3));
        System.out.println(calSalaryKDeQuy(100,3));
    }

    // 21. "Hãy viết function calSalary(salary, n) , trả về lương của năm thứ n.
    //Biết rằng cứ mỗi năm lương sẽ tăng bằng 10% năm liền trước.
    //Viết bằng 2 cách, đệ qui và không dùng đệ qui"

    public static double calSalaryDeQuy(double salary, double n) {
        if (n < 1){
            return salary;
        }
        return calSalaryDeQuy(salary + (0.1 * salary),n-1);

    }

    public static double calSalaryKDeQuy(double salary, double n) {
        for (int i=0;i<n;i++){
            salary=salary + (0.1 * salary);
        }
        return salary;

    }


}
