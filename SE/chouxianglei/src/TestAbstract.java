public class TestAbstract {
    public static void main(String[] args) {
        Person person = new Student();

    }
}

/**
 * 抽象类
 *1.abstrat关键字 修饰类，方法
 * 2.抽象方法只声明，未实现，abstract修饰
 * 3.抽象类无法实例化对象，只能通过子类（非抽象类）
 * 4.抽象类不一定要有抽象方法
 * 5.子类继承抽象类，必须覆写所有的抽象类中的抽象方法
 *                  否则子类必须定义为抽象类
 */
abstract class  Person{

    private String name;
    private  int age;
    public Person(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public abstract String getPersonInfo();
    public abstract String print();
}
class Student extends Person{
    public String getPersonInfo(){
        return ("子类Student实现： "+"姓名："+this.getName()+"年龄："
                +this.getAge());
    }

    @Override
    public String print() {
        return null;
    }
}
