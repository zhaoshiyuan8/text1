package jdbc;

import java.sql.*;

public abstract class AbstractJdbcTemplate {
    public static void main(String[] args) {
                /*
                * 不变的：
                * 1.加载驱动
                * 2.获取连接
                * 3.创建命令
                * 4.关闭（结果，命令，连接）
                * 变的：
                *1.SQL
                * 2.执行命令
                * 3.处理结果
                *
                * */
            try {
                //1.
                Class.forName("com.mysql.jdbc.Driver");
                //2.JDBC url 协议
                //jdbc:<databaseType>://host:port/<databaseName>?user=xxx&password=xxx
                //jdbc:mysql://127.0.0.1:3306/memo?user = root&password=root
                String url = "jdbc:mysql://127.0.0.1:3306/memo?user =&password=";
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
        public <T> T execute(String sql){
            this.loadDriver();
            this.createConnection();
            this.createStatement();
            Object t;
            //执行SQL
            //假设：CRUD
            if (sql.trim().toUpperCase().startsWith("SELECT")){
                this.resultSet = this.excuteQuery(sql);
              t =  this.handlerResult(resultSet);
            }else {
                int effect = this.executeUpdate(sql);
               t=  this.handlerResult(effect);
            }
            this.close();
            return (T) t;

        }
    Connection connection;
    Statement statement;
    ResultSet resultSet;
        public  void loadDriver(){
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
private  void createConnection(){
        String url = "jdbc:mysql://127.0.0.1:3306/memo";
    try {
         connection = DriverManager.getConnection(url,"root","root"
        );
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
            //创建命令
    private  void createStatement(){
        try {
            this.statement = this.connection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
        private  int executeUpdate(String sql){
            try {
                return  this.statement.executeUpdate(sql);
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return -1;
        }
        private ResultSet excuteQuery(String sql){

            try {
                return this.statement.executeQuery(sql);
            } catch (SQLException e) {
                e.printStackTrace();
            }

            return  null;
        }

        public  abstract  <T> T handlerResult(ResultSet resultSet);
        public abstract  <T> T  handlerResult(int effect);
        private void  close(){
            if (this.resultSet!=null){
                try {
                    this.resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (this.statement!=null){
                try {
                    this.statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (this.connection!= null){
                try {
                    this.connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

}

