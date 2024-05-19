package JDBC;
import java.sql.*;
public class jdbc {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/springbootjdbc","root","root");
            PreparedStatement pr = con.prepareStatement("select * from books_collection ");
            ResultSet rs = pr.executeQuery();
            while(rs.next()){
                System.out.println(rs.getString(3));
            }
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
