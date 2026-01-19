public class Exam5 {
    public static void main(String[] args) {
        
        int num1 = 5;
        int num2 = 3;
        
        // 足し算
        System.out.println(
            "足し算結果:" + addition(num1, num2)
        );
        
        // 引き算
        System.out.println(
            "引き算結果:" + subtraction(num1, num2)
        );

        // 掛け算
        System.out.println(
            "掛け算結果:" + multiplication(num1, num2)
        );

        // 割り算
        System.out.println(
            "割り算結果:" + division(num1, num2)
        );

        // 剰余算
        System.out.println(
            "剰余算結果:" + remainder(num1, num2)
        );
    }

    static int addition(int num1, int num2){
        return num1 + num2;
    }

    static int subtraction(int num1, int num2){
        return num1 - num2;
    }

    static int multiplication(int num1, int num2){
        return num1 * num2;
    }

    static int division(int num1, int num2){
        return num1 / num2;
    }

    static int remainder(int num1, int num2){
        return num1 % num2;
    }
}
