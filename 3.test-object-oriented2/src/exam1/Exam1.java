package exam1;

public class Exam1 {
    public static void main(String[] args) {
        
        // SuperCarのメソッド実行
        Car superCar = new SuperCar();
        superCar.setName("フェラーリ");
        superCar.putOnGas();
        superCar.run();

        // EcoCarのメソッド実行
        Car ecoCar = new EcoCar();
        ecoCar.setName("プリウス");
        ecoCar.putOnGas();
        ecoCar.run();

    }
}
