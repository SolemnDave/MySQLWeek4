import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteNBAPlayers {

	public static void main(String[] args) throws SQLException {
		String connectionString = "jdbc:mysql://localhost:3306/NBAPlayers";
		String username = "root";
		String password = "password";
		
		try (Connection conn = DriverManager.getConnection(connectionString, username, password)){
			
			String D = "DELETE FROM leadPlayers WHERE player_name=?";
			
			PreparedStatement statement = conn.prepareStatement(D);
			statement.setString(1, "Stephen Curry");
			
			int rowsDeleted = statement.executeUpdate();
			if (rowsDeleted > 0) {
				System.out.println("A user was deleted successfully!");
		}
		}catch (SQLException ex) {
			ex.printStackTrace();
}
}
	}