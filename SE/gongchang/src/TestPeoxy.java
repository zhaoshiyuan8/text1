public class TestPeoxy {
    public static void main(String[] args) {
        //面向接口编程
        Subject realSubject = new RealSubject();
        System.out.println("扩展之前的业务");
        realSubject.buyComputer();
        System.out.println("扩展之后的业务");
        Subject proxySubject = new ProxySubject(realSubject);
        proxySubject.buyComputer();
    }
}
/*
代理设计模式：
1.提供一个接口，定义业务功能
2.真正的业务类，实现接口
3.扩展真正的业务类，提供一个代理类，实现接口
 */
interface  Subject{
    //买电脑
    void buyComputer();
}
//具体的业务实现
class RealSubject implements Subject{

    @Override
    public void buyComputer() {
        System.out.println("购买电脑");
    }
}
class ProxySubject implements Subject{
    private Subject target;
    public ProxySubject(Subject target){
        this.target = target;
    }
    @Override
    public void buyComputer() {
        System.out.println("调研");
        //原有的业务
        this.target.buyComputer();
        System.out.println("售后");
    }
}