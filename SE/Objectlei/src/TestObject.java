import java.util.*;
public class TestObject {
    public static void main3(String[] args) {
        /*
         1.引用数据类型
         2.JDK提供的String
         3.JDK Object  所有类的父类
         */
        String str = new String("Hello World");
        Person person = new Person("张三",19);
        Car car = new Car();
        Student student = new Student("李四",20);
        print(str);
        print(person);
        print(car);
        print(student);

    }


    public static void main4(String[] args) {
        Person p1  = new Person("zhangsan",19);
        Person p2 = new Person("zhangsan",19);
        System.out.println(p1 == p2);
        System.out.println();
        System.out.println(p1.equals(p2));

    }

    public static void main5(String[] args) {
        /*Object object = new int[]{1,2,3};
        int[] intArray = (int[])object;
        for (int i = 0; i <intArray.length ; i++) {
            System.out.print(intArray[i]);
        }
        System.out.println();*/
       /* A a = new B();
        Object obj = a;
        System.out.println(a);
       Object obj = 15;//int 基本数据类型
        int a = (int) obj;
        //装箱
       Integer intWapper = new Integer(20);
       Object obj = intWapper;
       Integer intWapper1 = (Integer)obj;
       //拆箱
       int b = intWapper1.getVal();
        System.out.println(b);*/
       /*Integer num = new Integer(25);//装箱
        System.out.println(num);
       int val = num.intValue();//拆箱
        System.out.println(val);
       Integer num = 25;
        System.out.println(num);
        System.out.println(++num*5);*/
        Integer num1 = new Integer(10);
        Integer num2 = new Integer(10);
        Integer num3 = Integer.valueOf(15);
        Integer num4 = Integer.valueOf(15);
        Integer num5 = Integer.valueOf(666);
        Integer num6 = Integer.valueOf(666);
        Integer num7 = 666;
        System.out.println(num1 == num2);//false
        System.out.println(num1 == new Integer(10));//false
        System.out.println(num1.equals(new Integer(10)));//true
        System.out.println(num1 == num3);//false
        System.out.println(num3 == num4);//false
        System.out.println(num5 == num6);//false
        System.out.println(num5 == num7);//false
        System.out.println(num6 == num7);//false

    }

    public static void main(String[] args) throws NumberFormatException{
      /*  String str = "123.14";
       Integer intval = Integer.parseInt(str);
        System.out.println(intval);*//*
      Double doubleval = Double.parseDouble(str);
        System.out.println(doubleval);*/
        /*String str = "true";
        Boolean booleanVal = Boolean.parseBoolean("false");
        System.out.println(booleanVal);*/
        /*System.out.println(Boolean.parseBoolean("true"));
        System.out.println(Boolean.parseBoolean("false"));
        System.out.println(Boolean.parseBoolean("False"));
        System.out.println(Boolean.parseBoolean("True"));
        System.out.println(Boolean.parseBoolean("abc"));
        System.out.println(Boolean.parseBoolean("1234"));*/
        /*String str = "123aassa";
        double num = Double.parseDouble(str);
        System.out.println(num);*/
    }
    public static void print(Object object){
        System.out.println(object);
    }
}
interface  A{

}
class  B implements A{

}
class Person{
    private  String name;
    private  int age;
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    //Person 继承了Object 覆写toString println 打印对象时调用toString
    public String toString(){
        return " name: "+this.name+" age: "+this.age;
    }

    public String getName() {

        return this.name;
    }

    //equals在字符串中比内容
    //Person 类中equals比name
   /* public boolean equals(Object that){
        if (this == that){
            return  true;
        }
        if (that instanceof Person){
            Person thatPerson = (Person)that;
            return this.name.equals(thatPerson.name);//&&this.age == thatPerson.age;
        }
        return false;
    }
*/
}
class IntWapper{
    private int val;
    public IntWapper(int val){
        this.val = val;
    }

    public int getVal() {
        return val;
    }
}
class Car{


}
class Student extends Person{

    public Student(String name, int age) {
        super(name, age);
    }
}