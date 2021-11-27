import java.sql.*;

public class Connect2 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment","root","");
        Statement s = con.createStatement();
        ResultSet rs = s.executeQuery("SELECT empno, ename FROM emp");
        try{
            while(rs.next()){
                System.out.println("Empno: " + rs.getInt(1));
                System.out.println("Ename: " + rs.getString("ename"));
            }
        }catch (SQLException e){
            System.out.println("Connection not established");
        }
    }
}
