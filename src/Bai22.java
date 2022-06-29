public class Bai22 {
    public static void main(String[] args) {

    }

    // T = a(1+r)^n
    // T tổng vốn + lãi
    // a vốn
    // r %
    // n số tháng
    // 2a = a(1+r)^n
    // 2 = (1+r)^n

    // 22. "Hãy viết function calMonth(money, rate) , trả về số tháng tiền cần gửi tiết kệm để tiền gốc +
    // lãi tăng gấp đôi so với tiền gốc. Money là số tiền gốc, rate là % lãi suất mỗi tháng. ví dụ calMount(1000, 5).
    //Viết bằng 2 cách, đệ qui và không dùng đệ qui"

    /*public static double calMonthDeQuy(double money, double rate){
        double n =0;
        return
    }*/

    public static double callMonthKhongDeQuy(double money, double rate) {
        double n = 0;
        double amount = 0;
        do {
            n++;
            amount = money * Math.pow(1 + rate , n);
        } while (amount - money < money);
        return n;
    }

}
