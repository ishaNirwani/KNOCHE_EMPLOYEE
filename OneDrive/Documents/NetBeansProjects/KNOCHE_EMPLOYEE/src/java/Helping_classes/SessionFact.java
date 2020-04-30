/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helping_classes;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 *
 * @author ishan
 */
public class SessionFact{
    static SessionFactory sf;
    //environment 
    private static ServiceRegistry serviceRegistry;
    //commands for building session
    public static SessionFactory getSessionFact()  {
    Configuration cfg=new Configuration();
    cfg.configure("/Resourse/hibernate.cfg.xml");
    serviceRegistry= new StandardServiceRegistryBuilder().applySettings(
    cfg.getProperties()).build();
    sf=cfg.buildSessionFactory(serviceRegistry);
    return sf; //"build session factory"
    }
}
