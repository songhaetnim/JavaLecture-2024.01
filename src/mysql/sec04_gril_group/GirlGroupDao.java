package mysql.sec04_gril_group;

import java.sql.Connection;
import java.util.Properties;

import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.xdevapi.PreparableStatement;

public class GirlGroupDao {
	private String connStr;
	   private String user;
	   private String password;
	   private Connection conn;
	   
	   public GirlGroupDao() {
	      String path = "C:/Workspace/Java/lesson/src/mysql/mysql.properties";
	      try {
	         Properties prop = new Properties();
	         prop.load(new FileInputStream(path));
	         String host = prop.getProperty("host");
	         String port = prop.getProperty("port");
	         String database = prop.getProperty("database");
	         this.connStr = "jdbc:mysql://" + host + ":" + port + "/" + database;
	         this.user = prop.getProperty("user");
	         this.password = prop.getProperty("password");
	         this.conn = DriverManager.getConnection(connStr, user, password);

	      } catch (Exception e) {
	         e.printStackTrace();
	      }
	   }
	   
	   public void close() {
	      try {
	         conn.close();
	      } catch (SQLException e) {
	         e.printStackTrace();
	      }
	   }
	}
}

public GrilGroup getGrilGroupByGid(int gid) {
	String sql ="select * from girl_group where gid=?";
	GRILGroup gg = new GrilGroup();
	try {
		PreparableStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, gid);
		
		Resultset rs = pstmt.executeQuery();
		while (rs.next());
		gg.setGid(rs.getInt(1));
		gg.setName(rs.getSrting(2));
		//gg.setDebut(LocalDate)
		String debutStr = rs.getString(3);
		
	} catch (Exception e) {
		// TODO: handle exception
	}
}
