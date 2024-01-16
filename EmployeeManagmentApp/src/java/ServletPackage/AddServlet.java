
package ServletPackage;

import DatabasePackage.Employee;
import DatabasePackage.EmployeeService;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "addServlet", urlPatterns = {"/addServlet"})
public class AddServlet extends HttpServlet 
{

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException, ClassNotFoundException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) 
        {
            EmployeeService service = new EmployeeService();
            
            Employee emp = new Employee();
            
            emp.setAddress(request.getParameter("e_address"));
            emp.setAge(Integer.parseInt(request.getParameter("e_age")));
            emp.setBasic(Double.parseDouble(request.getParameter("e_sal")));
            emp.setDesignation(request.getParameter("e_desig"));
            emp.setFirstName(request.getParameter("e_fn"));
            emp.setLastName(request.getParameter("e_ln"));
            emp.setPhone(request.getParameter("e_phone"));
            emp.setYearOfExp(Integer.parseInt(request.getParameter("e_exp")));
            
            boolean result = service.insert(emp);
            
            if(result == true)
            {
                RequestDispatcher rd = request.getRequestDispatcher("/employeeaddform.jsp");
                out.print("<h1 class='text-success'>Data Added Successfully</h1>");
                rd.include(request, response);  
            }
            else
            {
                RequestDispatcher rd = request.getRequestDispatcher("/employeeaddform.jsp");
                out.print("<h1 class='text-danger'>Error inserting employee</h1>");
                rd.include(request, response); 
            }
            
            
            
            
           
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(AddServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(AddServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
