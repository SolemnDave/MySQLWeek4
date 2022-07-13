import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertNBAPlayers {
	
	public static void main(String[] args) {
		String connectionString = "jdbc:mysql://localhost:3306/NBAPlayers";
		String username = "root";
		String password = "password";
	
		try (Connection conn = DriverManager.getConnection(connectionString, username, password)) {
			
			String C = "INSERT INTO leadPlayers (player_name, player_team, player_position, all_star) VALUES (?, ?, ?, ?)";
			
			PreparedStatement statement = conn.prepareStatement(C);
			statement.setString(1, "Stephen Curry");
			statement.setString(2, "Golden State Warriors");
			statement.setString(3, "PG");
			statement.setString(4, "Y");
			
			int rowsInserted = statement.executeUpdate();
			if (rowsInserted > 0) {
				System.out.println("A new player was inserted successfully!");
			}
		
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}

}