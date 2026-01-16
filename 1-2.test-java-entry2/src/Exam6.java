public class Exam6 {
    public static void main(String[] args) {
        
    String space = "";

    for(int i = 1; i <= 9; i++){
        
        for(int j = 1; j <= 9; j++){
            
            // 出力時の「1の位」の位置を揃えるための処理
            if((i * j) >= 10){
                // 10以上の場合、スペース1文字（値の同士の間隔を空けるため）
                space = " ";
            }else{
                // 10未満の場合、スペース2文字（値の間隔に加え、10の位を埋めるため）
                space = "  ";
            }

            System.out.print(space + i * j);
        }
        // 出力結果の改行のため
        System.out.println();
    }

    }
}
