public class p4{
    public static void main(String[] args){
        RacingCar rccar1;

        // 建立子類別物件
        rccar1 = new RacingCar();

        // 呼叫子類別繼承的方法
        rccar1.setCar(1234, 20.5);

        // 呼叫子類別新增的方法
        rccar1.setCourse(5);
    }
}


// 父類別
class Car{
    private int num;
    private double gas;
    
    public Car(){
        num = 0;
        gas = 0.0;
        System.out.println("生產了車子");
    }

    public void setCar(int n, double g){
        num = n;
        gas = g;
        System.out.println("將車號設為"+num+", 汽油量設為"+gas);
    }

    public void show(){
        System.out.println("車號是"+num);
        System.out.println("汽油量是"+gas);
    }
}

// 子類別(賽車繼承汽車)
class RacingCar extends Car{
    private int course;

    // 子類別的建構式
    public RacingCar(){
        course = 0;
        System.out.println("生產了賽車");
    }

    // 子類別新增的方法
    public void setCourse(int c){
        course = c;
        System.out.println("將賽車編號為"+course);
    }
}