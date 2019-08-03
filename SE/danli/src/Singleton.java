public class Singleton {
    /*
    单例设计模式
    1.一个类只能实例化一个对象
    写法：
    1.构造方法私有
    2.写一个公开的静态方法实例化对象
    3.私有的静态属性类型   是单例类型
    方式：
    1.饿汉式
    2.懒汉式
     */
    //private static Singleton instance;//= new Singleton();
    private final static Singleton instance = new Singleton();
    private Singleton(){

    }
    /*public static Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }*/
    public static Singleton getInstance(){
        return instance;
    }
}
