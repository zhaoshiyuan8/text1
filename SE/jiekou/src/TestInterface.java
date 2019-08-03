

public class TestInterface {
    public static void main(String[] args) {
        Message qq = new QQMessage();
        qq.print();
        System.out.println(Message.MSG);
        QQMessage qqMessage =  (QQMessage)qq;
        qqMessage.print();
        qqMessage.printCompany();
        /*Company company =  qqMessage;
        company.printCompany();*/
    }
}
/*
1.接口  interface
2.常量  抽象方法
常量：省略public static final
方法：省略 public abstract
3.接口无法直接实例化，通过子类完成。子类需要实现接口 implements
4.子类可以实现多个接口,子类实例化对象可以赋值给 任意一个接口类型
5.抽象类可以实现多接口，但是接口不能继承抽象类  接口可以继承接口
6.
 */
interface Message{
    //常量
     String MSG = "java is best";
    //抽象方法
     void print();
}
interface Company{
    void printCompany();

}
class  QQMessage implements Message,Company{
    public void print(){
        System.out.println("这是QQMessage");
    }
    public void printCompany(){
        System.out.println("腾讯出品");
    }
}
