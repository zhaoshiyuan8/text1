package jdbc;

import java.sql.*;

public class MyFirstJdbcCase {
    /*
    1.加载数据库的JDBC驱动（JDBC   API）
    2.创建连接
    3.创建命令
    4.准备SQL语句
    5.执行SQL
    6.处理结果
    7.关闭结果
    8.关闭命令
    9.关闭连接
*/
    public static void main(String[] args) {
        try {
            //1.
            Class.forName("com.mysql.jdbc.Driver");
            //2.JDBC url 协议
            //jdbc:<databaseType>://host:port/<databaseName>?user=xxx&password=xxx
            //jdbc:mysql://127.0.0.1:3306/memo?user = root&password=root
            String url = "jdbc:mysql://62173/memo?user = root & password = 199758";
            Connection connection = DriverManager.getConnection(url);
            //3.
            Statement statement = connection.createStatement();
            //4.
            String sql = "select id,name,created_time,modify_time from memo_group";
            //5.
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()){
               int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                Timestamp creatTime = resultSet.getTimestamp("create_Time");
                Timestamp modifyTime = resultSet.getTimestamp("midify_Time");
                System.out.println(id+""+name+""+creatTime+""+modifyTime);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
