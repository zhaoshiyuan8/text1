public class TestUSB {
    public static void main(String[] args) {
        Computer computer = new Computer();
        USB printer = new Printer();
        computer.plugin(printer);
        USB udisk = new Udisk();
        computer.plugin(udisk);
    }
}
interface USB{
    /*
    安装驱动
     */
    void setup();
    //工作
    void work();
}
class Computer{
    public void plugin(USB usb){
        usb.setup();
        usb.work();
    }
}
class Printer implements USB{

    @Override
    public void setup() {
        System.out.println("安装打印机驱动");
    }

    @Override
    public void work() {
        System.out.println("打印机正常工作");
    }

}
class  Udisk implements USB{

    @Override
    public void setup() {
        System.out.println("安装U盘驱动");
    }

    @Override
    public void work() {
        System.out.println("U盘正常工作");
    }
}


