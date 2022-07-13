import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectNBAPlayers {

	public static void main(String[] args) {
		String connectionString = "jdbc:mysql://localhost:3306/NBAPlayers";
		String username = "root";
		String password = "password";
		
		try (Connection conn = DriverManager.getConnection(connectionString, username, password)) {
			
				String R = "SELECT * FROM leadPlayers";
				
				Statement sm = conn.createStatement();
				ResultSet rs = sm.executeQuery(R);
				
				int count = 0;
				
				while (rs.next()) {
					String player_name = rs.getString("player_name");
					String player_team = rs.getString("player_team");
					String player_position = rs.getString("player_position");
					String all_star = rs.getString("all_star");
					
					String output = "User #%d: %s - %s - %s - %s";
					System.out.println(String.format(output, ++count, player_name, player_team, player_position, all_star));
					
				}}
				catch (SQLException ex) {
					ex.printStackTrace();
				{	
		}
	}
		}
}

	
