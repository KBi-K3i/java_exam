package q2;

import java.lang.reflect.Array;

/**
 * Q2. 文字列を逆転させなさい。確認する文字列はどんなものでも構いません。
 *
 * <pre>
 * (例)
 * "abcde" => "edcba"
 * "酔いしれ占う仲良いあの娘" => " この愛よ叶うなら嬉しいよ"
 * </pre>
 *
 * メソッドreverseを作成しなさい。
 *
 * @author y.morinaga
 */
public class Reverse {

    public static void main(String[] args) {
        //        String reversed = reverse("よいしれうらなうなかよいあのこ");
        //        System.out.println(reversed);

        String text = "あいうえお";
        String reversedText = "";
        
        char[] charArray = text.toCharArray();
        
        int maxIndex = text.toCharArray().length - 1;

        for(int i = maxIndex; i >= 0; i--){
            reversedText += charArray[i];
        }

        System.out.println(text + " の逆転： " + reversedText);

    }

}
