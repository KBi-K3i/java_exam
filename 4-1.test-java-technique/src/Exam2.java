public class Exam2 {
    public static void main(String[] args) {
        
        // 処理に使用する文字列を用意
        String famousSpeech = "Stay hungry, stay foolish.";
        String keyword = "hungry";

        // キーワードが何文字目（インデックス）から始まるかを出力
        System.out.println(
            keyword + "は" +
            famousSpeech.indexOf(keyword) + "番目から始まります"
        );
    }
}
