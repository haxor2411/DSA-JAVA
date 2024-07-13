package JDBC;
import java.sql.*;
public class jdbc {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/springbootjdbc","root","root");

            PreparedStatement pr2 = con.prepareStatement("insert into books_collection(id, author, content, pages, title) values(?, ?, ?, ?, ?)");
            pr2.setInt(1, 5);
            pr2.setString(2, "Akshat Singh Parmar");
            pr2.setString(3, "content of fourth book");
            pr2.setInt(4, 500);
            pr2.setString(5, "My fourth book");
            pr2.executeUpdate();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
//
// Statement stmt  = con .createStatement();
            // String sql = "INSERT INTO books_collection(id, author, content, pages, title) VALUES(755, 'Swati Gupta', '10th book', 8989, '10th')";
            // String sqlUpdate = "UPDATE books_collection SET author = 'Prabal Gupta' WHERE author = 'Swati Gupta'";
            // stmt.executeUpdate(sql);


            // PreparedStatement pr = con.prepareStatement("select * from books_collection ");
            // ResultSet rs = pr.executeQuery();
            // while(rs.next()){
            //     System.out.println(rs.getString(3));
            // }


            // CallableStatement stmt = con.prepareCall("{call insertr(?, ?, ?, ?, ?)}");
            // stmt.setInt(1, 121);
            // stmt.setString(2, "Abhinay Prakash");
            // stmt.setString(3, "content oh tenth book");
            // stmt.setInt(4, 648);
            // stmt.setString(5, "tenth bookk");
            // stmt.execute();