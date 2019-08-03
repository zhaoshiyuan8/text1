import java.security.PublicKey;

public class TestFinal {

    public static void main(String[] args) {
        final int a = 10;

    }
}
/**
 * 1.final 修饰类，不能被继承
 * 2.final 修饰的方法，不能被覆写
 * 3.final 修饰的变量，不能再次赋值==》
 * 4.static final 修饰的属性，常量，大写单词 下划线分割
 * 5.final 修饰的属性，必须初始化
 * 声明并赋值（完成初始化）
 * 构造方法初始化（成员属性）
 * 代码块（构造块，静态代码块）
 * */
 class E{
    private final int age ;
    public E(int age){
        this.age = age;
    }
    public void print(){

    }
}
class F extends E{

    public F(int age) {
        super(age);
    }
}
