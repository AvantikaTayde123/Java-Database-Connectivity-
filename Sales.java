import java.sql.*;

class Student{
    public static void main(String args[]){
        Connection con =null;
        try
        {
           Class.forName("com.mysql.cj.jdbc.Driver");
           con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sales","root","root");
           Statement st;
           st=con.createStatement();
           ResultSet rs;
           rs = st.executeQuery("select * from sale");
           int sale_id;
           int product_id;
          // int qty_sold;
           String sale_date;
           float total_price;
           String quantity;
           while(rs.next()){
            sale_id=rs.getInt("sale_id");
            product_id=rs.getInt("Product_id");
           // qty_sold=rs.getInt("Quantity sold");
            sale_date=rs.getString("sale_date");
            total_price=rs.getInt("total_price");
            quantity=rs.getString("Quantity");
            System.out.println("sale id "+sale_id +"  product_id  " +product_id+  "  sale_date  "+sale_date+ "  Total price  "+total_price+"  quantity  "+quantity);
        
        }

        rs.close();
        st.close();
        con.close();
    }
           catch(Exception e){
            System.out.println(e);
            }
}
}
