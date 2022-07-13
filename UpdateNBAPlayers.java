import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateNBAPlayers {

	public static void main(String[] args) throws SQLException {
		String connectionString = "jdbc:mysql://localhost:3306/NBAPlayers";
		String username = "root";
		String password = "password";
		
		try (Connection conn = DriverManager.getConnection(connectionString, username, password)) {
			
			String U = "UPDATE leadPlayers SET player_team=?, player_position=?, all_star=? WHERE player_name=?";
			
			PreparedStatement ps = conn.prepareStatement(U);
			ps.setString(1, "Golden State Warriors");
			ps.setString(2, "PG");
			ps.setString(3, "Y");
			ps.setString(4, "Stephen Curry");
			
			int rowsUpdated = ps.executeUpdate();
			if (rowsUpdated > 0) {
				System.out.println("An existing player was updated successfully!");
			}
	}catch (SQLException ex) {
		ex.printStackTrace();
	
}
}
	}
