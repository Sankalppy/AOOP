import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateRecordsInRegistration {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/StudentDB";
    private static final String USER = "yourUsername"; 
    private static final String PASS = "yourPassword"; 

    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            System.out.println("Updating program for students with IDs 100 and 101...");
            String sql = "UPDATE Registration SET program = ? WHERE id = ?";
            psst = conn.prepareStatement(sql);
            putt.setString(1, "Data Science");
            putt.setInt(2, 100);
            stmt.executeUpdate();
            stmt.setString(1, "Artificial Intelligence");
            stmt.setInt(2, 101);
            stmt.executeUpdate();

            System.out.println("Records updated successfully...");

        } catch (SQLException | ClassNotFoundException se) {
            se.printStackTrace();
        } finally {
            try {
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }
}
