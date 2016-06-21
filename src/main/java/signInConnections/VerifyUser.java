/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package signInConnections;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author robert
 */
@WebServlet(name = "VerifyUser", urlPatterns = {"/VerifyUser"})
public class VerifyUser extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
       String hisName = request.getParameter("Username");
       String hisPass = request.getParameter("Password");
       
       
       
       
       
       
       //THIS CODE WILL ERASE ALL TEXT IN THE "list.txt" FILE
       PrintWriter writer = new PrintWriter("list.txt");
        writer.print("");
        writer.close();
       ///////////////////////////////////////////////// 
        
        //file_put_contents("list.txt", 'ppppppppppppppppp');
       
       
       //String StinkinFilePath = "C:\\Users\\robert\\Documents\\Parkers\\CS 313\\313Week9\\Web Pages\\StorageUser.txt";
       //String StinkinFilePath = "..\\..\\Web Pages\\StorageUser.txt";
       //

       /*BufferedReader br = new BufferedReader(new FileReader(StinkinFilePath));
       //BufferedReader br = new BufferedReader(new FileReader("StorageUser.txt"));
        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            String everything = sb.toString();
            System.out.println(everything);
        } finally {
            br.close();
        }*/
       
       //System.out.println("hi " + getServletContext().toString());
       //System.out.println("hi " + getServletContext().getInitParameter("storedFilePath"));
       
       
       
       
       System.out.println("hi " + getServletContext().getRealPath("\\"));

       
       if ((hisName.equals("Tom") && (hisPass.equals("Sawyer"))) ||
          (hisName.equals("JJ") && (hisPass.equals("Hawes"))) ||
          (hisName.equals("Jack") && (hisPass.equals("Taylor"))))
       {
           //try (PrintWriter mout = response.getWriter()) {mout.println("<h1>right move</h1>");}
           
            //String name = request.getParameter( "username" );
            //session.setAttribute( "theName", name );
           HttpSession session = request.getSession(true);
           session.setAttribute("help", hisName);
           String userID = (String)session.getAttribute("help");
           
           //go to the right page
           request.getRequestDispatcher("GoodLogin.jsp").forward(request, response);
       }
       else
       {
           request.getRequestDispatcher("BadLogin.jsp").forward(request, response);
       }
       
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet rphServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet rphServlet at " + request.getContextPath() + "</h1>");
            out.println("<h1>His user is " + hisName + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
