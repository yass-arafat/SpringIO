/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author yassir
 */

import entity.*;
import java.util.*;
import model.NewHibernateUtil;
import org.hibernate.*;
public class EmployeeModel {
    
    public List<Employee> getAll(){
        Session s = NewHibernateUtil.getSessionFactory()
                .getCurrentSession();
        List<Employee> lst = new ArrayList<Employee>();
        try{
            s.beginTransaction();
            lst = s.createCriteria(Employee.class).list();
            s.getTransaction().commit();
        } catch (Exception e){
            e.printStackTrace();
        }
        
        return lst;
    }
    
    //Creating create, remove, edit function
    
    public void create(Employee e){
        Session s = NewHibernateUtil.getSessionFactory().getCurrentSession();
        try {
            s.beginTransaction();
            s.save(e);
            s.getTransaction().commit();
//            s.close();
            
        } catch (Exception ex) {
            ex.printStackTrace();
            s.getTransaction().rollback();
        }
    }
    public void remove(Employee e){
        Session s = NewHibernateUtil.getSessionFactory().getCurrentSession();
        try {
            s.beginTransaction();
            s.delete(e);
            s.getTransaction().commit();
//            s.close();
        } catch (Exception ex) {
            ex.printStackTrace();
            s.getTransaction().rollback();
        }
    }
    public void edit(Employee e){
        Session s = NewHibernateUtil.getSessionFactory().getCurrentSession();
        try {
            s.beginTransaction();
            s.update(e);
            s.getTransaction().commit();
//            s.close();
        } catch (Exception ex) {
            ex.printStackTrace();
            s.getTransaction().rollback();
        }
    }
    
    public Employee getEmp(int id){
         Session s = NewHibernateUtil.getSessionFactory().getCurrentSession();
         Employee e = new Employee();
        try {
            s.beginTransaction();
            e = (Employee) s.get(Employee.class, id);
            s.getTransaction().commit();
//            s.close();
        } catch (Exception ex) {
            ex.printStackTrace();
            s.getTransaction().rollback();
        }
        return e;
    }
}
