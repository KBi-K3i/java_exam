package exam2;

public class Zoo {
    public static void main(String[] args) {
        
        // インスタンス生成
        Goat goat = new Goat();
        Horse horse = new Horse();
        Sheep sheep = new Sheep();

        // 配列へのオブジェクト格納
        Animal animals[] = {sheep, horse, goat};

        // 各オブジェクトのメソッド実行
        for(Animal animal : animals){
            animal.cry();
        }

    }
}
