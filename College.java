import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
public class College {
    public static void main(String[] args) {
        String url="jdbc:MySQL://localhost:3306/student";
     String user="root";
     String password="root";
     try{
        Connection con= DriverManager.getConnection(url, user, password);
        Statement st = con.createStatement();
        String sql="insert into college"+"(Name,age,class)"+"values('Matt',13,7)";
        //String sql1="insert into college"+"(Name,age,class)"+"values('Aakansha',19,12)";
        st.executeUpdate(sql);
        //st.executeUpdate(sql1);
        //int rows=st.executUpdate(deletesql);
        System.out.println("insert Complete");
         String sql1="delete from college where name='matt'";
         st.executeUpdate(sql1);
         System.out.println("record delected");
        con.close();
     }
     catch(Exception e){
        e.printStackTrace();
     }
    }
}
