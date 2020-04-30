/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Bean.employee;
import java.util.ArrayList;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author ishan
 */
public class employee_operation_implementation implements employee_declaration{
       
    SessionFactory sf;
    Session ss;
    Transaction tr;
    
    public employee_operation_implementation (){
        sf=Helping_classes.SessionFact.getSessionFact();
        ss=sf.openSession();
    }
    
    @Override
      public long insertEmployee(employee e) {
      tr=ss.beginTransaction();
      System.err.println(" "+e.getName());
      long l=(Long) ss.save(e);
      tr.commit();
      if(l>0)
      {
          return 1;
      }
      else
      {
          return 0;
      }
    }



   

    @Override
    public long update(long id, employee e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public employee selectEmployee(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList selectAllEmployee() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList serchByName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
