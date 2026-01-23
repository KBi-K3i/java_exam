package exam1;

public class Exam1 {
    public static void main(String[] args) {
        
        // SuperCarのメソッド実行
        Car car = new Car();

        car = new SuperCar();
        car.setName("フェラーリ");
        car.putOnGas();
        car.run();
        
        // EcoCarのメソッド実行
        car = new EcoCar();
        car.setName("プリウス");
        car.putOnGas();
        car.run();

    }
}
