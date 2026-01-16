public class Exam1{
    public static void main(String[] args) {
        
        // 初期化
        int totalScore = 0;

        // 動作確認用の変数の書き換え
        // totalScore = -1;
        // totalScore = 80;
        // totalScore = 79;
        // totalScore = 99;
        // totalScore = 100;
        // totalScore = 100;

        if(totalScore >= 0 && totalScore <= 79){
            System.out.println("追試です");

        }else if(totalScore >= 80 && totalScore <= 99){
            System.out.println("合格です");

        }else if(totalScore == 100){
            System.out.println("満点です");

        }else{
            System.out.println("存在しない点数です");
        }
    }
}