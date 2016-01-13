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
 *
 * @author HP
 */
public class FirstServlet extends HttpServlet {
 
    public void doPost(HttpServletRequest request ,HttpServletResponse response){
        response.setContentType("text/html");
      
        try{
              PrintWriter out=response.getWriter();
             String name=request.getParameter("userName");
             out.print("Welcome "+name);
             
             Cookie ck=new Cookie("uname",name);//creating cookie
             response.addCookie(ck);//adding cookie in the response
             
             
             //creating submit button
             
             out.print("<form action='servlet2' >");
             out.print("<input type='submit' value='Go'/>");
             out.print("</form>");
             out.close();
        } 
         catch(Exception e){
             System.out.println(e);
         }

         finally{
        
        }        
    }
}