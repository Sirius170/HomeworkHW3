public class p11{
    public static void main(String[] args){
        RacingCar rccar1;

        // 建立子類別物件
        rccar1 = new RacingCar();

        rccar1.setCar(1234, 20.5);
        rccar1.setCourse(5);

        rccar1.newShow();
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

    public void setCar(int n, double g){
        num = n;
        gas = g;
        System.out.println("將車號設為"+num+", 汽油量設為"+gas);
    }

    // 父類別的show方法
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

    // 子類別的show方法
    public void newShow(){
        System.out.println("賽車車號為"+num);
        System.out.println("汽油量為"+gas);
        System.out.println("賽車編號為"+course);
    }
}