package jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

public class AbstractJdbcTemplateImpl extends AbstractJdbcTemplate {
    @Override
    public <T> T handlerResult(ResultSet resultSet) {
StringBuilder sb = new StringBuilder();
      try {
          while (resultSet.next()) {
              int id = resultSet.getInt("id");
              String name = resultSet.getString("name");
              Timestamp creatTime = resultSet.getTimestamp("create_Time");
              Timestamp modifyTime = resultSet.getTimestamp("midify_Time");
              sb.append(id+""+name+""+creatTime+""+modifyTime);
              sb.append("\n");
          }
      }catch (SQLException e) {
      }
              return (T)sb.toString();
      }


    @Override
    public <T> T handlerResult(int effect) {

        return (T) Integer.valueOf(effect);
    }

    public static void main(String[] args) {
        AbstractJdbcTemplate template = new AbstractJdbcTemplateImpl();
       String rs = template.execute("select id,name,created_Time,modify_Time" +
                "from memo_group");
        System.out.println(rs);
    }
}
