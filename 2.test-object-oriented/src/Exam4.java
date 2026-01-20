public class Exam4 {
    public static void main(String[] args) {
        
        int num1 = 5;
        int num2 = 3;
        
        System.out.println(
            "足し算結果：" + Caluculation.addition(num1, num2)
        );
        
        System.out.println(
            "引き算結果：" + Caluculation.subtraction(num1, num2)
        );

        System.out.println(
            "掛け算結果：" + Caluculation.multiplication(num1, num2)
        );

        System.out.println(
            "割り算結果：" + Caluculation.division(num1, num2)
        );

        System.out.println(
            "剰余算結果：" + Caluculation.remainder(num1, num2)
        );
    }
}
