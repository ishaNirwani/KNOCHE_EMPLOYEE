/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Bean.employee;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ishan
 */
public interface employee_declaration {
    
  public long insertEmployee(employee e);
  public  long update(long id,employee e);
  public boolean delete(long id);
  public employee selectEmployee(long id);
  public List<employee> selectAllEmployee();
  public ArrayList serchByName(String name);
}
