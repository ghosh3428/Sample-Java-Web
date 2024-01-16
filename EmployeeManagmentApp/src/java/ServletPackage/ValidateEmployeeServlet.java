
package ServletPackage;

import DatabasePackage.Employee;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "validateEmployeeServlet", urlPatterns = {"/validateEmployeeServlet"})
public class ValidateEmployeeServlet extends HttpServlet 
{

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) 
        {
            String message = "";
            if(request.getParameter("e_address").equals(""))
            {
                message += "<h3 style='color:red'> Address Cannot be empty</h3>";
                
            }
            if(request.getParameter("e_fn").equals(""))
            {
               message += "<h3 style='color:red'> First Name Cannot be empty</h3>"; 
            }
            if(request.getParameter("e_ln").equals(""))
            {
               message += "<h3 style='color:red'> Last Name Cannot be empty</h3>"; 
            }
            if(!(request.getParameter("e_age").equals("")))
            {
                if(Integer.parseInt(request.getParameter("e_age"))<1 || Integer.parseInt(request.getParameter("e_age"))>100)
                {
                   message += "<h3 style='color:red'> Age needs to be 1 to 100 </h3>"; 
                }
            }
            else
            {
                message += "<h3 style='color:red'> Age Cannot be empty</h3>";
            }
            if(!(request.getParameter("e_sal").equals("")))
            {
                if(Integer.parseInt(request.getParameter("e_sal")) < 1000)
                {
                   message += "<h3 style='color:red'>Basic salary needs to more than 1000 </h3>"; 
                }
            }
            else
            {
                message += "<h3 style='color:red'> Salary Cannot be empty</h3>";
            }
            if(!(request.getParameter("e_exp").equals("")))
            {
                if(Integer.parseInt(request.getParameter("e_exp")) < 0)
                {
                   message += "<h3 style='color:red'> Experiance cannot be 0</h3>"; 
                }
            }
            else
            {
                message += "<h3 style='color:red'> Experiance Cannot be empty</h3>";
            }
            if(!(request.getParameter("e_phone").equals("")))
            {
                if(request.getParameter("e_phone").length() != 10)
                {
                   message += "<h3 style='color:red'> Contact Number must have 10 digit</h3>"; 
                }
            }
            else
            {
                message += "<h3 style='color:red'> Contact Number Cannot be empty</h3>";
            }
            
            
            if(message.equals(""))
            {
                RequestDispatcher rd = request.getRequestDispatcher("addServlet");
                rd.forward(request, response);
            }
            else
            {
                RequestDispatcher rd = request.getRequestDispatcher("/employeeaddform.jsp");
                out.print(message);
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
        processRequest(request, response);
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
        processRequest(request, response);
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
