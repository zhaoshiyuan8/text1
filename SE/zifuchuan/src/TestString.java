public class TestString {
    public static void main1(String[] args) {
        int x = 10;
        int y = 10;
        System.out.println(x == y);
        //直接赋值法
        String a = "hello java";
        String b = "hello java";
        System.out.println(a ==b);
        //构造方法
        String c = "Bit";
        String d = "Bit";
        System.out.println(c == d);
        String e = "hello java";
        String f = "hello java";
        System.out.println(f .equals(e) );
        /*
        ==  数值比较   基本数据类型数值  引用数据类型地址
        equals  字符串内容比较
        .intern()字符串入字符串常量池
         */
        String g = "Java is best";
        String str1 = new String("Java is best").intern();
        System.out.println(str1 == g);
    }

    public static void printArray(String[] args){
        for (int i = 0; i <args.length ; i++) {
            System.out.println(args[i]);
        }
    }
    public static void main2(String[] args) {
        System.out.println("A".equals("A"));
        System.out.println("A".equals("a"));
        System.out.println("A".equalsIgnoreCase("a"));
        System.out.println("A".compareTo("a"));
        System.out.println("A".compareTo("A"));
        System.out.println("一".compareTo("王"));
        System.out.println("字符串拆分");
        String str2 = "Hello world Java is Best";
        String[] s = str2.split(" ");
        printArray(s);
        String[] s1 = str2.split(" ",2);
        printArray(s1);
        System.out.println("多次拆分");


    }

    public static void main3(String[] args) {
        StringBuffer sb = new StringBuffer();
        StringBuffer sb1 = sb.append(1);
        //
        System.out.println(sb == sb1);
        sb1.append("Hello")
                .append("world")
                .append("!!");
        System.out.println(sb.toString());



    }

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello World");
        System.out.println(sb.reverse());
        System.out.println(sb.delete(1,5));
        System.out.println(sb.insert(1,"lrow"));
        System.out.println(sb.reverse());
        //字符串数组拼接成字符串，每个元素用逗号分隔
        String[] str = new String[]{"java SE","java EE","MySQL"};
        StringBuilder sb1 = new StringBuilder();
        for (int i = 0; i < str.length; i++) {
            sb1.append(str[i])
                    .append(",");
        }
        sb1.setLength(sb1.length()-1);
        System.out.println(sb1);
    }
}
