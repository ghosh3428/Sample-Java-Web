package DatabasePackage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeService {

    DatabaseConfig obj;
    String query;
    PreparedStatement pst;
    ResultSet rs;
    Statement st;

    public EmployeeService() {
        obj = new DatabaseConfig();
    }

    public boolean insert(Employee e) throws SQLException, ClassNotFoundException {
        Connection con = obj.getConnection();
        try {
            query = "insert into employee_details(firstName ,lastname ,age ,designation,phone ,address,salary,yearofexp) values(?,?,?,?,?,?,?,?);";

            pst = con.prepareStatement(query);

            pst.setString(1, e.getFirstName());
            pst.setString(2, e.getLastName());
            pst.setInt(3, e.getAge());
            pst.setString(4, e.getDesignation());
            pst.setString(5, e.getPhone());
            pst.setString(6, e.getAddress());
            pst.setDouble(7, e.getBasic());
            pst.setInt(8, e.getYearOfExp());

            pst.executeUpdate();

            con.close();

            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            con.close();
            return false;
        }

    }
    
    public Employee search(int id)throws Exception
    {
        Connection con = obj.getConnection(); 
        
        query = "select * from employee_details where id = ?; ";
        pst = con.prepareStatement(query);
        
        pst.setInt(1, id);
        
        rs = pst.executeQuery();
        
        if(rs.next())
        {
            Employee e = new Employee();
            
            e.setAddress(rs.getString(7));
            e.setAge(rs.getInt(4));
            e.setBasic(rs.getDouble(8));
            e.setDesignation(rs.getString(5));
            e.setFirstName(rs.getString(2));
            e.setId(rs.getInt(1));
            e.setLastName(rs.getString(3));
            e.setPhone(rs.getString(6));
            e.setYearOfExp(rs.getInt(9));
            
            return e;
        }
        else
        {
            return null;
        }
        
    }
    
    

}
