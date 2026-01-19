public class Exam6 {
    public static void main(String[] args) {
        
        // 変数初期化  
        int num1 = 0;
        int num2 = 0;
        char chr;

        // calcメソッドの引数の設定
        num1 = 7;
        num2 = 2;
        chr = '/';

        // 上記の引数に基づいて、calcメソッドを実行。
        calc(num1, num2, chr);

    }
    static int calc(int num1, int num2, char chr){

        int result = 0;

        // 符号によって、計算方法を切り替える。
        switch (chr) {
            case '+':
                result = num1 + num2;
                break;

            case '-':
                result = num1 - num2;
                break;

            case '*':
                result = num1 * num2;
                break;

            case '/':
                result = num1 / num2;
                break;

            default:
                result = -1;
                break;
        }

        System.out.println(
            "第1引数:" + num1 + "、第2引数:" + num2 + "、第3引数:" + chr
        );

        System.out.println("計算結果:" + result);

        return result;

    }
}
