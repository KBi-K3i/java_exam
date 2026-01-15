public class Exam3 {
    public static void main(String[] args) {
        int subTotalForItem1;
        int subTotalForItem2;
        int subTotal;
        final double TAX_RATE = 0.1;
        int consumptionTax;
        int totalPrice;

        // 小計の計算
        subTotalForItem1 = 200 * 3;
        subTotalForItem2 = 250 * 4;
        subTotal = subTotalForItem1 + subTotalForItem2;
        System.out.println("小計\n" + subTotal + "円");

        // 消費税分の計算
        consumptionTax = (int)(subTotal * TAX_RATE);
        System.out.println("消費税\n" + consumptionTax + "円");

        // 合計金額の計算
        totalPrice = subTotal + consumptionTax;
        System.out.println("合計金額\n" + totalPrice + "円");
    }
}
