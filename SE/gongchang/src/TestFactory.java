import java.util.Scanner;

public class TestFactory {
    public static void main(String[] args) {
        Client client = new Client();
        /*Computer computer = new SurfaceBookComputer();
        Computer computer = new AlienwareComputer();
        client.buyComputer(computer);*/
        System.out.println("请输入您购买的计算机类型：mac，surface，Alienware");
        Scanner scanner = new Scanner(System.in);
        String type = scanner.next();
        Computer computer = ComputerFactory.createComputer(type);
        if (computer == null){
            System.out.println("工厂不能生产指定类型的计算机"+type);

        }else {
            client.buyComputer(computer);
        }
    }
}
class Client{
    public void buyComputer(Computer computer){
        computer.printComputer();
    }
}
/*
简单工厂
1.客户端创建对象的逻辑，放到一个静态方法中，简单工厂类
2.缺点：新增类型，需要修改工厂类的逻辑
3.优点：客户端和具体的接口实现类的示例对象逻辑解耦
 */
class  ComputerFactory{
    public static Computer createComputer(String type){
        switch (type){
            case "mac":{
                return new MacProComputer();
            }
            case "surface":{
                return new SurfaceBookComputer();
            }
            case "Alienware":{
                return new AlienwareComputer();
            }default:
                return null;
        }
    }
}
interface Computer{
    //打印具体的计算机信息
    void printComputer();
}
class MacProComputer implements Computer{

    @Override
    public void printComputer() {
        System.out.println("Mac Pro   漂亮，贵， 好用");
    }
}
class SurfaceBookComputer implements Computer{

        @Override
        public void printComputer() {
            System.out.println("Surface 屏幕可旋转，微软出品");
        }
}
class AlienwareComputer implements Computer{

    @Override
    public void printComputer() {
        System.out.println("Alienware  便宜，配置高，物美价廉");
    }
}
