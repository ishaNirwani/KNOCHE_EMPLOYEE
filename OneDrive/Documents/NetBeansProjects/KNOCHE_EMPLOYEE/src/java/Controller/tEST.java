/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Bean.employee;
import Dao.employee_declaration;
import Dao.employee_operation_implementation;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.SessionFactory;

/**
 *
 * @author ishan
 */
public class tEST extends HttpServlet {
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException 
{
    SessionFactory sf= Helping_classes.SessionFact.getSessionFact();
    String name,gender,contact,adhar_number,age,post,blood_group,joining_date;
    double salary;
    String user_name;
    name=req.getParameter("name");
        age=req.getParameter("age");
            contact=req.getParameter("contact");
                adhar_number=req.getParameter("adhar");
                    blood_group=req.getParameter("meal_preference");    
                    gender=req.getParameter("gender");
          
              user_name=req.getParameter("user_name"); 
                  salary=Double.parseDouble(req.getParameter("salary"));
                    post=req.getParameter("post");
                    joining_date= req.getParameter("date");
                    employee e= new employee(adhar_number, age,  blood_group, contact,  gender, joining_date,name, (int) salary,user_name,post);
   employee_declaration st=new employee_operation_implementation();
   long id=st.insertEmployee(e);
                    PrintWriter pr=resp.getWriter();
                    if(id>0){
    pr.print("Looks like ishu rocks");}
                    else{pr.print("error");}
    }

}
