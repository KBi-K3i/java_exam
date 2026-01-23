import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Exam6 {

    public static void main(String[] args) {

        // データの生成
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
        LocalDateTime birthDateTime = LocalDateTime.of(1543, 2, 10, 5, 12);

        // 徳川家康の誕生日をそのまま出力
        System.out.println(
            "徳川家康の誕生日は" + birthDateTime.format(format1) + "です"
        );

        // 加算後の日時を出力（メソッドチェーンを使用）
        System.out.println(
            "1年2ヶ月3日4時間5分後は" +
            birthDateTime
                .plusYears(1)
                .plusMonths(2)
                .plusDays(3)
                .plusHours(4)
                .plusMinutes(5)
                .format(format1)
            + "です"
        );

    }

}
