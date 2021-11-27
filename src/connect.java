import java.sql.*;

public class connect {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment","root","");
                    Statement s= con.createStatement();
                    ResultSet rs = s.executeQuery("select * from emp");){
                    System.out.println("Connection Established successfully");
                }
                catch (Exception e) {
                    System.out.println("Connection could not be established.");
                }

    }
}
