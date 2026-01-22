package exam3;

public class DeLorean implements AirPlane, Car, TimeMachine{

    // メソッドのオーバーライド
    @Override
    public void run() {
        System.out.println("デロリアンが走る！");
    }
    @Override
    public void fly() {
        System.out.println("デロリアンが飛ぶ！");
    }
    @Override
    public void timeTravel() {
        System.out.println("デロリアンがタイムテレポート！");
    }

    // このクラスの各メソッドを実行
    public void engineStart(){
        this.run();
        this.fly();
        this.timeTravel();
    }

}
