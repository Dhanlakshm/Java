import java.sql.*;

public class DB_Connection {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        //1. Loding and resgitering you driver class
        //forNAme---> Class
        Class.forName("com.mysql.cj.jdbc.Driver");

        //2. establish the connection(db url, username, password)
        String url="jdbc:mysql://localhost:3306/employee_db?createDatabaseIfNotExist=true";
        Connection con=DriverManager.getConnection(url,"root","tiger");
        System.out.println("DB connection done");

        //3.creating platform to execute sql queries ---> Statement
        Statement st=con.createStatement();
        String s1="create table if not exists employee(emp_id int primary key, name varchar(20), email varchar(20))";
         st.execute(s1);
        System.out.println("tables created");

        //insert
        String s2="insert ignore into employee values(1,'Riya','riya@gmail.com')";
        int r2=st.executeUpdate(s2);
        System.out.println(r2+" rows inserted");

        String s3="insert ignore into employee values(2,'Siya','siya@gmail.com')";
        st.executeUpdate(s3);

        //update
        String s4="update employee set email='nsam@gmail.com' where emp_id=2";
        st.executeUpdate(s4);
        System.out.println("row updated");

        //delete
        String s5="delete from employee where emp_id=2";
        st.executeUpdate(s5);
        System.out.println("row deleted");

        //select ---> DQL --->
        String s6="select * from employee";
        ResultSet set=st.executeQuery(s6);
        while(set.next())
        {
            System.out.println(set.getInt("emp_id"));
            System.out.println(set.getString("name"));
            System.out.println(set.getString("email"));
        }
    }
}
