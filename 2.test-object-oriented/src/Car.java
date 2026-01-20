public class Car {
    private int speed = 0;

    public void run(){
        speed += 50;
        System.out.println(
            "走りました。スピードが" + speed + "km/hになりました。"
        );

        if(speed >= 120){
            System.out.println("スピードの出しすぎです。");
        }
    }
}
