import java.time.LocalDate;

public class Exam5 {
    
    public static void main(String[] args) {
        
        // 誕生日のデータを用意
        LocalDate myBirthday = 
            LocalDate.of(1996, 4, 24);

        // データを出力
        System.out.println(
            "私の誕生日は" +
            myBirthday.getYear() + "年" +
            myBirthday.getMonthValue() + "月" +
            myBirthday.getDayOfMonth() + "日" +
            "です"
        );

    }


}
