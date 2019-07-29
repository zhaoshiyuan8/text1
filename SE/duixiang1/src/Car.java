public class Car {
    private String brand;
    private int seat;
    private double oilConsumption;
    public Car(String brand,int seat,double oilConsumption){
        this.brand = brand;
        this.seat = seat;
        this.oilConsumption = oilConsumption;
    }
    public void speed(){
        System.out.println("速度为：60km/h");
    }
    public void translate(){
        System.out.println("运输");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public double getOilConsumption() {
        return oilConsumption;
    }

    public void setOilConsumption(double oilConsumption) {
        this.oilConsumption = oilConsumption;
    }

    @Override
    public String toString() {
        return "Car:" +"/t"+
                "brand='" + brand + '\'' +
                ", seat=" + seat +
                ", oilConsumption=" + oilConsumption +
                ';';
    }

    public static void main(String[] args) {
        Car[] cars = new Car[3];
        cars[0] = new Car("奔驰",4,2.5);
        cars[1] = new Car("宝马",4,2.2);
        cars[2] = new Car("兰博基尼",2,2.8);
        System.out.println(cars[0]);
        cars[1].setSeat(2);
        System.out.println(cars[1]);
        System.out.println(cars[2]);
    }
}
