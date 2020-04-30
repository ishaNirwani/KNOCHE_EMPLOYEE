/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import java.io.*;  
import javax.servlet.*;  
import javax.servlet.http.*;  
import java.sql.*;  
    
public class display2 extends HttpServlet  
{    
     public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException 
      {  
         PrintWriter out = res.getWriter();  
         res.setContentType("text/html");  
         out.println("<html><body>");  
         try 
         {  
             Class.forName("com.mysql.jdbc.Driver");  
      	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/knoche_employee","root","root");
             // Here dsnname- mydsn,user id- system(for oracle 10g),password is pintu.  
             Statement stmt = con.createStatement();  
             ResultSet rs = stmt.executeQuery("select * from employee");  
             out.println("<table border=1 width=50% height=50%>");  
             out.println("<tr><th>age</th><th>Name</th><th>Salary</th><th>adhar_number</th><th>bloodGroup</th><th>post</th><tr>");  
//             String adhar_number,String age,String  blood_group,String contact, String gender,String joining_date,String name,int salary,String user_name,String post
             while (rs.next()) 
             {         String s1 = rs.getString("adhar_number");
                 String n = rs.getString("age");
                         String s2 = rs.getString("blood_group");
                 String nm = rs.getString("name"); 
                 
                    String s3 = rs.getString("post");
                 String s = rs.getString("salary");
           
           
                 out.println("<tr><td>" + n + "</td><td>" + nm + "</td><td>" + s + "</td><td>"+s1+ "</td><td>"+s2+ "</td><td>"+s3+"</td></tr>");   
             }  
             out.println("</table>");  
             out.println("</html></body>");  
             con.close();              }  
             catch (Exception e) 
            {  
             out.println("error");  
         }  
     }  
 }  