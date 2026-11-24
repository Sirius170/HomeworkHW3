public class p26{
    public static void main(String[] args){
        // 準備父類別的陣列
        Car cars[];
        cars = new Car[2];

        cars[0] = new Car();        
        cars[1] = new RacingCar();

        for(int i=0; i<cars.length; i++){
            Class cl = cars[i].getClass();
            System.out.println("第"+(i+1)+"個物件的類別是"+cl);
        } 
    }
}


// 父類別
class Car{
    // 將父類別成員設為保護成員
    protected int num;
    protected double gas;
    
    public Car(){
        num = 0;
        gas = 0.0;
        System.out.println("生產了車子");
    }
}

// 子類別(賽車繼承汽車)
class RacingCar extends Car{
    // 子類別的建構式
    public RacingCar(){
        System.out.println("生產了賽車");
    }
}