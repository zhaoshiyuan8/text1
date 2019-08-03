import java.util.Scanner;
public class TextAbstractFactory {

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
          /*  Client client = new Client();
            ComputerFactory1 factory = new MacProComputerFactory1();
            client.buyComputer(factory.createComputer());*/
            Client1 client = new Client1();
            ComputerFactory1  computerFactory1 = new MacProComputerFactory1();
            client.buyComputer1(computerFactory1.createComputer(),computerFactory1.createOperationOS());


        }
    }
    class Client1{
        public void buyComputer1(Computer1 computer1,OperationOS os){
            computer1.printComputer();
            os.printOperationOS();
        }
    }
    /*
    抽象工厂模式


     */
    interface ComputerFactory1{
        Computer1 createComputer();
        OperationOS createOperationOS();
    }
    interface OperationOS{
        void printOperationOS();
    }
    interface Computer1{
        //打印具体的计算机信息
        void printComputer();
    }
    class windows10 implements OperationOS{

        @Override
        public void printOperationOS() {
            System.out.println("Windows10 操作系统，简单，好用");
        }
    }
    class MacOS implements OperationOS{

        @Override
        public void printOperationOS() {
            System.out.println("MacOS 操作系统，漂亮，流畅");
        }
    }
    class MacProComputerFactory1 implements ComputerFactory1 {

        @Override
        public Computer1 createComputer() {
            return new MacProComputer1();
        }

        @Override
        public OperationOS createOperationOS() {
            return new MacOS();
        }
    }
    class MacProComputer1 implements Computer1 {

        @Override
        public void printComputer() {
            System.out.println("Mac Pro   漂亮，贵， 好用");
        }
    }
    class SurfaceBookComputer1 implements Computer1 {

        @Override
        public void printComputer() {
            System.out.println("Surface 屏幕可旋转，微软出品");
        }
    }
    class AlienwareComputer1 implements Computer1 {

        @Override
        public void printComputer() {
            System.out.println("Alienware  便宜，配置高，物美价廉");
        }
    }
    class  SurfaceBookComputerFactory1 implements ComputerFactory1 {

        @Override
        public Computer1 createComputer() {
            return new SurfaceBookComputer1();
        }

        @Override
        public OperationOS createOperationOS() {
            return new windows10();

        }
    }
    class AlienwareComputerFactory1 implements ComputerFactory1 {

        @Override
        public Computer1 createComputer() {
            return new AlienwareComputer1();
        }

        @Override
        public OperationOS createOperationOS() {
            return new windows10();
        }
    }



