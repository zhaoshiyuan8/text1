public class TestInnerClass2 {
    public static void main(String[] args) {
        Outer1.Inner inner = new Outer1.Inner();
        inner.print();
    }
}
class Outer1{
    private static String message = "Outer的消息";
    /**静态内部类
     *1.static 修饰类
     * 2.静态内部类不能访问外部类的非静态属性和方法
     * 3.静态内部类使用：
     *      外部类.内部类   对象名 = new 外部类.内部类（）;
     *          Outer1.Inner inner = new Outer1.Inner();
     */
    static class Inner{
        public void print(){
            System.out.println("static Inner 的消息");
            System.out.println(message);
           //错误： System.out.println(Outer.this.message);
        }
        public void print(int a){
            System.out.println(a);
        }
    }
    public void print(){
        Inner inner = new Inner();
    }
}
