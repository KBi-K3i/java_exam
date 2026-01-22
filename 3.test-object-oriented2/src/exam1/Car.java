package exam1;
public class Car {
    
    // フィールド
    private String name;
    
    // メソッド
    public void putOnGas(){
        System.out.println(this.name + "に給油します");
    }
    public void run(){
        System.out.println("ブーン！車が走ります");
    }

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    
}
