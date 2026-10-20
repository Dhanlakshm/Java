import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DB_connection1 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        //1
        Class.forName("com.mysql.cj.jdbc.Driver");
        //2.
        String url="jdbc:mysql://localhost:3306/student_db?createDatabaseIfNotExist=true";
        Connection con=DriverManager.getConnection(url,"root","tiger");
        System.out.println("db created");

        //3.
        String s1="create table if not exists student(id int primary key, name varchar(20), email varchar(20))";
        PreparedStatement p1=con.prepareStatement(s1);
        p1.execute();
        System.out.println("table created");

        //insert
        String s2="insert ignore into student values(?,?,?)";
        PreparedStatement p3=con.prepareStatement(s2);
        p3.setInt(1,1);
        p3.setString(2,"diya");
        p3.setString(3,"diya@gmail.com");
        int rows=p3.executeUpdate();
        System.out.println(rows+" rows inserted");

//        PreparedStatement p4=con.prepareStatement(s2);
//        p4.setInt(1,2);
//        p4.setString(2,"siya");
//        p4.setString(3,"siya@gmail.com");


        //update
        String s3="update student set name=? where id=?";
        PreparedStatement p5=con.prepareStatement(s3);
        p5.setString(1,"seema");
        p5.setInt(2,1);
        p5.executeUpdate();


        //delete
        String s4="delete from student where id=?";
        PreparedStatement p6=con.prepareStatement(s4);
        p6.setInt(1,1);
        p6.executeUpdate();

    }
}
