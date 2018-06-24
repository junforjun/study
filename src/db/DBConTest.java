package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class DBConTest {
	public static void main(String[] args) {
		String url = "jdbc:postgresql://localhost:5432/";
		Properties props = new Properties();
		props.setProperty("user", "postgres");
		props.setProperty("password", "postgres");
		try {
			Connection conn = DriverManager.getConnection(url, props);

			PreparedStatement st = conn.prepareStatement("SELECT * FROM kaiin_jouho");
			ResultSet rs = st.executeQuery();

			while (rs.next()) {
				System.out.println(rs.getString("kaiin_no") + "\t" + rs.getString("kaiin_address"));
			}
			rs.close();
			st.close();
		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

	}
}
