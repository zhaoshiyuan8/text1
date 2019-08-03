import java.util.Scanner;

public class TestFactoryMethod {
  /*  public static void main(String[] args) {
        Client client = new Client();
        *//*Computer computer = new SurfaceBookComputer();
        Computer computer = new AlienwareComputer();
        client.buyComputer(computer);*//*
        System.out.println("请输入您购买的计算机类型：mac，surface，Alienware");
        Scanner scanner = new Scanner(System.in);
        String type = scanner.next();
        Computer1 computer = ComputerFactory.createComputer(type);
        if (computer == null){
            System.out.println("工厂不能生产指定类型的计算机"+type);

        }else {
            client.buyComputer(computer);
        }*/
  public static void main(String[] args) {
      Client client = new Client();
      ComputerFactory factory = new MacProComputerFactory();
      client.buyComputer(factory.createComputer());
  }
  }


class Client{
    public void buyComputer(Computer1 computer){
        computer.printComputer();
    }
}
/*
工厂方法模式
1.定义一个工厂接口
2.对指定类的创建一个对应的工厂类，实现工厂接口
    优点：新增类型是，扩展工厂类，不需要修改工厂类
    缺点：工厂选择逻辑移动到了客户端
 PS：模式没有绝对的好坏，选择合适的场景
 */
interface ComputerFactory{
    Computer1 createComputer();
}
interface Computer1{
    //打印具体的计算机信息
    void printComputer();
}
class MacProComputerFactory implements ComputerFactory{

    @Override
    public Computer1 createComputer() {
        return new MacProComputer();
    }
}
class MacProComputer implements Computer1 {

    @Override
    public void printComputer() {
        System.out.println("Mac Pro   漂亮，贵， 好用");
    }
}
class SurfaceBookComputer implements Computer1 {

    @Override
    public void printComputer() {
        System.out.println("Surface 屏幕可旋转，微软出品");
    }
}
class AlienwareComputer implements Computer1 {

    @Override
    public void printComputer() {
        System.out.println("Alienware  便宜，配置高，物美价廉");
    }
}
class  SurfaceBookConmuter implements ComputerFactory{

    @Override
    public Computer1 createComputer() {
        return new SurfaceBookComputer();
    }
}
class AlienwareComputerFactory implements ComputerFactory{

    @Override
    public Computer1 createComputer() {
        return new AlienwareComputer();
    }
}

