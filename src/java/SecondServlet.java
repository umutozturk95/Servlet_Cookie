/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
/*
 * @author HP
 */
public class SecondServlet extends HttpServlet {

    public void doGet(HttpServletRequest request,HttpServletResponse response) 
     throws IOException,ServletException{
        
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        Cookie [] ck=request.getCookies();
        out.print("Hello "+ck[0].getValue());
        out.close();
    }

}
